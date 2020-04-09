// 
// Succès par Guiwix
//

package org.aestia.succes;

import org.aestia.client.Player;

public class decouverte {
			
	
	
	/*if (perso.getCurMap().getId() ==Mapid) {
			perso.verifAndAddSucces(Mapid);
		perso.sendMessage("hého");
		return;
		*/
	public static void SuccesDecouverte(Player perso) {
		
		short Mapid = perso.getCurMap().getId();
		switch (Mapid){
		case 10295:
			perso.verifAndAddSucces(Mapid, 1000, 1000);
			
			break;
		}		
	}		
	}
	
	
	
		
		
		
		
		
	
