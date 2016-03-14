
package Fabryka;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author Robert Waniewski
 */
class StronaInformacyjna extends StronaHTML {

    public StronaInformacyjna()throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("Losowa strona informacyjna "+ RandomString.LosowyWyraz(4) + ".html");
      zapis.println("<html><body>");
      for(int i = 0 ; i<200 ; i++){
      zapis.println(RandomString.LosowyWyraz(80) + "<br>");
      }
      zapis.println("</body></html>");
      zapis.close();
    
    }
    
    
}
