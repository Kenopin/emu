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
    			perso.verifAndAddSucces(Mapid, 1000, 1000, "<i>Succès dévérouillé</i>: Vous avez découvert une zone d'incarnam.");
    			break;
    		case 10297:
    			perso.verifAndAddSucces(Mapid, 1000, 1000, "trop smart en fait");
    			break;
    		}		
    	}
    	
    	public static void succesZone(Player perso, short IdSucces) {
    		short zone1 = 10295;
    		short zone2 = 10297;
    	if (perso.verifZoneAnddAddSucces(zone1) && perso.verifZoneAnddAddSucces(zone2))  {
    		
    		perso.verifAndAddSucces(IdSucces, 1000, 1000, "<i>Succès dévérouillé</i>: Vous avez découvert Incarnam en entier. BRAVO");
    		}
    		
    	}
	}
	
	
	
		
		
		
		
		
	
