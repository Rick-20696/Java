package models.Relations.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double note;
	
	/*
	 * Another way it's do a association table with @JoinTAble
	 * 
	 * This annotation has two important sides: dominant side and dominated side (who has the "mappedBy")
	 * Dominant -> is the foreign key that reference the column from dominant table
	 * Dominated -> is the FK that reference the other column from dominated table 
	 */
	
	//This attribute will do a cascade operation, persist the actor in this List, when i persist the instance
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Films_Actors", 
	joinColumns = @JoinColumn(name = "Id_film", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "Id_actor", referencedColumnName = "id"))
	private List<Actor> actors = new ArrayList<>();

	public Film() {
		
	}
	
	public Film(String name, double note) {
		super();
		this.name = name;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	//I'll create a method to solve the problem of add in the two sides
	public void addActors(Actor actor) {
		if (actor != null && !actors.contains(actor)) {
			getActors().add(actor);
			
			if(!actor.getFilms().contains(this))
				actor.getFilms().add(this);
		}
	}
	
}
