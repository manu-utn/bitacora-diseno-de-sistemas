/**
 * Auto Generated Java Class.
 */
public class TestServidor {
  
  public static void main(String[] args) { 
    // el servidor arranca con estado encendido
    Servidor servidorWeb = new Servidor();
    
    // dará aviso que ya está encendido.. lo apagaremos y encenderemos
    servidorWeb.encender();
    servidorWeb.apagar();
    servidorWeb.encender();
    
    // quedará colgado "reiniciando", lo apagaremos a la fuerza
    servidorWeb.reiniciar();    
    servidorWeb.encender();
    servidorWeb.apagar();
    
    // lo encendemos, bloqueamos, ahora no podremos hacer nada mas, quedará bloqueado :(
    servidorWeb.encender();
    servidorWeb.bloquear();

    servidorWeb.reiniciar();    
    servidorWeb.encender();
    servidorWeb.apagar();

  }
  
}
