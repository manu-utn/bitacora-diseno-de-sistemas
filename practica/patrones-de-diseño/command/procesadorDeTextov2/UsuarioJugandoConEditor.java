/**
 * Cliente 
 */
public class UsuarioJugandoConEditor {
  
  public static void main(String[] args) { 
    
    MenuOpciones menu = new MenuOpciones();
   
    menu.clickBoton(new CommandAbrir(new EditorTexto("pepe.txt")));
    menu.clickBoton(new CommandGuardar(new EditorTexto("pepe.txt")));
    menu.clickBoton(new CommandCerrar(new EditorTexto("pepe.txt")));   
    
    menu.clickBoton(() -> "probando.txt");
  }
}
