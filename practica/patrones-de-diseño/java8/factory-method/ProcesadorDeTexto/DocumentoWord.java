/**
 * 
 */
public class DocumentoWord extends Documento{
  
  public DocumentoWord(String nombre){
    this.nombre = nombre;
    
    System.out.println("Gracias por usar nuestros servicios, cargando biblotecas para Word..");
  }
  
  @Override
  public void abrir(){
    System.out.println("Abriendo archivo Word..");
  }
  
  @Override
  public void cerrar(){
    System.out.println("Cerrando archivo Word..");
  }
  
  @Override
  public void guardar(){
    System.out.println("Guardadno archivo Word..");
  }
  
}
