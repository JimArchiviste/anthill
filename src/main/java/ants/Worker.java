package ants;

import places.Anthill;

public class Worker extends Ant {
	
	private int food;
	private int capacity;

	public Worker(Anthill anthill) {
		super(anthill);
		this.food = 0;
		this.capacity = 13;
	}
	
	@Override
	public boolean moveOn() {
		if (this.position.getPosition() == this.position.getSite().getDistance()) {
			int food_taken = this.position.getSite().reduceAmount(this.capacity);
			if (food_taken == 0) {
				this.food = food_taken;
			}
			else if (food_taken == -1) {
				goBack();
				//TODO Messages management
			}
			else {
				this.food = food_taken;
			}
		}
		else {
			if (this.position.getCome()){
				goForward();
			}
			else {
				goBack();
				if (this.position.getPosition() == 0) return true;
			}
		}
		return false;
	}
}
