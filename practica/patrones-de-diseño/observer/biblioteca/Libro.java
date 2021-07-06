/**
 * Auto Generated Java Class.
 */
public class Libro {
  private String titulo;
  private boolean estaDisponible;
  
  public Libro(String titulo, boolean estadoDisponible){
    this.titulo = titulo;
    this.estaDisponible = estadoDisponible;
  }
  
  public String getTitulo(){
    return titulo;
  }
  
  public void setEstaDisponible(boolean nuevoEstado){
    estaDisponible = nuevoEstado;
  }
  
  public boolean getEstaDisponible(){
    return estaDisponible;
  }
}
