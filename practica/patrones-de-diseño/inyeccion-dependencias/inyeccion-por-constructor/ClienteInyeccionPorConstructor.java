/**
 * Cliente - Con inyección de dependencias por Constructor
 */
public class ClienteInyeccionPorConstructor{
  // creamos un atributo para guardar la referencia
  private IServicioBaseDeDatos conexion;
  
  // constructor
  public ClienteInyeccionPorConstructor(IServicioBaseDeDatos conexion){
    // nos desligamos de la creación del objeto, 
    // lo recibiremos ya creado (instancia) por parámetro en el constructor
    this.conexion = conexion;
  }
  
  public void buscarCliente(Cliente cliente){
    conexion.buscarPorID("clientes", cliente.getID());
  }
}
