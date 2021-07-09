/**
 * Auto Generated Java Class.
 */
public class Persona {
  private String nombre;
  private int edad;
  
  public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public boolean esMayorDeEdad(){
    return edad > 65;
  }
}
