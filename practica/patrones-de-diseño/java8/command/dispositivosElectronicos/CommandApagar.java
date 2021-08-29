/**
 * Concrete Command - Apagar
 */
public class CommandApagar implements Command{
  DispositivoElectronico dispositivo;
  
  public CommandApagar(DispositivoElectronico dispositivo){
    this.dispositivo = dispositivo;
  }
  
  public void ejecutar(){
    dispositivo.accionApagar();
  }
}
