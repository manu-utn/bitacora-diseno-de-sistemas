/**
 * Factory Creator
 */
public class Aplicacion {
  public static SistemaFactory getFactory(String factory){
    if(factory.equalsIgnoreCase("Banco")){
      return new BancoFactory();
    }
    else if(factory.equalsIgnoreCase("Prestamo")){
      return new PrestamoFactory();
    }
    
    return null;
  }
}
