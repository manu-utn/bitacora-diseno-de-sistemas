/**
 * Concrete Command - Guardar
 */
public class CommandGuardar implements Command{
  private EditorTexto nombreArchivo;
  
  // constructor
  public CommandGuardar(EditorTexto nombreArchivo){
    this.nombreArchivo = nombreArchivo;
  }
  
  @Override
  public String ejecutar(){
    return nombreArchivo.accionGuardar();
  }
}
