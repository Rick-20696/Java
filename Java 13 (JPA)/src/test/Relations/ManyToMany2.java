package test.Relations;

import infra.DAO;
import models.Relations.ManyToMany.Actor;
import models.Relations.ManyToMany.Film;

public class ManyToMany2 {
	public static void main(String[] args) {
		DAO<Film> dao = new DAO<>();
		Film filmA = new Film("Avengers: Ultimatum", 9.4);
		Film filmB = new Film("Avengers: Infinity War", 8.7);		
		
		Actor actor1 = new Actor("Chris Evans");
		Actor actor2 = new Actor("Chris Hemsworth");
		Actor actor3 = new Actor("Scarlett Johansson");
		Actor actor4 = new Actor("Elizabeth Olsen");
		
		filmA.addActors(actor4);
		filmA.addActors(actor3);
		filmA.addActors(actor2);
		filmA.addActors(actor1);
		
		filmB.addActors(actor1);
		filmB.addActors(actor2);
		filmB.addActors(actor3);
		
		//When i add the filmA, all actors and films will are persist
		
		dao.beginTransaction().insert(filmA).commitTransaction().closeDAO();
	}
}
