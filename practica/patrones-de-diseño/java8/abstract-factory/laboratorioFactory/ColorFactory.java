/**
 * Concrete Factory - Colores
 */
public class ColorFactory implements LaboratorioFactory<Color>{  
  @Override
  public Color crear(String color){
    if("Blanco".equalsIgnoreCase(color)){
      return new ColorBlanco();
    }
    else if("Naranja".equalsIgnoreCase(color)){
      return new ColorNaranja();
    }
    
    return null;
  }
}
