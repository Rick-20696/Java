package test;

import java.util.List;

import infra.DAO;
import models.Relations.ManyToMany.Film;

public class NamedQuery {
	public static void main(String[] args) {
		DAO<Film> dao = new DAO<>(Film.class);
		List<Film> films = dao.namedQuery("noteFilmsBiggerThan", "note", 8.1);
		
		for(Film movies: films) {
			System.out.println(movies.getName() + " note -> " + movies.getNote());
		}
	}
}
