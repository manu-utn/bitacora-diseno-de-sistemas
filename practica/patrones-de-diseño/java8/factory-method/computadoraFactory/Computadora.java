/**
 * Auto Generated Java Class.
 */
public abstract class Computadora {
  private String ram;
  private String cpu;
  private String hdd;
  
  public abstract String getRAM();
  public abstract String getCPU();
  public abstract String getHDD();
  
  public void imprimirDatos(){
    System.out.println("RAM: "+this.getRAM() + ", CPU: "+this.getCPU() + ", HDD: "+ this.getHDD());
  }
}
