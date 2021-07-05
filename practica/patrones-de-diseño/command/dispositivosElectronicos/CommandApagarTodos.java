/**
 * Concrete Command - Apagar todos los dispositivos
 */
import java.util.List;

public class CommandApagarTodos implements Command{
  List<DispositivoElectronico> dispositivos;
  
  public CommandApagarTodos(List<DispositivoElectronico> dispositivos){
    this.dispositivos = dispositivos;
  }
  
  public void ejecutar(){
    System.out.println("Apagando todos los dispositivos..");
    
    for(DispositivoElectronico dispositivo : dispositivos){
      dispositivo.accionApagar();
    }
  }
}
