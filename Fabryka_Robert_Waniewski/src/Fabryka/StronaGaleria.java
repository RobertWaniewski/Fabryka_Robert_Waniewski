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
class StronaGaleria extends StronaHTML {

    public StronaGaleria() throws FileNotFoundException {
        
      PrintWriter zapis = new PrintWriter("Losowa strona galerja "+ RandomString.LosowyWyraz(6) + ".html");
      zapis.println("<html><body>");
      for(int j = 0; j<10 ; j++){
        zapis.println("<br><b>"+ RandomString.LosowyWyraz(20) + "</b><br>"
                + "<img src='"+RandomString.LosowyWyraz(8)+".gif'><br>"); 
        
      
        
      }
      zapis.println("</body></html>");
      zapis.close();
    } 
    
}
