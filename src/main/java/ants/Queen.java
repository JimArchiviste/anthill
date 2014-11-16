package ants;

import java.util.ArrayList;

public class Queen extends Ant {

	public Queen (int nbCycle) {
		this.life = nbCycle;
	}

	public ArrayList<Ant> bornAnts() {
		ArrayList<Ant> ants = new ArrayList<Ant>();
		for (int i = 0 ; i < (int)(10 + Math.random() * 20); i++) {
			Ant ant = new Worker();
			ants.add(ant);
		}
		for (int i = 0 ; i < (int)(6 + Math.random() * 12); i++) {
			Ant ant = new Soldier();
			ants.add(ant);
		}
		for (int i = 0 ; i < (int)(4 + Math.random() * 8); i++) {
			Ant ant = new Healer();
			ants.add(ant);
		}
		return ants;
	}
	
}
