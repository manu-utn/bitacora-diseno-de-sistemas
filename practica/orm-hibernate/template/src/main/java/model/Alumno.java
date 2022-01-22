package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno extends PersistentEntity {
    private String nombre;

  @Enumerated(value = EnumType.STRING)
  private Inscripcion inscripcion;

  @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "alumno_id")
	private Collection<Cursada> cursadas = new ArrayList<>();

  protected Alumno(){ }

  public Alumno(String nombre){
      this.nombre = nombre;
  }

	public Collection<Cursada> getCursadas() {
		return cursadas;
	}

    public void agregarCursada(Cursada nuevaCursada){
        cursadas.add(nuevaCursada);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
