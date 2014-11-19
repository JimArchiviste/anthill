package ants;

public abstract class Ant {

	protected int life;
	protected Position position;
	
	public Ant () {
		this.life = 100;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void goForward(int position) {
		this.position.add(position);
	}
	
	public void goBack(int position) {
		this.position.remove(position);
	}

}
