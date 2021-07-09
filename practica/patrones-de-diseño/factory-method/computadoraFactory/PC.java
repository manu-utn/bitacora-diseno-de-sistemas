/**
 * Auto Generated Java Class.
 */
public class PC extends Computadora{
  private String ram;
  private String cpu;
  private String hdd;
  
  public PC(String ram, String cpu, String hdd){
    this.ram = ram;
    this.cpu = cpu;
    this.hdd = hdd;
  }
  
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
}
