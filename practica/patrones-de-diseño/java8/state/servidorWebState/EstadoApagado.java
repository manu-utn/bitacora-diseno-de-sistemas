/**
 * Concrete State
 */
public class EstadoApagado implements EstadoServidor{
  @Override
  public void encender(Servidor servidor){
    servidor.setEstado(new EstadoEncendido());

    System.out.println("El servidor está siendo encendido..");
  }
  
  @Override
  public void reiniciar(Servidor servidor){    
    System.out.println("No se puede reiniciar, el servidor está apagado..");
  }
  
  @Override
  public void bloquear(Servidor servidor){    
    System.out.println("No se puede bloquear, el servidor está apagado..");
  }  
  
  @Override
  public void apagar(Servidor servidor){    
    System.out.println("El servidor ya se encuentra apagado");
  }
  
  @Override
  public void imprimirEstado(){
    System.out.println("El servidor está apagado");
  }
}
