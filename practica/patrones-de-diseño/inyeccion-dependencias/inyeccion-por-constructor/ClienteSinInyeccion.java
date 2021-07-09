/**
 * Cliente - Sin inyección de dependencias
 * 
 * 
 */
public class ClienteSinInyeccion {
  private IServicioBaseDeDatos conexion;
  
  public ClienteSinInyeccion(){
    // - Hay un gran nivel de "acoplamiento" con SQLSeverDB
    conexion = new SQLServerDB();
  }
  
  public void buscarCliente(Cliente cliente){
    conexion.buscarPorID("clientes", cliente.getID());
  }
}
