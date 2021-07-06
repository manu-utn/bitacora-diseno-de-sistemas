/**
 * Auto Generated Java Class.
 */
public class ServicioImpresionDemo {
  
  public static void main(String[] args) { 
    
    //
    // usando la fachada queda mas simple :)
    Documento decretoNacional = new Documento(1001, "Decreto nacional de las americas");
    
    ServicioImpresionFachada servicioImpresionConFachada = new ServicioImpresionFachada(decretoNacional);
    servicioImpresionConFachada.imprimirFirmadoValidado();
    
    /*****************************************************************************************/
    
    System.out.println("---------------------");
    //
    // sin la fachada.. serian mas lineas :(
    
    Documento decretoProvincial = new Documento(1002, "Decreto provincial de las americas");
    
    ServicioImpresionFachada servicioImpresion = new ServicioImpresionFachada(decretoNacional);
    ServicioImprimir servicioImprimir = new ServicioImprimir();
    ServicioValidar servicioValidar = new ServicioValidar();
    ServicioFirmaDigital servicioFirmar = new ServicioFirmaDigital();
    
    servicioValidar.validar(decretoProvincial);
    servicioFirmar.firmar(decretoProvincial);
    servicioImprimir.imprimir(decretoProvincial);
  }
  
}
