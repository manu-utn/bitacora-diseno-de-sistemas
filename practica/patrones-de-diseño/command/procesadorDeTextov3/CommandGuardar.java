/**
 * Concrete Command - Guardar
 */
public class CommandGuardar implements Command{
  private EditorTexto editor;
  
  // constructor
  public CommandGuardar(EditorTexto editor){
    this.editor = editor;
  }
  
  @Override
  public void ejecutar(){
    editor.accionGuardar();
  }
  
  @Override
  public String getNombre(){
    return "guardar";
  }
}
