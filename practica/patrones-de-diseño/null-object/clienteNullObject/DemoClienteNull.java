/**
 * Auto Generated Java Class.
 */
import java.util.HashMap;
import java.util.Map;

public class DemoClienteNull {
  public static void main(String[] args){
    /*
    String[] clientesPremium = {"premium", "perez", "samuel"};
    
    Cliente cliente;
    
    for(String nombre : clientesPremium){
     cliente = ClienteFactory.crearCliente(nombre, "premium"); 
     
     System.out.println(cliente.getNombre());
    }
    */

    /*************************************************************/
    
    
    HashMap<String, String> clientes = new HashMap<>();
    clientes.put("carlos", "premium");
    clientes.put("perez", "premium");
    clientes.put("samuel", "fallara"); // <--- 
    
    // sin el patrón nullObject, la llamada a crearCliente
    // lanzaria una excepción del tipo "NullPointerException"
    for(Map.Entry<String, String> unCliente : clientes.entrySet()){
      Cliente cliente = ClienteFactory.crearCliente(unCliente.getKey(), unCliente.getValue()); 
      
      System.out.println(cliente.getNombre());
    }
    
  }
}
