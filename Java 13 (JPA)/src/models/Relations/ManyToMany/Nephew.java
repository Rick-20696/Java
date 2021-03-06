package models.Relations.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Nephew {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	/*
	 * In a relation biDirectionally i have a side that is mapping and a side that is only biDirectionally, as in this type of relation (many to many) i need of a 3º Entity intermediate
	 * The name will be sideBi_sideMap; in this case: Uncle_Nephew
	 */
	@ManyToMany(mappedBy = "nephews")
	private List<Uncle> uncles = new ArrayList<>();

	public Nephew() {
		
	}
	
	public Nephew(String name) {
		super();
		this.name = name;
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

	public List<Uncle> getUncles() {
		return uncles;
	}

	public void setUncles(List<Uncle> uncles) {
		this.uncles = uncles;
	}

	
}
