/**
 * Auto Generated Java Class.
 */
public class ServicioPlagios extends Servicio{
  private Documento original;
  
  @Override
  public void analizar(){
    copias.forEach(copia -> copia.equalsTo(original) );
  }
  
  public void cargarOriginal(Documento doc){
  }
}
