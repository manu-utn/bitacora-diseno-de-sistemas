/**
 * Concrete Builder - Cafe
 * 
 * - Cada ConcreteBuilder implementa sus pasos de manera diferente
 * - Agrega sentido particular al Abstract Builder
 */
public class CafeBuilder implements BebidaBuilder{
  Cafe bebida;
 
  public CafeBuilder(){ // constructor
    bebida = new Cafe();
  }
  
  public Cafe getBebida(){
    return bebida;
  }
    
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
