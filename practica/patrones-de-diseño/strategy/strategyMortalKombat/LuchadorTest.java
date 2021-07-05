import junit.framework.TestCase;

/** A JUnit test case class.
  * Every method starting with the word "test" will be called when running
  * the test with JUnit.
  */
public class LuchadorTest extends TestCase {
  
  /** A test method.
    * (Replace "X" with a name describing the test.  You may write as
    * many "testSomething" methods in this class as you wish, and each
    * one will be called when running JUnit over this class.)
    */
  public void testGoroPuedeCambiarDePunietazosYRecordarSuNombre() {
    PunietazoPerforante punietazoPerforante = new PunietazoPerforante();
    PunietazoSangrante punietazoSangrante = new PunietazoSangrante();
    PatadaRapida patada = new PatadaRapida();
    
    Luchador goro = new Goro(punietazoSangrante, patada);
    goro.darPunietazo();
    
    goro.setPunietazo(punietazoPerforante);
    goro.darPunietazo();
    
    assertEquals("Goro", goro.getNombre());
  }
  
}
