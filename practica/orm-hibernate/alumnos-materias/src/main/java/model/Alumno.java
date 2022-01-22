package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.CollectionTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;

@Entity
@Table(name = "alumnos")
public class Alumno extends PersistentEntity {
    private String nombre;

  @Embedded
  @ElementCollection
  @CollectionTable(name="alumno_hobbies")
  List<Hobbie> hobbies = new ArrayList<>();

  @Enumerated(value = EnumType.STRING)
  private Inscripcion inscripcion;

  @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "alumnito_id")
	private Collection<Cursada> cursadas = new ArrayList<>();

  @OneToOne
  @JoinColumn(name="cursada_bestone", referencedColumnName="id")
  private Cursada cursadaFavorita;

  @ElementCollection
  //@CollectionTable(name="laspreferencias")
  @Column(name="preferenciasFavoritas")
  private List<String> preferencias;

  @ManyToMany(cascade = { CascadeType.ALL })
  //@JoinTable(name = "alumnos_companieros" )
  List<Alumno> companieros;

  protected Alumno(){ }

  public Alumno(String nombre){
      this.nombre = nombre;
      this.preferencias = new ArrayList<>();
      this.companieros = new ArrayList<>();
  }

    public void setCursadaFavorita(Cursada cursada){
        this.cursadaFavorita = cursada;
    }

	public Collection<Cursada> getCursadas() {
		return cursadas;
	}
    
    public void agregarHobbie(Hobbie hobbie) {
        hobbies.add(hobbie);
    }

    public void agregarCursada(Cursada nuevaCursada){
        cursadas.add(nuevaCursada);
    }

    public void agregarCompaniero(Alumno alumno){
        companieros.add(alumno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
