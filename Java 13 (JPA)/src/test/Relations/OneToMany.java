package test.Relations;

import infra.DAO;
import models.Relations.OneToMany.Item;
import models.Relations.OneToMany.Request;
import models.base.Product;

public class OneToMany {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Product product = new Product("Mesa", 355.50);
		Request request = new Request();
		Item item = new Item(request, 2, product);
		
		dao.beginTransaction().insert(product).insert(request).insert(item).commitTransaction().closeDAO();
	}
}
