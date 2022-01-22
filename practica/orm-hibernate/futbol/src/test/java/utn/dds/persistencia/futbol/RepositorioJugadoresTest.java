package utn.dds.persistencia.futbol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import utn.dds.persistencia.futbol.persistence.Jugador;
import utn.dds.persistencia.futbol.persistence.RepositorioJugadores;

public class RepositorioJugadoresTest extends AbstractPersistenceTest implements WithGlobalEntityManager{

    @Before
    public void init() {
        // armamos el fixture
        entityManager().persist(crearJugador("marcos"));
        entityManager().persist(crearJugador("marcos"));
        entityManager().persist(crearJugador("sebas"));
    }

    @Test
    public void testFiltrarPorNombre() {
        RepositorioJugadores repositorioJugadores = new RepositorioJugadores();
        final List<Jugador> jugadores = repositorioJugadores.filtrarPorNombre("marcos");
        Assert.assertEquals(2, jugadores.size());

        Assert.assertEquals("marcos", jugadores.get(0).getNombre());
        Assert.assertEquals("marcos", jugadores.get(1).getNombre());
    }

    @Test
    public void testComienzaConTresJugadores(){
        RepositorioJugadores repositorioJugadores = new RepositorioJugadores();
        List<Jugador> jugadores = repositorioJugadores.todos();

        Assert.assertEquals(3, jugadores.size());
    }

    /**
     * Métodos Auxiliares
     */
    private Jugador crearJugador(String nombre) {
        Jugador jugador = new Jugador();
        jugador.setNombre(nombre);
        return jugador;
    }
}
