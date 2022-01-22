package model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
class Ingrediente extends PersistentEntity{
    private String nombre;

    @Enumerated
    Categoria categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
