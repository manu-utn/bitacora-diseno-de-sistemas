package persistence;

import java.util.Collection;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import model.Alumno;

public class RepositorioAlumnos implements WithGlobalEntityManager {
    public void registrar(Alumno alumno){
        entityManager().persist(alumno);
    }

	@SuppressWarnings("unchecked")
  public Collection<Alumno> filtrarPorNombre(String nombre){
      return entityManager()
          .createQuery("from Alumno WHERE nombre = :nombre")
          .setParameter("nombre", nombre)
          .getResultList();
    }
}
