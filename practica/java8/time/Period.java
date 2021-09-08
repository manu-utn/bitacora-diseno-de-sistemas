/**
 * Auto Generated Java Class.
 */
import java.time.*;  
import java.time.temporal.Temporal;
public class Period {
  
  public static void main(String[] args) { 
    Period period = Period.ofDays(24);  
    Temporal temp = period.addTo(LocalDate.now());  
    System.out.println(temp);   
  }
  
}
