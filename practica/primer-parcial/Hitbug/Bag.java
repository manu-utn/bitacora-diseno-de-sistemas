/**
 * Posible composite (?)
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Bag {
  protected List<Contenido> contenidos; 
  protected List<Colaborador> colaboradores;
  
  public List<Contenido> mostrarContenido(){
    return contenido;
  }
  
  public void agregarColaborador(Colaborador colaborador){
    bag.add(colaborador);
  }
  
  public void removerColaborador(Colaborador colaborador){
    bag.remove(colaborador);
  }
  
  public void agregarContenido(Contenido contenido){
    contenidos.add(contenido);
  }
  
  public void removerContenido(Contenido contenido){
    contenidos.remove(contenido);
  }  
  
  public void setContenido(Contenido unContenido, String nuevoContenido){
    Contenido contenidoViejo = contenidos.find(contenido -> contenido.equalsTo(unContenido));
    contenidoViejo.set(nuevoContenido);
  }
}
