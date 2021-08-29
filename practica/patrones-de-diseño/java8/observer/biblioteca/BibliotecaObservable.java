/**
 * Subject / Observable
 */
public interface BibliotecaObservable {
  public void agregarObservador(EstudianteObserver estudiante);
  public void quitarObservador(EstudianteObserver estudiante);
  public void notificarObservadores();
}
