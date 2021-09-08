/**
 * Auto Generated Java Class.
 */
public class UsuarioDuenio extends Usuario{
  public void agregarColaborador(Colaborador colaborador, Bag bag){
    bag.agregarColaborador(colaborador);
  }
  
  public void removerColaborador(Colaborador colaborador, Bag bag){
    bag.removerColaborador(colaborador);
  }
  
  public void aplicarCambio(Hit hit, Bag bag){
    hit.aplicarCambio(bag);
  }
}
