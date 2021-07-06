/**
 * Auto Generated Java Class.
 */
public class ServicioFirmaDigital {
  public void firmar(Documento doc){
    System.out.println("Firmando el documento de manera digital " + doc.getTitulo());
    
    doc.setFirmado(true);
  }
}
