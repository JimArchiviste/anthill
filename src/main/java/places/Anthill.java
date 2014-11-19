package places;

import java.util.ArrayList;

import mails.MessageBox;
import ants.*;

public class Anthill {
	
	private Queen queen;
	private ArrayList<ArrayList<Ant>> ants;
	private MessageBox messagebox;
	private ArrayList<Site> sites;
	
	public Anthill (int nbCycle) {
		this.queen = new Queen(nbCycle);
		this.ants = this.queen.bornAnts();
		this.messagebox = new MessageBox();
		this.sites = new ArrayList<Site>();
		for (int i = 1; i < 6; i++) {
			Site site = new Site(i);
			sites.add(site);
		}
	}

	public void newCycle(int i) {
		System.out.println(this.ants);
		//Soldier
		System.out.println(this.ants.get(1).size());
		for (Site site : this.sites) {
			
		}
		for (Ant ant : this.ants.get(1)) {
			
		}
		//Worker
		for (Ant ant : this.ants.get(0)) {
			/**if ( ant instanceof Worker || ant instanceof Soldier){
				//sites.get((int)(Math.random() * 4)).send(ant);
				//sites.get(0).send(ant);
			}**/
		}
		//Healer
		for (Ant ant : this.ants.get(2)) {

			
		}
	}

	public MessageBox getMessageBox() {
		return this.messagebox;
	}

}
