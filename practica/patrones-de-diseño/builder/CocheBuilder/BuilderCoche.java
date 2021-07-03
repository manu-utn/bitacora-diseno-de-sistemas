/**
 * Auto Generated Java Class.
 */

// Builder
public abstract class BuilderCoche {
  protected Coche coche;
  
  public abstract void construirMotor();
  public abstract void construirCarroceria();
    
  public Coche getCoche(){
    return coche;
  }

  public void crearCoche(){
    coche = new Coche();
  }
    
  public void construir(){
    this.crearCoche();
    this.construirMotor();
    this.construirCarroceria();
  }  
  
}
