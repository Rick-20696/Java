package models.Relations.OneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date d;
	
	//Fetch is the type of loading to entity mapped
	@OneToMany(mappedBy = "request", fetch = FetchType.LAZY)
	private List<Item> items;
	
	public Request() {
		this(new Date());
	}
	
	public Request(Date d) {
		this.d = d;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
}