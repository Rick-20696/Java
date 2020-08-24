package models.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Product {
	/*
	 * With the Hibernate i have many Annotations, Class, Interface, etc
	 * Mainly to do ORM, the Annotations i can pass parameters.
	 * Not all are needed, but it can help 
	 * 
	 * Example: precision of numbers will be 12, i defined with @Column.
	 */
	
	//Like i did to create the tables by JPA, when i do a query using the Class "User" the table "Product" will be built
	//If i add a new attribute will be updated, but if i to remove this attribute not will updated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pd_ID")
	private Long Id;
	
	@Column(name = "pd_Name", length = 40, nullable = false)
	private String name;
	
	@Column(name = "pd_Price", nullable = false, precision = 12, scale = 2)
	private Double price;

	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
