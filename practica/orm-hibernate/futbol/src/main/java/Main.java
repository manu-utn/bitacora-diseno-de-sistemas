import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;
import utn.dds.persistencia.futbol.persistence.Jugador;

public class Main{
    public static void main(String[] args){
        final EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        /*
        Jugador fofito = new Jugador();
        fofito.setNombre("fofito");
        transaction.begin();
        entityManager.persist(fofito);
        transaction.commit();

        System.out.println(fofito.getId());

        // el ORM no hará una query con SELECT,
        // porque recuerda tener en la caché a este objeto
        Jugador fofito2 = entityManager.find(Jugador.class, fofito.getId());
        System.out.println(fofito.equals(fofito2)); // true

        // idem, el ORM no hará una query con SELECT,
        Jugador fofito3 = entityManager.find(Jugador.class, fofito.getId());
        System.out.println(fofito.equals(fofito3)); // true

        // obligamos al ORM Hibernate que se olvide de las entidades que guardó en la caché
        entityManager.clear();
        // el ORM hará otra query,
        // porque no tiene en la caché la identidad del object fofito
        Jugador fofito4 = entityManager.find(Jugador.class, fofito.getId());
        System.out.println(fofito.equals(fofito4)); // false
        */

        /**
         * 1. Creamos una instancia de jugador, le asignamos los datos
         * 2. Persistimos al jugador dentro de una transacción
         * 3. Confirmamos la transacción
         */

        /*
        Jugador jugador = new Jugador();
        jugador.setNombre("jorgito");
        jugador.setPosicion("delantero");

        transaction.begin();
        entityManager.persist(jugador);
        transaction.commit();
        */

        /**
         * 1. Buscamos al objeto con id=3, y lo imprimimos
         * 2. Cambiamos sus datos y lo volvemos a imprimir
         * 3. Lo borramos de la base de datos (si estuviese relacionado con una FK, fallaría el DELETE)
         */

        /*
        Jugador jugador = entityManager.find(Jugador.class, new Long(4));
        System.out.println(jugador.getNombre() + " " + jugador.getPosicion() + " " + jugador.getId());

        transaction.begin();
        jugador.setNombre("pekillme");
        transaction.rollback();
        //transaction.commit();

        // el rollback() solo vuelve al estado anterior en el "modelo de objetos" osea en la base de datos,
        // pero no hace rollback del estado del "modelo de objetos"
        // por tanto éste imprimirá el nombre "pekillme"
        System.out.println(jugador.getNombre() + " " + jugador.getPosicion() + " " + jugador.getId());

        jugador = entityManager.find(Jugador.class, new Long(4));
        System.out.println(jugador.getNombre() + " " + jugador.getPosicion() + " " + jugador.getId());

        // Removemos el registro del objeto que se persistió
        // transaction.begin();
        // entityManager.remove(jugador);
        // transaction.commit();
        */

        /**
         * Imprimimos una lista de objetos
         */
        /*
        final List<Jugador> jugadores = entityManager.createQuery("from Jugador").getResultList();
        for(Jugador jug : jugadores){
            System.out.println(jug.getNombre() + "" + jug.getPosicion() + " " + jug.getId());
        }
        */
    }
}
