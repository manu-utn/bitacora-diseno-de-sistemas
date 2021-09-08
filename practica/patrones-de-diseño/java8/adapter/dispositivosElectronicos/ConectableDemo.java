/**
 * Cliente
 */
public class ConectableDemo {
  
  public static void main(String[] args) { 
    Conectable dispositivoEletronico;
    
    dispositivoEletronico = new TelevisorModerno();
    dispositivoEletronico.encender();
    dispositivoEletronico.apagar();
    
    dispositivoEletronico = new RadioDigital();
    dispositivoEletronico.encender();
    dispositivoEletronico.apagar();
    
    dispositivoEletronico = new TelevisorViejoAdaptador();
    dispositivoEletronico.encender();
    dispositivoEletronico.apagar();    
  }
  
}
