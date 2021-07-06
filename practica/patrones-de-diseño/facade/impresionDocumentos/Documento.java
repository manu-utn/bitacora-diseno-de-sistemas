/**
 * Auto Generated Java Class.
 */
public class Documento {
  private int numeroDocumento;
  private String titulo;
  private boolean validado;
  private boolean impreso;
  private boolean firmado;
  
  public Documento(int numeroDocumento, String titulo){
    this.numeroDocumento = numeroDocumento;
    this.titulo = titulo;
    
    this.validado = false;
    this.impreso = false;
    this.firmado = false;
  }
  // faltan los setters y getters
  
  public String getTitulo(){
    return titulo;
  }
  
  public void setValidado(boolean nuevoEstado){
    this.validado = nuevoEstado;
  }
  
  public void setImpreso(boolean nuevoEstado){
    this.impreso = nuevoEstado;
  }
  
  public void setFirmado(boolean nuevoEstado){
    this.firmado = nuevoEstado;
  }
  
}
