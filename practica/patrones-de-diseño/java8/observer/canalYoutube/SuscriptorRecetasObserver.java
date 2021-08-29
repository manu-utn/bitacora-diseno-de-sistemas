/**
 * Auto Generated Java Class.
 */
public class SuscriptorRecetasObserver implements SuscriptorObserver{
  private CanalYoutubeObservable canalYoutubeCocina;
  private int cantidadNuevasRecetas;
    
  public SuscriptorRecetasObserver(CanalYoutubeObservable canalYoutubeCocina){
    this.canalYoutubeCocina = canalYoutubeCocina;
    
    canalYoutubeCocina.suscribir(this);
  }
  
  public void actualizar(int cantidadNuevasRecetas){
    this.cantidadNuevasRecetas = cantidadNuevasRecetas;
    
    System.out.println("Hey suscriptor! Han subido " + cantidadNuevasRecetas + " de recetas nuevas");
  }
}
