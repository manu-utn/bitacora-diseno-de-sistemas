/**
 * 
 */
public abstract class Documento {
  protected String nombre;
  
  public abstract void abrir();
  public abstract void cerrar();
  public abstract void guardar();
  
  public String getNombre(){
    return nombre;
  }
}
