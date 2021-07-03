/**
 * Concrete Builder - Cafe
 */
public class TeBuilder extends BebidaBuilder{
  @Override
  public void calentarAgua(){    
    bebida.setTemperatura(65);
  }
  
  @Override
  public void agregarExtras(){
    bebida.setTipo("amargo");
  }
  
  @Override
  public void servir(){
    bebida.setTamanioVaso(TamanioVaso.MEDIANO);
  }
}
