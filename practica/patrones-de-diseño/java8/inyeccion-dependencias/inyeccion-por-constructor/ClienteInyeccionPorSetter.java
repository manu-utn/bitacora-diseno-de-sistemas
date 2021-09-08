/**
 * Cliente - Con inyección de dependencias por Setter
 */
public class ClienteInyeccionPorSetter {
  // creamos un atributo para guardar la referencia
  private IServicioBaseDeDatos conexion;
  
  // Setter
  // - Pasamos la dependencia por el setter
  // - Podemos cambiarla en tiempo de ejecución durante todo su ciclo de vida del objeto
  public void setConexion(IServicioBaseDeDatos conexion){
    this.conexion = conexion;
  }
  
  public void buscarCliente(Cliente cliente){
    conexion.buscarPorID("clientes", cliente.getID());
  }
}
