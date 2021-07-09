/**
 * Concrete State
 */
public class CajaCerrada implements EstadoCaja{
  @Override
  public void abrir(Caja caja){
    System.out.println("Abriendo la caja número "+ caja.getNumeroCaja());
    
    caja.setEstado(new CajaAbierta());
  }
  
  @Override
  public void cerrar(Caja caja){
    System.out.println("La caja número "+caja.getNumeroCaja()+" ya estaba cerrada");
  }
  
  @Override
  public void atender(Persona persona){
    if(persona.esMayorDeEdad()){
      System.out.println("Caso excepcional por ser mayor de edad, estamos atendiendo a "+persona.getNombre());
    }else{
      System.out.println("La caja está cerrada, no podemos atenderlo "+ persona.getNombre());
    }
  }
}
