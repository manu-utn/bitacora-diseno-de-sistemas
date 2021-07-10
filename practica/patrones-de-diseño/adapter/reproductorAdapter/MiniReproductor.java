/**
 * - MiniReproductor busca reutilizar las funciones del reproductorAdaptable
 * - Guardamos una referencia a él
 */
public class MiniReproductor implements IMiniReproductor{
  ReproductorAdapter reproductorAdapter; 
  
  @Override
  public void reproducir(String formato, String archivo){
    if("mp3".equalsIgnoreCase(formato)){
      System.out.println("Reproduciendo "+archivo+" en el formato "+ formato);
    }
    else if("mp4".equalsIgnoreCase(formato) || "mpg".equalsIgnoreCase(formato)){
      // -> NO es necesario instanciar el tipo de reproductor (mp3 o mpg)
      // -> porque el adapter posee ambos por implementar la interfaz IReproductor
      // reproductorAdapter = new ReproductorMP4();
      reproductorAdapter = new ReproductorAdapter(formato);
      reproductorAdapter.reproducir(formato, archivo);
    }
    else{
      System.out.println("El formato elegido no es compatible");
    }
  }
}
