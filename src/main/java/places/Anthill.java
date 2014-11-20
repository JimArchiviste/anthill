package places;

import java.util.ArrayList;

import mails.MessageBox;
import ants.*;

public class Anthill {
	
	private Queen queen;
	private ArrayList<ArrayList<Ant>> inactive_ants;
	private ArrayList<ArrayList<Ant>> active_ants;
	private MessageBox messagebox;
	private ArrayList<Site> sites;
	
	public Anthill (int nbCycle) {
		this.queen = new Queen(this, nbCycle);
		this.inactive_ants = this.queen.bornAnts();
		this.active_ants = new ArrayList<ArrayList<Ant>>();
		for (int i = 0; i < 3; i++) {
			ArrayList<Ant> ants = new ArrayList<Ant>();
			active_ants.add(ants);
		}
		this.messagebox = new MessageBox();
		this.sites = new ArrayList<Site>();
		for (int i = 1; i < 6; i++) {
			Site site = new Site(i);
			sites.add(site);
		}
	}

	public void newCycle(int cycle) {
		//Inactive Worker
		ArrayList<ArrayList<Ant>> temporary_ants = new ArrayList<ArrayList<Ant>>();
		ArrayList<Ant> actives = new ArrayList<Ant>();
		ArrayList<Ant> inactives = new ArrayList<Ant>();
		temporary_ants.add(actives);
		temporary_ants.add(inactives);
		while (!this.active_ants.get(0).isEmpty()) {
			Ant that = this.active_ants.get(0).get(0);
			if(!that.moveOn()){
				//active
				temporary_ants.get(0).add(that);
			}
			else {
				//inactive
				temporary_ants.get(1).add(that);
			}
			this.active_ants.get(0).remove(0);
		}
		while (!this.inactive_ants.get(0).isEmpty()) {
			if (this.inactive_ants.get(0).isEmpty()) break;
			Ant that = this.inactive_ants.get(0).get(0);
			that.goToSite(this.availableSite());
			temporary_ants.get(0).add(that);
			this.inactive_ants.get(0).remove(0);
		}
		for (Ant ant : temporary_ants.get(0)) {
			this.active_ants.get(0).add(ant);
		}
		for (Ant ant : temporary_ants.get(1)) {
			this.inactive_ants.get(0).add(ant);
		}
		//Soldier
		temporary_ants = new ArrayList<ArrayList<Ant>>();
		actives = new ArrayList<Ant>();
		inactives = new ArrayList<Ant>();
		temporary_ants.add(actives);
		temporary_ants.add(inactives);
		/**for (int i = 0; i < this.inactives_ants.get(1).size();) {
			for (Site site : this.sites) {
				if (i == this.inactives_ants.get(1).size()) break;
				this.inactives_ants.get(1).get(i).goToSite(site);
				i++;
			}
		}**/
		//Healer
		for (Ant ant : this.inactive_ants.get(2)) {

			
		}
	}

	private Site availableSite() {
		for (Site site : this.sites) {
			if (site.getAmount() > 0) return site;
		}
		return null;
	}

	public MessageBox getMessageBox() {
		return this.messagebox;
	}

}
