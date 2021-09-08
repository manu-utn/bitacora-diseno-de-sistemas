/**
 * Auto Generated Java Class.
 */
public class TestEstadoPantalla {
  
  public static void main(String[] args) { 
    // el celular arranca en estado "apagado"
    PantallaCelular pantalla = new PantallaCelular();
    
    // intentamos presionar la pantalla del celular apagado
    pantalla.presionarPantalla();
    // pasará al estado de encendido
    pantalla.presionarBotonEncendido();

    // abriremos alguna aplicacion del celular
    pantalla.presionarPantalla();
    // pasará a estado apagado
    pantalla.presionarBotonEncendido();
    // pasará a estado encendido
    pantalla.presionarBotonEncendido();

    // cambiamos el estado de manera "explícita"
    // osea nosotros lo hacemos de manera directa
    //
    // los otros cambios de estados eran de forma "implícita"
    // porque no lo determinabamos nosotros, si no la pantalla
    pantalla.setEstado(new EstadoStandby());
    pantalla.presionarPantalla();
    pantalla.presionarBotonEncendido();
  }
  
}
