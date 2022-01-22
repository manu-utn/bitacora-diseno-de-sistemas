package utn.dds.persistencia.futbol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import utn.dds.persistencia.futbol.persistence.Jugador;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  // ===========================================
  // Ojo, ¡esto no es un test propiamente dicho!
  // ===========================================
  
  
  @Test
  public void test() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setPosicion("11");

    assertNull(dani.getId());

    entityManager().persist(dani); // hago persistible a dani

    assertNotNull(dani.getId());
    
    // agregamos una nueva instancia:
    Jugador caro = new Jugador();
    caro.setNombre("Dani");
    caro.setPosicion("11");

    entityManager().persist(caro);

    assertNotNull(dani.getId()); 
    assertNotEquals(dani.getId(), caro.getId());
    
    Jugador dani2 = entityManager().find(Jugador.class, dani.getId());

    assertEquals(dani2.getId(), dani.getId()); // esto no debería resultar extraño
    assertSame(dani2, dani); // y esto tampoco, al fin y al cabo estamos recuperando un objeto que ya tenemos, ¿no?
   
    // ¿Perro qué pasa si limpio en el medio el entity manager? 
    entityManager().clear(); 

    Jugador dani3 = entityManager().find(Jugador.class, dani.getId());

    assertEquals(dani3.getId(), dani.getId()); // bien
    assertNotSame(dani3, dani); 
  
  }
}
