/**
 * Auto Generated Java Class.
 */
public class ClienteNormal extends Cliente{    
  public ClienteNormal(String nombre){
    this.nombre = nombre;
  }
  
  @Override
  public boolean isNil(){
    return false;
  }
  
  @Override
  public String getNombre(){
    return nombre;
  }
}
