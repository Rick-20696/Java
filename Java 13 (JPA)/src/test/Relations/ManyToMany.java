package test.Relations;

import infra.DAO;
import models.Relations.ManyToMany.Nephew;
import models.Relations.ManyToMany.Uncle;

public class ManyToMany {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Uncle u1 = new Uncle("Zé");
		Uncle u2 = new Uncle("Bela");
		Nephew n1 = new Nephew("Lala");
		Nephew n2 = new Nephew("Lola");
		
		//I need keep coherent the relation when i go to add because i need do in the other side
		
		u1.getNephews().add(n1);
		u1.getNephews().add(n2);
		u2.getNephews().add(n1);
		u2.getNephews().add(n2);
		
		n1.getUncles().add(u1);
		n1.getUncles().add(u2);
		n2.getUncles().add(u1);
		n2.getUncles().add(u2);
		
		dao.beginTransaction().insert(u1).insert(u2).insert(n1).insert(n2).commitTransaction().closeDAO();
	}
}
