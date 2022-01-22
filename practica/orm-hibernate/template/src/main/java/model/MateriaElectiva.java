package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class MateriaElectiva extends Materia {
	private int creditos;

  protected MateriaElectiva(){ }

	public int getCreditos() {
    return creditos;
}

public void setCreditos(int creditos) {
    this.creditos = creditos;
}

    public MateriaElectiva(String nombre) {
		this.nombre = nombre;
	}

	public boolean esPromocionable() {
		return false;
	}

	public String getNombre() {
		return nombre;
	}
}
