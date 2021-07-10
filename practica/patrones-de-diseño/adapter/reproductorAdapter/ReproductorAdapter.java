/**
 * Adapter
 * - Es el nexo/puente entre las interfaces incompatibles
 * - Se pretende adaptar la interfaz "IReproductor" y sea compatible con 
 * la interfaz "IMiniReproductor" (target)
 */
public class ReproductorAdapter implements IMiniReproductor{
  IReproductor reproductor;
  
  // constructor
  public ReproductorAdapter(String formato){
    if("mp4".equalsIgnoreCase(formato)){
      reproductor = new ReproductorMP4();
    }
    else if("mpg".equalsIgnoreCase(formato)){
      reproductor = new ReproductorMPG();
    }
    
  }
  
  // - es necesario preguntar el formato porque los reproductores
  // entienden "reproducir" con distinto nombre (reproducirMP4, reproducirMPG)
  @Override
  public void reproducir(String formato, String archivo){
    if("mp4".equalsIgnoreCase(formato)){
      reproductor.reproducirMP4(archivo);      
    }
    else if("mpg".equalsIgnoreCase(formato)){
      reproductor.reproducirMPG(archivo);
    }
  }
}
