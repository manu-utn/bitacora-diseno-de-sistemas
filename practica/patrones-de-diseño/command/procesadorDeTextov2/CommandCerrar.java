/**
 * Concrete Command - Cerrar
 */
public class CommandCerrar implements Command{
  private EditorTexto nombreArchivo;
  
  // constructor
  public CommandCerrar(EditorTexto nombreArchivo){
    this.nombreArchivo = nombreArchivo;
  }
  
  @Override
  public String ejecutar(){
    return nombreArchivo.accionCerrar();
  }
}
