/**
 * Auto Generated Java Class.
 */

import java.util.List;
import java.util.ArrayList;

public class TestComputadoraFactory {
  
  public static void main(String[] args){
    // String tipo, String ram, String cpu, String hdd
    Computadora compuHogar = ComputadoraFactory.getComputadora("pc", "4 GB", "1 Ghz", "1 TB");
    Computadora compuGamer = ComputadoraFactory.getComputadora("pc", "8 GB", "1.5 Ghz", "2 TB");
    Computadora notebookOficina = ComputadoraFactory.getComputadora("notebook", "2 GB", "1 Ghz", "1 TB");
    Computadora notebookGamer = ComputadoraFactory.getComputadora("notebook", "4 GB", "1.5 Ghz", "2 TB");
    Computadora compurara = ComputadoraFactory.getComputadora("rara", "4 GB", "1.5 Ghz", "2 TB");
    
    // compuHogar.imprimirDatos();
    
    // esto otro lo hago solo para practicar listas XD
    List<Computadora> computadoras = new ArrayList<>();
    computadoras.add(compuHogar);
    computadoras.add(compuGamer);
    computadoras.add(notebookOficina);
    computadoras.add(notebookGamer);
    computadoras.add(compurara);    
    
    computadoras.forEach(compu -> compu.imprimirDatos());
  }  
  
}
