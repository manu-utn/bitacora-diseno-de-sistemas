/**
 * Auto Generated Java Class.
 */
public class ServicioImprimir {
  public void imprimir(Documento doc){
    System.out.println("Imprimiendo documento " + doc.getTitulo());
    doc.setImpreso(true);
  }
}
