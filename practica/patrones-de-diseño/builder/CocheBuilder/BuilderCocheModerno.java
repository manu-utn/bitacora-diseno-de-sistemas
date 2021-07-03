/**
 * Auto Generated Java Class.
 */

// ConcreteBuilder
public class BuilderCocheModerno extends BuilderCoche{
  public BuilderCocheModerno(){} // constructor
  
  @Override
  public void construirMotor(){
    coche.setMotor("Motor carito");
    coche.setVelocidad(300);
  }
  
  @Override
  public void construirCarroceria(){
    coche.setCarroceria("Carroceria carita");
  }
}
