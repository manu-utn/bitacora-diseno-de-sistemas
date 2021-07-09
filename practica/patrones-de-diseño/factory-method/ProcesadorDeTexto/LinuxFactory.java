/**
 * Auto Generated Java Class.
 */
public class LinuxFactory implements DocumentoFactory{
  @Override
  public Documento getDocumento(String tipo, String nombreArchivo){
    if("pdf".equalsIgnoreCase(tipo)){
      System.out.println("Instalando paquetes de linux para archivos pdf..");
      
      return new DocumentoPDF(nombreArchivo);
    }
    else if("word".equalsIgnoreCase(tipo)){
      
      System.out.println("Instalando paquetes de linux para archivos word..");
      return new DocumentoWord(nombreArchivo);
    }
    
    throw new IllegalArgumentException("No existe este tipo de documento");
  }
}
