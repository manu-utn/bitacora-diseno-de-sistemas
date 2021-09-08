/**
 * Target
 * - Es la interfaz incompatible con el adaptee (el objeto que se pretende adaptar)
 * pero que el adaptador pretende implementar adaptando el adaptee a esta interfaz
 * 
 */
public interface IMiniReproductor {
  public void reproducir(String formato, String archivo);
}
