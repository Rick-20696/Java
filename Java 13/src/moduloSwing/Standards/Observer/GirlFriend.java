package moduloSwing.Standards.Observer;

public class GirlFriend implements BirthdayArraivalObserver{
	//This is the Observer, who it's interested in be notify when to happen the event
	
	//This Observer implements the Functional Interface that has the method "arrived".
	public void arrived(BirthdayArrivalEvent event) {
		System.out.println("He arrived...");
		System.out.println("Turn off the lights...");
		System.out.println("Surprise!!!");
	}
}
