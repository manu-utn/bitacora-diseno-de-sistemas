/**
 * Adapter
 */
public class TelevisorViejoAdaptador implements Conectable{
  TelevisorViejo televisorViejo = new TelevisorViejo();
  
  @Override
  public void encender(){
    System.out.println("Encendiendo televisor viejo con adaptador..");
    
    televisorViejo.girarPerillaADerecha();
    televisorViejo.presionarBoton();
  }
  
  @Override
  public void apagar(){
    System.out.println("Apagando televisor viejo con adaptador..");
    
    televisorViejo.girarPerillaAIzquierda();
    televisorViejo.presionarBoton();
  }
}
