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
		if (this.position.getCome()) {
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
				this.position.setCome();
			}
			else if (!this.position.getSite().equals(this.anthill.getAvailableSite())) {
				goBack();
				this.position.setCome();
			}
			else goForward();
		}
		else {
			goBack();
			if (this.position.getPosition() == 0) {
				this.position.setCome();
				return true;
			}
		}
		return false;
	}
}
