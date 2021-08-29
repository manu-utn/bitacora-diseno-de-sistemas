/**
 * Receptor
 */
public class Cuenta {
  private int numeroCuenta;
  private double saldo;
  
  public Cuenta(int numeroCuenta, double saldoInicial){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldoInicial;
  }
  
  public void depositar(double monto){
    saldo += monto;
    
    System.out.println("El monto depositado es de " + monto);
  }
  
  public void retirar(double monto){
    if( saldo - monto >= 0){
      saldo -= monto;
      
      System.out.println("El monto retirado es de " + monto);
    }else{
      System.out.println("No se puede retirar más dinero");
    }
  }
}
