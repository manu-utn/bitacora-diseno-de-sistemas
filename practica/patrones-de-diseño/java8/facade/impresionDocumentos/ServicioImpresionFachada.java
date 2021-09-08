/**
 * Auto Generated Java Class.
 */
public class ServicioImpresionFachada {
  private Documento documento;
  private ServicioImprimir servicioImprimir;
  private ServicioValidar servicioValidar;
  private ServicioFirmaDigital servicioFirmaDigital;
  
  public ServicioImpresionFachada(Documento documento){
    this.documento = documento;
    this.servicioImprimir = new ServicioImprimir();
    this.servicioValidar = new ServicioValidar();
    this.servicioFirmaDigital = new ServicioFirmaDigital();
  }
  
  public void imprimirFirmadoValidado(){
    servicioValidar.validar(documento);
    servicioFirmaDigital.firmar(documento);
    servicioImprimir.imprimir(documento);
  }
}
