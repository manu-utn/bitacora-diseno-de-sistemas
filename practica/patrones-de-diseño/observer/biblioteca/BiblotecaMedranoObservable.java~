/**
 * Concrete Subject/Observable 
 */

import java.util.ArrayList;

public class CanalYoutubeCocinaObservable implements CanalYoutubeObservable{
  ArrayList<SuscriptorObserver> suscriptores; // observers
  int cantidadNuevasRecetas; // estado
  
  public CanalYoutubeCocinaObservable(){ // constructor
    // inicializamos
    suscriptores = new ArrayList<SuscriptorObserver>();
  }
  
  public void setCantidadNuevasRecetas(int cantidadNuevasRecetas){
    this.cantidadNuevasRecetas = cantidadNuevasRecetas;
    
    notificarSuscriptores();
  }
  
  // register
  @Override
  public void suscribir(SuscriptorObserver nuevoSuscriptor){
    suscriptores.add(nuevoSuscriptor);
    System.out.println("Tenemos un nuevo suscriptor! :)");
  }
  
  // unregister
  @Override
  public void desuscribir(SuscriptorObserver suscriptor){
    //int idSuscriptor = suscriptores.indexOf(suscriptor);
    suscriptores.remove(suscriptor);
    System.out.println("Hemos perdido un suscriptor! :(");
  }
  
  // notifyObservers
  @Override
  public void notificarSuscriptores(){
    suscriptores.forEach(suscriptor -> suscriptor.actualizar(cantidadNuevasRecetas));
  }
  
}
