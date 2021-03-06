package models.Relations.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.base.Product;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private int amount;

	@Column(nullable = false)
	private Double price;
	
	//On this side i don't have "mappedBy" because i marked the relation here
	@ManyToOne(fetch = FetchType.EAGER)
	private Request request;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Product product;
	
	public Item() {}
	
	public Item(Request request, int amount, Product product) {
		this.setRequest(request);
		this.setAmount(amount);
		this.setProduct(product);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Request getRequest() {
		return request;
	}
	
	public void setRequest(Request request) {
		this.request = request;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
		
		if(product != null && price == null)
			this.setPrice(product.getPrice());
	}
}
