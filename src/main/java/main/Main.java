package main;

import java.util.ArrayList;

import places.Anthill;

public class Main {

	public static void main(String[] args) {
		
		int nbCycle = 200;
		//Create all the anthills
		ArrayList<Anthill> anthills = new ArrayList<Anthill>();
		for (int i  = 0; i < 1; i++) {
			anthills.add(new Anthill(nbCycle));
		}

		//Do all the cycles
		for (int i = 0 ; i < nbCycle ; i++) {
			System.out.println("------------ Start of a new cycle #" + i + " ------------");
			int j  = 1;
			//Each anthill does a cycle
			for (Anthill anthill : anthills) {
				System.out.println("------------ Anthill n°" + j + " ------------" );
				//The anthill does what it has to do
				anthill.newCycle(i);
				System.out.println("------------ Management of the messages ------------");
				//All the messages for the anthill are managed
				while (!anthill.getMessageBox().isEmpty()) {
					Message m = anthill.getMessageBox().getNextMessage();
					m.acton();
				}
				
				System.out.println("------------ End of the messages ------------");
			}
			System.out.println("------------ End of the cycle ------------\n\n");
		}
	}

}
