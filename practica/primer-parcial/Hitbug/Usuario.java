/**
 * Auto Generated Java Class.
 */
public abstract class Usuario {
  protected List<Bag> bags;
  
  public void crearBag(Bag bag){
    bags.add(bag);
  }
  
  public List<Contenido> mostrarContenido(Bag bag){
    return bag.mostrarContenido();
  }
  
}
