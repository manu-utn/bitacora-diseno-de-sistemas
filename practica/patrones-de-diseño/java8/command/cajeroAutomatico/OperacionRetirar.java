/**
 * Concrete Command - Retirar
 * 
 */
public class OperacionRetirar implements Operacion{
  private Cuenta cuenta;
  private double monto;
  
  public OperacionRetirar(Cuenta cuenta, double monto){
    this.cuenta = cuenta;
    this.monto = monto;
  }
  
  @Override
  public void ejecutar(){
    cuenta.retirar(monto);
  }
  
  @Override
  public void deshacerOperacion(){
    cuenta.depositar(monto);
  }
}
