/**
 * Auto Generated Java Class.
 */
public class Avion implements Transporte{
  @Override
  public void reparar(){
    System.out.println("Reparando del avion las alas, las helices, y ruedas de aterrizaje...");
  }
  
  @Override
  public void conducir(){
    System.out.println("Despegando avión...");
  }
  
  @Override
  public double costoMantenimiento(){
    return 500*2+15;
  }
}
