/**
 * Invocador - Switch
 */
public class SwitchLampara {
  Command command;
  
  public SwitchLampara(Command command){
    this.command = command;
  }
  
  public void presionarSwitch(){
    command.ejecutar();
  }
  
  public void setCommand(Command command){
    this.command = command;
  }
}
