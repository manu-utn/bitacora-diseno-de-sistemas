/**
 * Auto Generated Java Class.
 */

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
  
public class LambdaTest {
  public static void main(String[] args) {
    Stream.of("uno","dos", "tres").forEach(mensaje -> System.out.println(mensaje));
    
    List<Integer> lista = Stream.of("1", "2", "3").map(Integer::new).collect(Collectors.toList());
    System.out.println(lista);
    
    List<String> lista2 = Stream.of("uno","dos", "tres")
    .filter("dos" :: equals).collect(Collectors.toList());
    System.out.println(lista2);
    
    
  }
}
