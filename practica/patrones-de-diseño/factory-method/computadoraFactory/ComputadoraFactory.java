/**
 * Auto Generated Java Class.
 */
public class ComputadoraFactory {
  public static Computadora getComputadora(String tipo, String ram, String cpu, String hdd){
    if("notebook".equalsIgnoreCase(tipo)){
      return new Notebook(ram, cpu, hdd);
    }
    else if("pc".equalsIgnoreCase(tipo)){
      return new PC(ram, cpu, hdd);
    }   
    
    return new NullComputadora();
  }
  
}
