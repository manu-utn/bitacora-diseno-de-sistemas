import junit.framework.TestCase;

/** A JUnit test case class.
  * Every method starting with the word "test" will be called when running
  * the test with JUnit.
  */
public class CocheTest extends TestCase {
  
  /** A test method.
    * (Replace "X" with a name describing the test.  You may write as
    * many "testSomething" methods in this class as you wish, and each
    * one will be called when running JUnit over this class.)
    */
  public void testCocheModernoEsRapido() {
    BuilderCoche cocheModerno = new BuilderCocheModerno();
    cocheModerno.construir();
    Coche bmw = cocheModerno.getCoche();

    assertTrue(bmw.getVelocidad() >= 300);
  }
  
  public void testCocheModernoEsLento(){
    BuilderCoche cocheAntiguo = new BuilderCocheAntiguo();
    cocheAntiguo.construir();
    
    Coche fiat = cocheAntiguo.getCoche();
    
    assertTrue(fiat.getVelocidad() < 300);
  }
  
}
