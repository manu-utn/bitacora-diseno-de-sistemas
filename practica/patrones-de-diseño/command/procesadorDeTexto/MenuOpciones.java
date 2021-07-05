/**
 * Invocador - Menu de Opciones del Editor de texto
 * (Ej. el típico toolbar)
 */
public class MenuOpciones {
  private Command commandAbrir;
  private Command commandCerrar;
  private Command commandGuardar;
  
  // NO es necesario especificar las clases de los concrete commands
  // porque los tres implementan la misma interfaz "Command"
  public MenuOpciones(Command commandAbrir, Command commandCerrar, Command commandGuardar){
    this.commandAbrir = commandAbrir;
    this.commandCerrar = commandCerrar;
    this.commandGuardar = commandGuardar;
  }
  
  public void clickBotonAbrir(){
    commandAbrir.ejecutar();
  }
  
  public void clickBotonCerrar(){
    commandCerrar.ejecutar();
  }
  
  public void clickBotonGuardar(){
    commandGuardar.ejecutar();
  }  
}
