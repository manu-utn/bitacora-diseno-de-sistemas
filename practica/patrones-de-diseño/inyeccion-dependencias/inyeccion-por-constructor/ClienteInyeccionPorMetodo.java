/**
 * Cliente - Con inyección de dependencias por Método
 */
public class ClienteInyeccionPorMetodo {  
  // Método "buscarCliente"
  // - Pasamos la dependencia por el método que necesite la dependencia
  public void buscarCliente(Cliente cliente, IServicioBaseDeDatos conexion){
    conexion.buscarPorID("clientes", cliente.getID());
  }
}
