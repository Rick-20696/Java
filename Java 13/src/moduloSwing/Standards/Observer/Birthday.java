package moduloSwing.Standards.Observer;

public class Birthday {

	public static void main(String[] args) {
		GirlFriend gilrfriend = new GirlFriend();
		Concierge concierge = new Concierge();
		
		concierge.registerObserver(gilrfriend);
		concierge.monitor();
	}
}
