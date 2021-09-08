/**
 * Invocador - Menu de Opciones del Editor de texto (Ej. el típico toolbar)
 * 
 * - con un historial de las acciones/operaciones realizadas
 * - en el add() no se evalua la existencia o no de la operación en el historial
 * porque se quiere conservar cada acción
 */
import java.util.List;
import java.util.ArrayList;

public class MenuOpciones {
  private Command command;
  private final List<Command> historialAcciones = new ArrayList<>();

  public String clickBoton(Command concreteCommand){
    historialAcciones.add(concreteCommand);
    
    return concreteCommand.ejecutar();
  }
}
