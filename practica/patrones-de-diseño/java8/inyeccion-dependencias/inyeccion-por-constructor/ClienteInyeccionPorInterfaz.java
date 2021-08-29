/**
 * Cliente - Con inyección de dependencias por Interfaz
 */

// - implementamos la interfaz que vamos a inyectar (nos obliga a implementarla)
public class ClienteInyeccionPorInterfaz implements IServicioBaseDeDatosInjector{
  private IServicioBaseDeDatos conexion;
  
  // implementamos el metodo que inyecta la dependencia de la interfaz
  @Override
  public void inject(IServicioBaseDeDatos conexion){
    this.conexion = conexion;
  }
  
  public void buscarCliente(Cliente cliente){
    conexion.buscarPorID("clientes", cliente.getID());
  }
}
