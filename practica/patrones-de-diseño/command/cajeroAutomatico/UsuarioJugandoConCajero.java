/**
 * Client
 */
public class UsuarioJugandoConCajero {
  
  public static void main(String[] args) { 
    Cuenta cuenta = new Cuenta(100150, 1500);
    
    TecladoCajero tecladoCajero = new TecladoCajero();
    
    tecladoCajero.presionarBoton(new OperacionDepositar(cuenta, 500));
    tecladoCajero.presionarBoton(new OperacionDepositar(cuenta, 500));
    
    tecladoCajero.realizarOperaciones();
    
    tecladoCajero.deshacerOperaciones();
  }
 
}
