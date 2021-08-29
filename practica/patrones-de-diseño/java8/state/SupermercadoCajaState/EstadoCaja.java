/**
 * State
 */
public interface EstadoCaja {
  public void abrir(Caja caja);
  public void cerrar(Caja caja);
  public void atender(Persona persona);
}
