/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabryka;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Robert Waniewski
 */
class StronaAktualnosci extends StronaHTML {

    public StronaAktualnosci() throws FileNotFoundException {
      PrintWriter zapis = new PrintWriter("LosowaStronaAktualnosci "+ RandomString.LosowyWyraz(3) + ".html");
      zapis.println("<html><body>");
      for(int j = 0; j<10 ; j++){
        zapis.println("<br><b>"+ RandomString.LosowyWyraz(20) + "</b><br><br>"); 
      
        for(int i = 0 ; i<30 ; i++){
          
            zapis.println(RandomString.LosowyWyraz(80) + "<br>");
        }
      }
      zapis.println("</body></html>");
      zapis.close();
        
    }
    
}
