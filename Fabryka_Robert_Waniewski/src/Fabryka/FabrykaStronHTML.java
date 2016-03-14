
package Fabryka;

import java.io.FileNotFoundException;

/**
 *
 * @author Robert Waniewski
 */
public class FabrykaStronHTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //StronaInformacyjna stronaa= new StronaInformacyjna(); 
        StronaHTML pierwsza = SimpleFactory.createStronaHTML("informacyjna");
        StronaHTML druga = SimpleFactory.createStronaHTML("aktualnosci");
        StronaHTML trzecia = SimpleFactory.createStronaHTML("kontaktowa");
        StronaHTML czwarta = SimpleFactory.createStronaHTML("galeria");
        
        
        
        //System.out.println(RandomString.LosoweDane());
    }
    
}
