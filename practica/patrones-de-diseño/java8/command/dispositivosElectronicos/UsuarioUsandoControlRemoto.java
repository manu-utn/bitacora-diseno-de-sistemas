/**
 * Client
 */
import java.util.List;
import java.util.ArrayList;

public class UsuarioUsandoControlRemoto {
  
  public static void main(String[] args) {     
    DispositivoElectronico lampara = new DispositivoLampara();
    DispositivoElectronico televisor = new DispositivoTelevisor();
    
    List<DispositivoElectronico> dispositivos = new ArrayList<DispositivoElectronico>();
    dispositivos.add(lampara);
    dispositivos.add(televisor);
    
    Command encenderLampara = new CommandEncender(lampara);
    Command apagarLampara = new CommandApagar(lampara);
    
    Command encenderTelevisor = new CommandEncender(televisor);
    Command apagarTelevisor = new CommandApagar(televisor);
    
    Command apagarTodos = new CommandApagarTodos(dispositivos);
    
    ControlRemoto controlRemoto = new ControlRemoto(encenderLampara);
    controlRemoto.presionarBoton();
    
    controlRemoto.setCommand(encenderTelevisor);
    controlRemoto.presionarBoton();

    controlRemoto.setCommand(apagarTodos);
    controlRemoto.presionarBoton();
  }
  
}
