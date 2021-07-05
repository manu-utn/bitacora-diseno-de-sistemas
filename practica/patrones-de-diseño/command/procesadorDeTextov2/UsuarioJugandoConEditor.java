/**
 * Cliente 
 */
public class UsuarioJugandoConEditor {
  
  public static void main(String[] args) { 
    
    EditorTexto editor = new EditorTexto();
    
    MenuOpciones menu = new MenuOpciones();
    menu.addConcreteCommand(new CommandAbrir(editor));
    menu.addConcreteCommand(new CommandCerrar(editor));
    menu.addConcreteCommand(new CommandGuardar(editor));
    
    menu.clickBoton("abrir");
    menu.clickBoton("guardar");
    menu.clickBoton("cerrar");   
  }
}
