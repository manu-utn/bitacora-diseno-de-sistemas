/**
 * Client
 */
public class JugandoConElSwitch {
  
  public static void main(String[] args) {     
    Lampara lamparaModerna = new Lampara();

    CommandEncender commandEncender = new CommandEncender(lamparaModerna);
    CommandApagar commandApagar = new CommandApagar(lamparaModerna);    

    SwitchLampara switchLampara = new SwitchLampara(commandEncender);
        
    switchLampara.presionarSwitch(); // se enciende

    switchLampara.setCommand(commandApagar);
    switchLampara.presionarSwitch(); // se apaga
    
    switchLampara.setCommand(commandEncender);
    switchLampara.presionarSwitch(); // se enciende
  }
  
}
