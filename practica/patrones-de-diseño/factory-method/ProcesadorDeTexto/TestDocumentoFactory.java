/**
 * Auto Generated Java Class.
 */
public class TestDocumentoFactory {
  
  public static void main(String[] args) { 
    DocumentoFactory windowsFactory = new WindowsFactory();
    
    Documento resumenDDS = windowsFactory.getDocumento("pdf", "resumen diseño");
    Documento resumenSSL = windowsFactory.getDocumento("pdf", "resumen sintaxis");
    Documento resumenGDD = windowsFactory.getDocumento("word", "resumen gdd");
    
    // este va a lanzar una excepción
    Documento resumen = windowsFactory.getDocumento("aaa", "resumen gdd");
  }
  
}
