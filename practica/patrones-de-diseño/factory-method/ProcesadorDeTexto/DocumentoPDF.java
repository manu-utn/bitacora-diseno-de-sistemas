/**
 * 
 */
public class DocumentoPDF extends Documento{
  
  public DocumentoPDF(String nombre){
    this.nombre = nombre;
    
    System.out.println("Cargando paquetes para archivos PDF..");
  }
  
  @Override
  public void abrir(){
    System.out.println("Abriendo archivo PDF..");
  }
  
  @Override
  public void cerrar(){
    System.out.println("Cerrando archivo PDF..");
  }
  
  @Override
  public void guardar(){
    System.out.println("Guardadno archivo PDF..");
  }
  
}
