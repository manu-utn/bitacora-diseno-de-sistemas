/**
 * Concrete Product - Prestamo Familiar
 */
public class PrestamoFamiliar extends Prestamo{
  public void calcularIntereses(int montoPedido){
    intereses = montoPedido * 1;
  }
}
