/**
 * Concrete Command - Abrir
 */
public class CommandAbrir implements Command{
  private EditorTexto nombreArchivo;
  
  // constructor
  public CommandAbrir(EditorTexto nombreArchivo){
    this.nombreArchivo = nombreArchivo;
  }
  
  @Override
  public String ejecutar(){
    return nombreArchivo.accionAbrir();
  }
}
