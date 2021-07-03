/**
 * Concrete Product - Prestamo PYME
 */
public class PrestamoPYME extends Prestamo{
  public void calcularIntereses(int montoPedido){
    intereses = montoPedido * 2;
    
    System.out.println(intereses);
  }
}
