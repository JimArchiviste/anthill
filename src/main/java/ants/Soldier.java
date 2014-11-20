package ants;

import places.Anthill;

public class Soldier extends Ant {
	
	public Soldier (Anthill anthill) {
		super(anthill);
		this.speed = 2;
	}

	@Override
	public boolean moveOn() {
		return false;		
	}

}
