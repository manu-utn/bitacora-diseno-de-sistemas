/**
 * Abstract Factory
 */
public abstract class SistemaFactory {
  public abstract Prestamo crearPrestamo(String tipoPrestamo);
  public abstract Banco crearBanco(String nombreBanco);
}
