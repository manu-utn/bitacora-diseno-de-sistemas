/**
 * Auto Generated Java Class.
 */
public class NullComputadora extends Computadora{
  private String ram;
  private String cpu;
  private String hdd;
  
  @Override
  public String getRAM(){
    return this.ram;
  }
  
  @Override
  public String getCPU(){
    return this.cpu;
  }
  
  @Override
  public String getHDD(){
    return this.hdd;
  }
  
  @Override
  public void imprimirDatos(){
    System.out.println("sin datos");
  }
}
