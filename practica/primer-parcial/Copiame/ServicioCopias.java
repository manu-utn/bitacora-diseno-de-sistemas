/**
 * Auto Generated Java Class.
 */
public class ServicioCopias extends Servicio{
  @Override
  public void analizar(){
    //documentos.any(doc -> esIgualA());
    documentos.forEach(doc -> doc.esIgualA(doc));
  }
}
