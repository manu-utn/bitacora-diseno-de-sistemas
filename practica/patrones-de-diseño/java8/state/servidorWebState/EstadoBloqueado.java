/**
 * Concrete State
 */
public class EstadoBloqueado implements EstadoServidor{
  @Override
  public void encender(Servidor servidor){
    System.out.println("No se puede utilizar el servidor, se encuentra bloqueado. Comuníquese con Soporte..");
  }
  
  @Override
  public void reiniciar(Servidor servidor){
    System.out.println("No se puede utilizar el servidor, se encuentra bloqueado. Comuníquese con Soporte..");
  }
  
  @Override
  public void bloquear(Servidor servidor){
    System.out.println("No se puede utilizar el servidor, se encuentra bloqueado. Comuníquese con Soporte..");
  }

    @Override
  public void apagar(Servidor servidor){
    System.out.println("No se puede utilizar el servidor, se encuentra bloqueado. Comuníquese con Soporte..");
  }

  @Override
  public void imprimirEstado(){
    System.out.println("El servidor está bloqueado");
  }
}
