/**
 * Concrete Builder - Cafe
 */
public class CafeBuilder extends BebidaBuilder{
  @Override
  public void calentarAgua(){    
    bebida.setTemperatura(80);
  }
  
  @Override
  public void agregarExtras(){
    bebida.setTipo("dulce");
  }
  
  @Override
  public void servir(){
    bebida.setTamanioVaso(TamanioVaso.CHICO);
  }
}
