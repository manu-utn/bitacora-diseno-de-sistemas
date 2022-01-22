package app;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import model.Alumno;
import model.Cursada;
import model.Materia;

public class Main{
    public static void main(String[] args) {
        final EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Materia materia = entityManager.createQuery("from Materia", Materia.class).setMaxResults(1).getResultList().get(0);
        System.out.println(materia.getClass());
        // Alumno alumno = entityManager.createQuery("from Alumno", Alumno.class).setMaxResults(1).getResultList().get(0);
        // Alumno pedrito = entityManager.find(Alumno.class, 1);
        // Alumno pedrito = (Alumno) entityManager.createQuery("from Alumno WHERE nombre = 'pedrito'").singleResult();

        /*
        System.out.println("Consultando por pedrito...");
        String unNombre = "pedrito";
        Alumno alumno = (Alumno) entityManager
            .createQuery("from Alumno WHERE nombre = :nombre")
            .setParameter("nombre", unNombre).getSingleResult();

        System.out.println("Consultando por las cursadas de " + alumno.getNombre());
        Collection<Cursada> cursadas = alumno.getCursadas(); // esto hará otra query
        System.out.println("tiene " + cursadas.size() + "cursadas");
        */

        // for(Cursada cursada : cursadas){
        //     System.out.println("cursadaID: " + cursada.getId());
        //     //System.out.println(cursada.getMateria());
        // }

       // List<Alumno> alumnos = entityManager.createQuery("from Alumno").getResultList();
       // for (Alumno alumno : alumnos)  System.out.println(alumno.getNombre());
    }
}
