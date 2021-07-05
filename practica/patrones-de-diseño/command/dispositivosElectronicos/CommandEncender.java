/**
 * Concrete Command - Encender
 */
public class CommandEncender implements Command{
  DispositivoElectronico dispositivo;
  
  public CommandEncender(DispositivoElectronico dispositivo){
    this.dispositivo = dispositivo;
  }
  
  public void ejecutar(){
    dispositivo.accionEncender();
  }
}
