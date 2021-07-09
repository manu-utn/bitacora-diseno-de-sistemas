/**
 * Auto Generated Java Class.
 */
public class TestTransporteFactory {  
  
  public static void main(String[] args) { 
    TransporteFactory transporteFactory = new TransporteFactory();
    
    Transporte avionDeGuerra = transporteFactory.getTransporte("avion");
    Transporte submarinoDeCombate = transporteFactory.getTransporte("submarino");
    Transporte trenDeTurismo = transporteFactory.getTransporte("tren");
    
    avionDeGuerra.reparar();
    avionDeGuerra.conducir();
    
    submarinoDeCombate.reparar();
    submarinoDeCombate.conducir();
    
    trenDeTurismo.reparar();
    trenDeTurismo.conducir();
    
  }
  
}
