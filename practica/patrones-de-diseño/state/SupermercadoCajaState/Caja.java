/**
 * Context
 */
public class Caja {
  private EstadoCaja estado;
  
  private int numeroCaja;
  private String nombreCajero;
  
  // constructor
  public Caja(int numeroCaja, String nombreCajero){
    // por defecto estará cerrada
    estado = new CajaCerrada();
    this.numeroCaja = numeroCaja;
    this.nombreCajero = nombreCajero;
  }
  
  public void abrir(){
    estado.abrir(this);
  }
  
  public void cerrar(){
    estado.cerrar(this);
  }
  
  public void atender(Persona persona){
    estado.atender(persona);
  }
  
  public void setEstado(EstadoCaja nuevoEstado){
    estado = nuevoEstado;
  }
  
  // estos son adicionales, no forman parte del patrón
  public String getNombreCajero(){
    return nombreCajero;
  }
  
  public int getNumeroCaja(){
    return numeroCaja;
  }
}
