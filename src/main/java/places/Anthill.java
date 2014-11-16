package places;

import java.util.ArrayList;

import ants.Ant;
import ants.Queen;

public class Anthill {
	
	private Queen queen;
	private ArrayList<Ant> ants;
	
	public Anthill (int nbCycle) {
		this.queen = new Queen(nbCycle);
		this.ants = this.queen.bornAnts();
	}

	public void newCycle(int i) {
		for (Ant ant : this.ants) {
			
		}
	}

}
