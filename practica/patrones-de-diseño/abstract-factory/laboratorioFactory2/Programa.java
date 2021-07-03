/**
 * Auto Generated Java Class.
 */
public class Programa {
  public static LaboratorioFactory getFactory(String factory){
    if("Animal".equalsIgnoreCase(factory)){
      return new AnimalFactory();
    }
    else if("Color".equalsIgnoreCase(factory)){
      return new ColorFactory();
    }
    
    return null;
  }
}
