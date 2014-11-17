package places;

import java.util.ArrayList;

import mails.MessageBox;
import ants.Ant;
import ants.Queen;

public class Anthill {
	
	private Queen queen;
	private ArrayList<Ant> ants;
	private MessageBox messagebox;
	
	public Anthill (int nbCycle) {
		this.queen = new Queen(nbCycle);
		this.ants = this.queen.bornAnts();
		this.messagebox = new MessageBox();
	}

	public void newCycle(int i) {
		for (Ant ant : this.ants) {
			
		}
	}

	public MessageBox getMessageBox() {
		return this.messagebox;
	}

}
