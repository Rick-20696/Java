package moduloSwing.Standards.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge {
	//This is a Subject, who can to detect the event
	//The Class Subject has the responsibility of observer a event
	private List<BirthdayArraivalObserver> observers  = new ArrayList<>();
	
	//The Subject need has a method that go register the observers
	public void registerObserver (BirthdayArraivalObserver ob) {
		observers.add(ob);
	}
	
	//In Subject too need monitor by where arrive the event
	public void monitor () {
		Scanner input = new Scanner (System.in);
		
		String value = "";
		
		while (!"get out".equalsIgnoreCase(value)) {
			System.out.print("Birthday boy arrived? ");
			value =  input.nextLine();
			
			//If "yes" i will notify observers
			if ("yes".equalsIgnoreCase(value)) {
				//I'm passing a new event because this it's notifying the Observer
				observers.stream().forEach(o -> o.arrived(new BirthdayArrivalEvent(new Date())));
				value = "get out";
			}
			else {
				System.out.println("False alarm");
			}
		}
		
		input.close();
	}
}
