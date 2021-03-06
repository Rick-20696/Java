package test.Relations;

import infra.DAO;
import models.Relations.OneToOne.Client;
import models.Relations.OneToOne.Seat;

public class OneToOne {
	public static void main(String[] args) {
		//I can do a DAO for each Class, but i can do a single of Object type since i am not going to make queries
		DAO<Object> dao = new DAO<>();
		Seat seat = new Seat("A1");
		Client client = new Client("Ricardo", seat);
		
		//By rule, i need to insert the Seat before inserting the Client. But the JPA can solving
		//The JPA will save the Client without the Seat, but after the add the seat will update the client.
		dao.beginTransaction().insert(client).insert(seat).commitTransaction().closeDAO();;
	}
}
