package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Pieza {
    private String nombre;
    private Number precio;
    //private Imagen imagen;

    @Enumerated
    TipoDeCoccion tipoDeCoccion;

    @OneToMany
    Collection<Ingrediente> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
