/**
 * Adaptee
 * - Interfaz incompatible con "IMiniReproductor" es la que buscamos adaptar, con el Adapter
 */
public interface IReproductor {
  public void reproducirMP4(String archivo);
  public void reproducirMPG(String archivo);
}
