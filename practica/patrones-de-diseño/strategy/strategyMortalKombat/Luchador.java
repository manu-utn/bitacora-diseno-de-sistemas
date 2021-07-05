/**
 * Context - Luchador
 * - Usaremos 2 strategies para separar el comportamiento de algunos ataques
 */
public abstract class Luchador {
  private Patada patada;
  private Punietazo punietazo;
  
  public Luchador(Punietazo punietazo, Patada patada){
    this.punietazo = punietazo;
    this.patada = patada;
  }
  
  public abstract String getNombre();
  
  public void darPatada(){
    patada.darPatada();
  }
  
  public void darPunietazo(){
    punietazo.darPunietazo();
  }
  
  public void setPatada(Patada patada){
    this.patada = patada;
  }
  
  public void setPunietazo(Punietazo punietazo){
    this.punietazo = punietazo;
  }
}
