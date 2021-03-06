package test.Relations;

import infra.DAO;
import models.Relations.OneToOne.Client;
import models.Relations.OneToOne.Seat;

public class OneToOne2 {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Seat seat = new Seat("A3");
		Client client = new Client("Josefa", seat);
		
		//In the case of insertAuto() i will have problems cause the Seat has not been inserted. This is a cascade operation and i need to make it clear in @OneToOne
		dao.insertAuto(client).closeDAO();
	}
}
