/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabryka;

import java.io.FileNotFoundException;

/**
 *
 * @author Robert Waniewski
 */
public class SimpleFactory {
    
    public static StronaHTML createStronaHTML(String type) throws FileNotFoundException {
	    StronaHTML stronaHTML = null;
	    if (type.equals("informacyjna")) {
	        stronaHTML = new StronaInformacyjna();
	    } 
            else if (type.equals("kontaktowa")) {
	        stronaHTML = new StronaKontaktowa();
	    }
            else if (type.equals("galeria")) {
	        stronaHTML = new StronaGaleria();
	    }
            else if (type.equals("aktualnosci")) {
	        stronaHTML = new StronaAktualnosci();
	    }
		
	    return stronaHTML;
	}	
}
