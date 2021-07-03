/**
 * Concrete Product - Banco Provincia
 */
public class BancoProvincia implements Banco{
   // por ser "final" será una constante, no puede cambiar su valor una vez inicializada
  private final String nombre;
  
  public BancoProvincia(){ // constructor
    nombre = "Banco Provincia"; // inicializamos esta variable
  }
  
  @Override
  public String getNombre(){
    return nombre;
  }
}
