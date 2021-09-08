/**
 * Auto Generated Java Class.
 */
public class TransporteFactory implements ITransporteFactory {
  @Override
  public Transporte getTransporte(String tipo){
    if("avion".equalsIgnoreCase(tipo)){
      return new Avion();
    }
    else if("tren".equalsIgnoreCase(tipo)){
      return new Tren();
    }
    else if("submarino".equalsIgnoreCase(tipo)){
      return new Submarino();
    }
    
    return new NullTransporte();
  }
}
