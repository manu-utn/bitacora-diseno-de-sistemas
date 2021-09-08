/**
 * Invocador - Menu de Opciones del Editor de texto
 * (Ej. el típico toolbar)
 */
import java.util.HashMap;
import java.util.Map;

public class MenuOpciones {
  private Map<String, Command> concreteCommands;
  
  public MenuOpciones(){
    // lo inicializamos
    concreteCommands = new HashMap<>();
  }
  
  public void clickBoton(String nombreBoton){
    concreteCommands.get(nombreBoton).ejecutar();
  }
  
  public void addConcreteCommand(Command concreteCommand){
    this.concreteCommands.put(concreteCommand.getNombre(), concreteCommand);
  }
  
}
