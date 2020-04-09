// 
// Succès par Guiwix
//

package org.aestia.succes;

import org.aestia.client.Player;

public class Decouverte {
	
    	public static void succesDecouverte(Player perso) {
    		short Mapid = perso.getCurMap().getId();
    		switch (Mapid){
    		case 10295:
    			perso.verifAndAddSucces(Mapid, 1000, 1000, "trop smart");
    			break;
    		case 10297:
    			perso.verifAndAddSucces(Mapid, 1000, 1000, "trop smart en fait");
    			break;
    		}		
    	}		
	}
	
	
	
		
		
		
		
		
	
