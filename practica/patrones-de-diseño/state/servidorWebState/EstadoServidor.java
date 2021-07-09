/**
 * State
 */
public interface EstadoServidor {
  public void encender(Servidor servidor);
  public void reiniciar(Servidor servidor);
  public void bloquear(Servidor servidor);
  public void apagar(Servidor servidor);
  public void imprimirEstado();
}
