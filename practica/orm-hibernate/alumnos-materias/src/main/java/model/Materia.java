package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "tipo")
// public class Materia{
public abstract class Materia extends PersistentEntity {
	// @Id
  // @GeneratedValue(strategy = GenerationType.TABLE) // <- necesario para que funcione el table_per_class
  // private Long id;

	@Column(nullable=false)
	protected String nombre;

    public boolean esPromocionable(){
        return false;
    }
    //public abstract boolean esPromocionable();

	public String getNombre() {
		return nombre;
	}

	// Mas comportamiento común

}
