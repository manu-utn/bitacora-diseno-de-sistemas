/**
 * Auto Generated Java Class.
 */
public abstract Servicio {
  private List<Documento> copias;
  private CalidadServicio calidad;
    
  public void analizar(){
    //calidad.analizar(this);
    calidad.analizar(documentos);
    //copias.forEach(copia -> calidad.analizar(copia) );
  }
  
  public void cargarDocumentos(List<Documento> documentos){
    documentos.addAll(documentos);
  }
}
