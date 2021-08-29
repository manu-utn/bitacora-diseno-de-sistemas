/**
 * Auto Generated Java Class.
 */
public class HitbugDemo {
  
  public static void main(String[] args) { 
    // String titulo, String url, TipoMultimedia tipo
    Contenido videoLoco = new Contenido("vide loco", "youtube.com/v=1239123", TipoMultimedia.VIDEO);
    Contenido musicaHeavy = new Contenido("musica heavy", "youtube.com/v=91123", TipoMultimedia.MUSICA);
    
    Bag miBag = new BagSimple();
    
    Usuario pepe = new Duenio();
    pepe.crearBag(miBag);
    
    Hit agregarTemon = new agregar(musicaHeavy);
    Hit cambiarFeoNombre = new cambiar(musicaHeavy, 'pepe');
    
    pepe.aplicarCambio(agregarTemon, miBag);
    pepe.aplicarCambio(cambiarFeoNombre, miBag);
  }
  
  
}
