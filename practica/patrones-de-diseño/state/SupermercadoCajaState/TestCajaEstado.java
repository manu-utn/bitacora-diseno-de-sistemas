/**
 * Auto Generated Java Class.
 */
public class TestCajaEstado {
  
  public static void main(String[] args) {
    // la caja tendrá el estado cerrado por defecto
    Caja cajaUno = new Caja(1, "Carlos");
    Persona pedro = new Persona("Pedro", 21);
    Persona maria = new Persona("Maria", 88);
    
    cajaUno.abrir();
    cajaUno.atender(pedro);
    
    // vamos a cerrarla para que no pueda atender a Pedro :(
    // pero si podrá atender a Maria por ser mayor de edad :)
    cajaUno.cerrar();
    cajaUno.atender(pedro);
    cajaUno.atender(maria);
    
    // ahora Pedro podrá ser atendido, porque el estado de la caja es abierta
    cajaUno.abrir();
    cajaUno.atender(pedro);
  }
  
}
