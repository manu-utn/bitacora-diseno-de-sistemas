/**
 * Concrete Factory - Colores
 */
public class ColorFactory extends LaboratorioFactory{  
  @Override
  public Color crearColor(String color){
    if("Blanco".equalsIgnoreCase(color)){
      return new ColorBlanco();
    }
    else if("Naranja".equalsIgnoreCase(color)){
      return new ColorNaranja();
    }
    
    return null;
  }
  
  @Override
  public Animal crearAnimal(String animal){
    return null;
  }
}
