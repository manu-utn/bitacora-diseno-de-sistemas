/**
 * Concrete Subject/Observable 
 */

//import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class BibliotecaMedranoObservable implements BibliotecaObservable{
  private final Set<EstudianteObserver> observadores; // observers
  private Libro libro; // estado

  public BibliotecaMedranoObservable(){ // constructor
    // inicializamos
    observadores = new HashSet<EstudianteObserver>();
  }
  
  public void setLibro(Libro libro){
    this.libro = libro;
    
    if(libro.getEstaDisponible()){
      notificarObservadores();
    }
  }
  
  // register
  @Override
  public void agregarObservador(EstudianteObserver estudiante){
    observadores.add(estudiante);
    System.out.println("Un nuevo estudiante se suscribió a las novedades de la biblioteca! :)");
  }
  
  // unregister
  @Override
  public void quitarObservador(EstudianteObserver estudiante){
    observadores.remove(estudiante);
    System.out.println("Un estudiante ya no está interesado en recibir novedades! :(");
  }
  
  // notifyObservers
  @Override
  public void notificarObservadores(){
    observadores.forEach(observador -> observador.actualizar(libro));
    //observadores.forEach(EstudianteObserver::actualizar(libro));
  }
  
}
