/**
 * Concrete Product - Banco ciudad
 */
public class BancoCiudad implements Banco{
  // por ser "final" será una constante, no puede cambiar su valor una vez inicializada
  private final String nombre;
  
  public BancoCiudad(){
    nombre = "Banco Ciudad";
  }
  
  @Override
  public String getNombre(){
    return nombre;
  }
}
