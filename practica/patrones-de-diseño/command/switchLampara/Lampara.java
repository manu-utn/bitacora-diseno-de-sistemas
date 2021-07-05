/**
 * Receptor - Lampara
 */
public class Lampara {
  private boolean encendido;
  
  public void accionEncender(){
    encendido = true;
    System.out.println("Lampara encendida");
  }
  
  public void accionApagar(){
    encendido = false;
    System.out.println("Lampara apagada");
  }
}
