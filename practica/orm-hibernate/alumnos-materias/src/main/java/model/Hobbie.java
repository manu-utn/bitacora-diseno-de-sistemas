package model;

import javax.persistence.Embeddable;

@Embeddable
public class Hobbie{
	private String comentario;

	public Hobbie(String comentario) {
      this.comentario = comentario;
	}

}
