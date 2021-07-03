/**
 * Concrete Product - Prestamo Estudiantil
 */
public class PrestamoEstudiantil extends Prestamo{
  public void calcularIntereses(int montoPedido){
    intereses = montoPedido * 2;
  }
}
