package models.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Like i define in that i want create the tables through this annotation the name of table will be the same of Class
@Entity
public class User {
	//Like i did the annotation "Entity" i will need to do a annotation "Id" in a attribute that will be ID on table
	//Now i need to reference this Class in archive XML
	
	/*
	 * By default, the columns created will be Varchar (String) without other integrity restrictions.
	 * If i want put some restriction, i need put the annotation column and define the type, integrity restriction.
	 * If i want that an attribute that does not go to database i put @Transient
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	public User() {
		
	}
	
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//Getters and Setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
