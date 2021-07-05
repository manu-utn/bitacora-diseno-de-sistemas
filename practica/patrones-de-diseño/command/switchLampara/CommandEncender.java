/**
 * Concrete Command - Encender
 */
public class CommandEncender implements Command{
  Lampara receptor;
  
  public CommandEncender(Lampara receptor){
    this.receptor = receptor;
  }
  
  public void ejecutar(){
    receptor.accionEncender();
  }
}
