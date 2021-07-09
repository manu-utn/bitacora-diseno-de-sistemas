/**
 * Concrete State
 */
public class CajaAbierta implements EstadoCaja{
  @Override
  public void abrir(Caja caja){
    System.out.println("La caja "+caja.getNumeroCaja()+" ya estaba abierta a cargo de " + caja.getNombreCajero());
  }
  
  @Override
  public void cerrar(Caja caja){
    System.out.println("Cerrando la caja número "+ caja.getNumeroCaja());
    
    caja.setEstado(new CajaCerrada());
  }
  
  @Override
  public void atender(Persona persona){
    System.out.println("Estamos atendiendo a "+persona.getNombre());
  }
}
