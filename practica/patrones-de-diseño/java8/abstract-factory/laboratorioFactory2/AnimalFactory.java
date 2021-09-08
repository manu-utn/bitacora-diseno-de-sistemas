/**
 * Concrete Factory - Animal
 */
public class AnimalFactory extends LaboratorioFactory{
  @Override
  public Animal crearAnimal(String tipoAnimal){    
    if("Tigre".equalsIgnoreCase(tipoAnimal)){      
      return new Tigre();
    }
    else if("Leon".equalsIgnoreCase(tipoAnimal)){
      return new Leon();
    }
    else if("Puma".equalsIgnoreCase(tipoAnimal)){
      return new Puma();
    }
    
    return null;
  }
  
  @Override
  Color crearColor(String color){
    return null;
  }

}
