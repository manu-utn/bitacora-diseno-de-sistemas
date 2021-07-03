/**
 * Builder - Bebida
 */
public abstract class BebidaBuilder {
  protected Bebida bebida;
  
  public abstract void servir();
  public abstract void calentarAgua();
  public abstract void agregarExtras();
  
  public void crearBebida(){
    bebida = new Bebida();
  }
  
  public Bebida getBebida(){
    return bebida;
  }
  
  public void preparar(){
    this.crearBebida();
    this.calentarAgua();
    this.agregarExtras();
    this.servir();
  } 
}