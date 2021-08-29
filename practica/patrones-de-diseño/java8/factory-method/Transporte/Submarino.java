/**
 * Auto Generated Java Class.
 */
public class Submarino implements Transporte{
  @Override
  public void reparar(){
    System.out.println("Reparando la escotilla, y la sala de maquinas del submarino...");
  }
  
  @Override
  public void conducir(){
    System.out.println("Activando la helice para sumergir el submarino...");
  }
  
  @Override
  public double costoMantenimiento(){
    return 2500*3+15;
  }
}
