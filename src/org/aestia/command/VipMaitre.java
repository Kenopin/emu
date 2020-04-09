package org.aestia.command;

import java.util.ArrayList;


/**
 * IDEE VIP COMMAND
 * .maitrevip [pseudo] // pose une question a l'autre joueur s'il repond oui il sera controler pars l'autre
 * tp mariage doubler
 * 
**/
public class VipMaitre
{
	private ArrayList<org.aestia.client.Player> 	persos = new ArrayList<org.aestia.client.Player>();
	private org.aestia.client.Player				Maitre;
	private boolean				boss = false;
	
	public VipMaitre(org.aestia.client.Player Maitre, ArrayList<org.aestia.client.Player> players, boolean boss)
	{
		this.Maitre = Maitre;
		this.persos = players;
		this.boss = boss;
	}
	
	public org.aestia.client.Player getMaitre()
	{
		return (this.Maitre);
	}
	
	public ArrayList<org.aestia.client.Player> getpersos()
	{
		return (this.persos);
	}
	
	public boolean getboss()
	{
		return (this.boss);
	}
}