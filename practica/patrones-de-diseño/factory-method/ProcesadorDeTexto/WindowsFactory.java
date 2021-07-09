/**
 * Auto Generated Java Class.
 */
public class WindowsFactory implements DocumentoFactory{
  @Override
  public Documento getDocumento(String tipo, String nombreArchivo){
    if("pdf".equalsIgnoreCase(tipo)){
      System.out.println("Cagando bibliotecas de windows para archivos pdf..");
      
      return new DocumentoPDF(nombreArchivo);
    }
    else if("word".equalsIgnoreCase(tipo)){
      
      System.out.println("Cagando bibliotecas de windows para archivos word..");
      return new DocumentoWord(nombreArchivo);
    }
    
    throw new IllegalArgumentException("No existe este tipo de documento");
  }
}
