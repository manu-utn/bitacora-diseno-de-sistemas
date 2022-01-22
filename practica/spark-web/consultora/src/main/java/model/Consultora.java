package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Consultoras")
public class Consultora {

  @Id
  @GeneratedValue
  private long id;

  private String nombre;

  @Column(name = "cantidad_empleados")
  private int cantidadEmpleados;

  //@OneToMany(mappedBy = "consultoraEncargada")
  @OneToMany
  @JoinColumn(name="proyectiles")
  private Collection<Proyecto> proyectos;
  // private Collection<Proyecto> proyectos;

  @OneToMany
  private Collection<Proyecto> proyectitos;

  protected Consultora() {
  }

  public Consultora(String nombre, int cantidadDeEmpleados) {
    this.nombre = nombre;
    this.cantidadEmpleados = cantidadDeEmpleados;
    this.proyectos = new ArrayList<>();
  }

  public void asignar(Proyecto proyecto) {
    proyectos.add(proyecto);
    proyecto.asignarA(this);
  }

  public int getCantidadEmpleados() {
    return cantidadEmpleados;
  }

  public String getNombre() {
    return nombre;
  }

  public Collection<Proyecto> getProyectos() {
    return proyectos;
  }

  public long getId() {
    return id;
  }

    public String getUrl(){
        return "consultoras/" + getId();
    }

}
