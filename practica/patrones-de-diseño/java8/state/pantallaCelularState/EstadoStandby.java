/**
 * Concrete State
 */
public class EstadoStandby implements EstadoPantalla{
  @Override
  public void presionarPantalla(PantallaCelular pantalla){
    System.out.println("Desbloqueando el celular...");
  }
  
  @Override
  public void presionarBotonEncendido(PantallaCelular pantalla){
    System.out.println("Apagando el celular...");
    
    pantalla.setEstado(new EstadoApagado());
  }
}
