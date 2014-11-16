package ants;

public abstract class Ant {

	protected int life;
	
	public Ant () {
		this.life = 100;
	}
	
	public int getLife() {
		return this.life;
	}
}
