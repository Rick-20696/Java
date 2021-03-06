package test.Relations;

import infra.DAO;
import models.Relations.OneToMany.Item;
import models.Relations.OneToMany.Request;

public class OneToMany2 {
	public static void main(String[] args) {
		DAO<Request> dao = new DAO<>(Request.class);
		
		Request request = dao.getById(1L);
		
		/*
		 * Doing a query where i have a relation biDirectionally i not have all result together!
		 * 
		 * The Hibernate will do a select of Request, after will do other select by Item.
		 * The JPA will only to bring the Items if i want. This has to do with Entity-Loading
		 */
		
		/*
		 * Entity-Loading is when two entity are related and when i do a query, one entity pull the other, as in the example above
		 * 
		 * Exist two type of loading -> Lazy X EAGER
		 * LAZY - late loading, happens because a Entity have a List of entity in the relation. If i bring all, i can have problems because this list can be too much.
		 * So, by default, in attributes that are a relation of "many" the Fetch is LAZY
		 * 
		 * EAGER - rushed loading, happens when a Entity have a attribute of relation of "one" to other entity. I can't have problems.
		 * So, by default is EAGER
		 * 
		 * The recommend is let all Fetch as default and do personalized queries
		 */
		for(Item items: request.getItems()) {
			System.out.println(items.getAmount());
		}
	}


}
