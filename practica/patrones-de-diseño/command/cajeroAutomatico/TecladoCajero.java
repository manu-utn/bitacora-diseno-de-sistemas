/**
 * Invocador - Teclado del Cajero Automático
 */

import java.util.List;
import java.util.ArrayList;

public class TecladoCajero {
  List<Operacion> operaciones = new ArrayList<>();
  
  public void presionarBoton(Operacion operacion){
    operaciones.add(operacion);
    
    // lo comentamos porque podemos realizar varias operaciones
    // y luego podemos pedirle al cajero que realice todas
    // operacion.ejecutar();
  }
  
  public void realizarOperaciones(){
    System.out.println("Realizando operaciones..");
    // en el forEach la expresión "operación" es un lambda (función anónima)
    operaciones.forEach(operacion -> operacion.ejecutar());
    
    // nos aseguramos que no hay más elementos
    // operaciones.clear();

    // alternativa al forEach
    /* 
    for(Operacion operacion : operaciones){
      operacion.ejecutar();
    }
    */
  }
  
  public void deshacerOperaciones(){
    System.out.println("Deshaciendo operaciones realizadas..");
    
    operaciones.forEach(operacion -> operacion.deshacerOperacion());
  }
}
