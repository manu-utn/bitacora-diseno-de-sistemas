import junit.framework.TestCase;

public class BebidaTest extends TestCase {  
  public void testElCafeSeSirveEnVasoChico() {
    Cafeteria cafeteria = new Cafeteria();        
    CafeBuilder cafeBuilder = new CafeBuilder();
    
    // el Director dice al Concrete Builder -> paso1(), paso2(), ..
    cafeteria.prepararBebida(cafeBuilder);
    
    Cafe cafe = cafeBuilder.getBebida();

    assertEquals(TamanioVaso.CHICO, cafe.getTamanioVaso());
  }
  
}
