/**
 * Concrete Command - Depositar
 * 
 */
public class OperacionDepositar implements Operacion{
  private Cuenta cuenta;
  private double monto;
  
  public OperacionDepositar(Cuenta cuenta, double monto){
    this.cuenta = cuenta;
    this.monto = monto;
  }
  
  @Override
  public void ejecutar(){
    cuenta.depositar(monto);
  }
  
  @Override
  public void deshacerOperacion(){
    cuenta.retirar(monto);
  }
}
