/**
 * Auto Generated Java Class.
 */
public class DemoBiblioteca {
  
  
  public static void main(String[] args) { 
   BibliotecaMedranoObservable biblioteca = new BibliotecaMedranoObservable();
   
   EstudianteObserver carlitos = new EstudianteObserver("carlitos", biblioteca);
   EstudianteObserver pedrito = new EstudianteObserver("pedrito", biblioteca);
   
   biblioteca.setLibro(new Libro("Harry Potter I", false));
   biblioteca.setLibro(new Libro("Harry Potter II", true));
   biblioteca.setLibro(new Libro("Harry Potter III", true));
  }
  
}
