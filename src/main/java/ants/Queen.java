package ants;

import java.util.ArrayList;

public class Queen extends Ant {

	public Queen (int nbCycle) {
		this.life = nbCycle;
	}

	public ArrayList<ArrayList<Ant>> bornAnts() {
		ArrayList<ArrayList<Ant>> ants = new ArrayList<ArrayList<Ant>>();
		//add Workers
		ArrayList<Ant> workers = new ArrayList<Ant>();
		for (int i = 0 ; i < (int)(10 + Math.random() * 20); i++) {
			Ant ant = new Worker();
			workers.add(ant);
		}
		ants.add(workers);
		//add Soldiers
		ArrayList<Ant> soldiers = new ArrayList<Ant>();
		for (int i = 0 ; i < (int)(6 + Math.random() * 12); i++) {
			Ant ant = new Soldier();
			soldiers.add(ant);
		}
		ants.add(soldiers);
		//add Healers
		ArrayList<Ant> healers = new ArrayList<Ant>();
		for (int i = 0 ; i < (int)(4 + Math.random() * 8); i++) {
			Ant ant = new Healer();
			healers.add(ant);
		}
		ants.add(healers);
		return ants;
	}
	
}
