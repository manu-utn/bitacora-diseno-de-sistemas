/**
 * Concrete Factory - Animal
 */
public class AnimalFactory implements LaboratorioFactory<Animal>{
  @Override
  public Animal crear(String tipoAnimal){    
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
}
