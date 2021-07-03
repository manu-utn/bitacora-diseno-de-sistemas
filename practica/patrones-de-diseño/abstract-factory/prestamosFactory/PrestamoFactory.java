/**
 * Concrete Factory - Fabrica de Prestamos
 */
public class PrestamoFactory extends SistemaFactory{
  // si usaramos una clase genérica, nos evitariamos agregar este mensaje crearBanco
  @Override
  public Banco crearBanco(String nombreBanco){
    return null;
  }
  
  @Override
  public Prestamo crearPrestamo(String tipoPrestamo){
    if(tipoPrestamo.equalsIgnoreCase("PrestamoFamiliar")){
      return new PrestamoFamiliar();
    }
    else if(tipoPrestamo.equalsIgnoreCase("PrestamoPYME")){
      return new PrestamoPYME();
    }
    else if(tipoPrestamo.equalsIgnoreCase("PrestamoEstudiantil")){
      return new PrestamoEstudiantil();
    }
    
    return null;
  }
}
