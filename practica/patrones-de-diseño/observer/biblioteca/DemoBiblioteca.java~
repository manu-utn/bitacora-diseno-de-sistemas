/**
 * Auto Generated Java Class.
 */
public class DemoCanalYoutube {
  
  
  public static void main(String[] args) { 
   CanalYoutubeCocinaObservable canalYoutubeCocinaSaludable = new CanalYoutubeCocinaObservable();
   
   SuscriptorRecetasObserver suscriptorA = new SuscriptorRecetasObserver(canalYoutubeCocinaSaludable);
   canalYoutubeCocinaSaludable.setCantidadNuevasRecetas(1); // notificará a todos los suscriptores
   
   SuscriptorRecetasObserver suscriptorB = new SuscriptorRecetasObserver(canalYoutubeCocinaSaludable);
   canalYoutubeCocinaSaludable.setCantidadNuevasRecetas(5); // notificará a todos los suscriptores
      
   canalYoutubeCocinaSaludable.desuscribir(suscriptorA);
   canalYoutubeCocinaSaludable.desuscribir(suscriptorB);
  }
  
}
