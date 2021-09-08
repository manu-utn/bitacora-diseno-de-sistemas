import junit.framework.TestCase;

public class BebidaTest extends TestCase {  
  public void testElCafeSeSirveEnVasoChico() {
    BebidaBuilder bebida = new CafeBuilder();
    bebida.preparar();
    Bebida cafe = bebida.getBebida();
    
    assertEquals(TamanioVaso.CHICO, cafe.getTamanioVaso());
  }
  
  public void testElTeSeSirveEnVasoMediano() {
    BebidaBuilder bebida = new TeBuilder();
    bebida.preparar();
    Bebida te = bebida.getBebida();
    
    assertEquals(TamanioVaso.MEDIANO, te.getTamanioVaso());
  }
  
  public void testElCafeNoLlegaAHervor(){
    BebidaBuilder bebida = new CafeBuilder();
    bebida.preparar();
    Bebida cafe = bebida.getBebida();
    
    assertTrue(cafe.getTemperatura() < 100);
  }
  
  public void testElTeLlegaAlos65(){
    BebidaBuilder bebida = new TeBuilder();
    bebida.preparar();
    Bebida te = bebida.getBebida();
    
    assertEquals(65, te.getTemperatura());
  }  
}
