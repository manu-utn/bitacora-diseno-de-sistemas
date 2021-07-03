import junit.framework.TestCase;

/** A JUnit test case class.
  * Every method starting with the word "test" will be called when running
  * the test with JUnit.
  */
public class LaboratorioTest extends TestCase {
  
  /** A test method.
    * (Replace "X" with a name describing the test.  You may write as
    * many "testSomething" methods in this class as you wish, and each
    * one will be called when running JUnit over this class.)
    */
  public void testUnTigreHaceGrrr() {
    LaboratorioFactory laboratorio = Programa.getFactory("animal");
    Animal tigre = laboratorio.crearAnimal("tigre");
    
    assertEquals("grrr" ,tigre.grunir());
  }
  
  
  public void testPuedeCrearUnLeonNaranja() {
    LaboratorioFactory laboratorio;
    
    laboratorio = Programa.getFactory("animal");
    Animal animal = laboratorio.crearAnimal("leon");

    laboratorio = Programa.getFactory("color");
    Color color = laboratorio.crearColor("naranja");

    assertEquals("naranja", color.getColor());
    assertEquals("Leon", animal.getAnimal());
  }
  
  
}
