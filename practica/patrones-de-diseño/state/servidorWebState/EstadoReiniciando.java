/**
 * Concrete State
 */
public class EstadoReiniciando implements EstadoServidor{
  @Override
  public void encender(Servidor servidor){
    System.out.println("No se puede encender, el servidor está siendo reiniciado..");
  }
  
  @Override
  public void reiniciar(Servidor servidor){
    System.out.println("No se puede reiniciar, el servidor ya está siendo reiniciado..");
  }
  
  @Override
  public void bloquear(Servidor servidor){
    System.out.println("No se puede bloquear, el servidor está siendo reiniciado..");
  }
  
  @Override
  public void apagar(Servidor servidor){
    servidor.setEstado(new EstadoApagado());
    System.out.println("Apagando forzosamente el servidor..");
  }
  
  @Override
  public void imprimirEstado(){
    System.out.println("El servidor se está reiniciando..");
  }
}
