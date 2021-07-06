/**
 * Receptor - Editor de Texto
 */
public class EditorTexto {    
  private String nombreArchivo;
  private String mensaje;
  
  public EditorTexto(String nombreArchivo){
    this.nombreArchivo = nombreArchivo;
  }
  
  public String accionAbrir(){
    mensaje = "Abriendo el archivo " + nombreArchivo;
    System.out.println(mensaje);
    return mensaje;
  }
  
  public String accionCerrar(){
    mensaje = "Cerrando el archivo " + nombreArchivo;
    System.out.println(mensaje);
    return mensaje;
  }
  
  public String accionGuardar(){
    mensaje = "Guardando los cambios del archivo " + nombreArchivo;
    System.out.println(mensaje);
    return mensaje;
  }
}
