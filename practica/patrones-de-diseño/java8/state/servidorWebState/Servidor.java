/**
 * Context
 */
public class Servidor {
  private EstadoServidor estado;
  
  public Servidor(){
    estado = new EstadoEncendido();
  }
  
  public void setEstado(EstadoServidor nuevoEstado){
    estado = nuevoEstado;
  }
  
  public void encender(){
    estado.encender(this);
  }
  
  public void reiniciar(){
    estado.reiniciar(this);
  }
  
  public void bloquear(){
    estado.bloquear(this);
  }
  
  public void apagar(){
    estado.apagar(this);
  }
  
  public void imprimirEstado(){
    estado.imprimirEstado();
  }
}
