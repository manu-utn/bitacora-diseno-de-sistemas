/**
 * Auto Generated Java Class.
 */
public class ClienteFactory {
  public static Cliente crearCliente(String nombre, String tipo){
    if("premium".equalsIgnoreCase(tipo)){
      return new ClientePremium(nombre);
    }
    else if("normal".equalsIgnoreCase(tipo)){
      return new ClienteNormal(nombre);
    }
    
    // - si no cumple con ninguno, retornamos nuestro nullObject
    // - si intentan crear un objeto que no es de la factoría, no lanzará nullPointerException
    return new NullCliente();
  }
}
