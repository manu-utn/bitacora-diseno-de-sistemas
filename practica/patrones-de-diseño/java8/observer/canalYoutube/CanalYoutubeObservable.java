/**
 * Subject / Observable
 */
public interface CanalYoutubeObservable {
  public void suscribir(SuscriptorObserver s);
  public void desuscribir(SuscriptorObserver s);
  public void notificarSuscriptores();
}
