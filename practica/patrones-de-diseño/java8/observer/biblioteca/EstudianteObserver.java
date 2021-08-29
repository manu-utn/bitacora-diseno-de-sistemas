/**
 * Auto Generated Java Class.
 */
public class EstudianteObserver implements IEstudianteObserver{
  private BibliotecaMedranoObservable biblioteca;
  private Libro libro;
  private String nombre;
    
  public EstudianteObserver(String nombre, BibliotecaMedranoObservable biblioteca){
    this.nombre = nombre;
    this.biblioteca = biblioteca;
    
    biblioteca.agregarObservador(this);
  }
  
  @Override
  public void actualizar(Libro libro){
    this.libro = libro;
    
    System.out.println("Hola "+ getNombre() +" Tenemos está disponible este libro " + libro.getTitulo());
  }
  
  @Override
  public String getNombre(){
    return nombre;
  }
}
