/**
 * Concrete Command - Encender
 */
public class CommandApagar implements Command{
  Lampara receptor;
  
  public CommandApagar(Lampara receptor){
    this.receptor = receptor;
  }
  
  public void ejecutar(){
    receptor.accionApagar();
  }
}
