/**
 * Auto Generated Java Class.
 */
public class PantallaCelular {
  private EstadoPantalla estadoPantalla;
  
  public PantallaCelular(){
    estadoPantalla = new EstadoApagado();
  }
  
  public void presionarPantalla(){
    estadoPantalla.presionarPantalla(this);
  }
  
  public void presionarBotonEncendido(){
    estadoPantalla.presionarBotonEncendido(this);
  }
  
  public void setEstado(EstadoPantalla nuevoEstado){
    estadoPantalla = nuevoEstado;
  }
}
