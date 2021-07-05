/**
 * Cliente 
 */
public class UsuarioJugandoConEditor {
  
  public static void main(String[] args) { 
    
    EditorTexto editor = new EditorTexto();
    
    Command commandAbrir = new CommandAbrir(editor);
    Command commandCerrar = new CommandCerrar(editor);
    Command commandGuardar = new CommandGuardar(editor);
    
    // es importante el orden de los parámetros
    // deben coincidir con el constructor
    MenuOpciones menu = new MenuOpciones(commandAbrir, commandCerrar, commandGuardar);
    
    menu.clickBotonAbrir();
    menu.clickBotonGuardar();
    menu.clickBotonCerrar();    
  }
}
