/**
 * Concrete State
 */
public class EstadoEncendido implements EstadoPantalla{
  @Override
  public void presionarPantalla(PantallaCelular pantalla){
    System.out.println("Abriendo alguna aplicación del celular..");
  }
  
  @Override
  public void presionarBotonEncendido(PantallaCelular pantalla){
    System.out.println("Apagando el celular...");
    
    pantalla.setEstado(new EstadoApagado());
  }
}
