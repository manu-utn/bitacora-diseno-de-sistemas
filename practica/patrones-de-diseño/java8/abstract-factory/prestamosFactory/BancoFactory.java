/**
 * Concrete Factory - Fabrica de Bancos
 */
public class BancoFactory extends SistemaFactory{
  // si usaramos una clase genérica, nos evitariamos agregar este mensaje crearPrestamo
  @Override
  public Prestamo crearPrestamo(String tipoPrestamo){
    return null;
  }
  
  @Override
  public Banco crearBanco(String nombreBanco){
    if(nombreBanco.equalsIgnoreCase("BancoCiudad")){
      return new BancoCiudad();
    }
    else if(nombreBanco.equalsIgnoreCase("BancoProvincia")){
      return new BancoProvincia();
    }
    
    return null;
  }
}
