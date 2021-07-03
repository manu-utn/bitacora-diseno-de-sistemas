import junit.framework.TestCase;

public class BebidaTest extends TestCase {  
  public void testElCafeSeSirveEnVasoChico() {
    CafeBuilder bebida = new CafeBuilder();
    bebida.preparar();
    Bebida cafe = bebida.getBebida();
    
    assertEquals(TamanioVaso.CHICO, cafe.getTamanioVaso());
  }
  
  public void testElTeSeSirveEnVasoMediano() {
    TeBuilder bebida = new TeBuilder();
    bebida.preparar();
    Bebida te = bebida.getBebida();
    
    assertEquals(TamanioVaso.MEDIANO, te.getTamanioVaso());
  }
  
  public void testElCafeNoLlegaAHervor(){
    CafeBuilder bebida = new CafeBuilder();
    bebida.preparar();
    Bebida cafe = bebida.getBebida();
    
    assertTrue(cafe.getTemperatura() < 100);
  }
  
  public void testElTeLlegaAlos65(){
    TeBuilder bebida = new TeBuilder();
    bebida.preparar();
    Bebida te = bebida.getBebida();
    
    assertEquals(65, te.getTemperatura());
  }  
}
