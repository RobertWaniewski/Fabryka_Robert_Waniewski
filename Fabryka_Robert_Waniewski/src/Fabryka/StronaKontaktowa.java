
package Fabryka;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Robert Waniewski
 */
class StronaKontaktowa extends StronaHTML{
    
    public StronaKontaktowa() throws FileNotFoundException{
    PrintWriter zapis = new PrintWriter("Losowa strona kontaktowa "+ RandomString.LosowyWyraz(5) + ".html");
      zapis.println("<html><body> <h4>");
      zapis.println(RandomString.LosoweDane() + "<br>"); 
      zapis.println("<h4></body></html>");
      zapis.close();}
    
    
}
