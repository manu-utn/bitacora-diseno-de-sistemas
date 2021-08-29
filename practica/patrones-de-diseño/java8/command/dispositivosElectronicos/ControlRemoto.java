/**
 * Auto Generated Java Class.
 */
public class ControlRemoto {
  private Command command;
  
  public ControlRemoto(Command command){
    this.command = command;
  }
  
  public void presionarBoton(){
    command.ejecutar();
  }
  
  public void setCommand(Command command){
    this.command = command;
  }
}
