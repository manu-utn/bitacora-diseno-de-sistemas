/**
 * Concrete Command - Cerrar
 */
public class CommandCerrar implements Command{
  private EditorTexto editor;
  
  // constructor
  public CommandCerrar(EditorTexto editor){
    this.editor = editor;
  }
  
  @Override
  public void ejecutar(){
    editor.accionCerrar();
  }
  
  @Override
  public String getNombre(){
    return "cerrar";
  }
}
