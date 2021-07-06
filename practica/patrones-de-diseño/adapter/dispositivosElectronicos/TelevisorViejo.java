/**
 * Adaptee (es la clase que debo adaptar, adecuar al target que es la interfaz "Conectable")
 * 
 * No le vamos a dedicar tanto a esta parte, es solo para probar el patrón
 */
public class TelevisorViejo {
  private String sentidoPerilla;
  private boolean encendido;
  
  public TelevisorViejo(){
    System.out.println("Estamos adaptando un televisor viejo..");
                         
    sentidoPerilla = "izquierda";
    encendido = false;
  }
  
  public void girarPerillaADerecha(){
    System.out.println("Girando perilla a derecha previo a encender televisor viejo");
    
    sentidoPerilla = "derecha";
  }
  
  public void girarPerillaAIzquierda(){
    System.out.println("Girando perilla a izquierda previo a apagar televisor viejo");
    
    sentidoPerilla = "izquierda";
  }
  
  public void presionarBoton(){
    if(sentidoPerilla == "derecha"){
      System.out.println("Presionado botón, el dispositivo se encenderá");
      encendido = true;
    }
    else if(sentidoPerilla == "izquierda"){
      System.out.println("Presionado botón, el dispositivo se apagará");
      encendido = false;
    }
  }
  
}
