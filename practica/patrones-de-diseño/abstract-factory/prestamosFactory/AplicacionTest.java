import junit.framework.TestCase;

/** A JUnit test case class.
  * Every method starting with the word "test" will be called when running
  * the test with JUnit.
  */
public class AplicacionTest extends TestCase {
  
  /** A test method.
    * (Replace "X" with a name describing the test.  You may write as
    * many "testSomething" methods in this class as you wish, and each
    * one will be called when running JUnit over this class.)
    */
  public void testLosInteresesDeUnPrestamoParaPYMEesElDobleEnCualquierBanco() {
    SistemaFactory sistemaFactory;
    
    sistemaFactory = Aplicacion.getFactory("banco");
    Banco banco = sistemaFactory.crearBanco("bancoCiudad");
    
    sistemaFactory = Aplicacion.getFactory("prestamo");
    Prestamo prestamo = sistemaFactory.crearPrestamo("PrestamoPYME");
    prestamo.calcularIntereses(500);
    
    assertEquals("Banco Ciudad", banco.getNombre());
    assertEquals(1000, prestamo.getIntereses());
  }
  
}
