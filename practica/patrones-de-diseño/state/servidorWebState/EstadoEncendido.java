/**
 * Concrete State
 */
public class EstadoEncendido implements EstadoServidor{
  @Override
  public void encender(Servidor servidor){
    System.out.println("El servidor ya se encuentra encendido");
  }
  
  @Override
  public void reiniciar(Servidor servidor){
    servidor.setEstado(new EstadoReiniciando());
    
    System.out.println("El servidor está siendo reiniciado..");
  }
  
  @Override
  public void bloquear(Servidor servidor){
    servidor.setEstado(new EstadoBloqueado());
    
    System.out.println("El servidor está siendo bloqueado..");    
  }
  
  @Override
  public void apagar(Servidor servidor){
    servidor.setEstado(new EstadoApagado());
    
    System.out.println("El servidor está siendo apagado..");
  }
  
  @Override
  public void imprimirEstado(){
    System.out.println("El servidor está encendido");
  }
}
