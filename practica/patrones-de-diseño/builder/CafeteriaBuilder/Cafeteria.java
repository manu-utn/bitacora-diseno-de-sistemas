/**
 * Director
 */
public class Cafeteria {
  BebidaBuilder bebidaBuilder;
  
  public void cambiarBebida(BebidaBuilder bebidaBuilder){
    this.bebidaBuilder = bebidaBuilder;
  }
 
  public void prepararBebida(BebidaBuilder bebidaBuilder){
    cambiarBebida(bebidaBuilder);
    
    bebidaBuilder.calentarAgua();
    bebidaBuilder.agregarExtras();
    bebidaBuilder.servir();
  }
}
