/**
 * Concrete Command - Abrir
 */
public class CommandAbrir implements Command{
  private EditorTexto editor;
  
  // constructor
  public CommandAbrir(EditorTexto editor){
    this.editor = editor;
  }
  
  @Override
  public void ejecutar(){
    editor.accionAbrir();
  }
  
  @Override
  public String getNombre(){
    return "abrir";
  }
}
