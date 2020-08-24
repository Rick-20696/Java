package moduloSwing.Standards.Observer;

import java.util.Date;

public class BirthdayArrivalEvent {
	//This it's a Class Event. Have all informations of event
	private final Date moment;

	public BirthdayArrivalEvent(Date moment) {
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}
		
}
