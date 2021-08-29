/**
 * Product - Prestamo
 */
public abstract class Prestamo {
  protected int intereses; // por ser protected la pueden acceder solo las clases-hijas
  private int valor;
  
  public abstract void calcularIntereses(int montoPedido);

  public void calcularPrestamo(int anios){
    valor = anios * intereses;
  }
    
  public int getIntereses(){
    return intereses;
  }
}
