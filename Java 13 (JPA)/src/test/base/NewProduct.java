package test.base;

import infra.DAO;
import models.base.Product;

public class NewProduct {
	public static void main(String[] args) {
		//Como eu tenho o meu DAO, tenho que apenas criar para fazer as tarefas
		DAO<Product> dao = new DAO<>();
		Product product = new Product("G6", 790.90);
		
		dao.beginTransaction().insert(product).commitTransaction().closeDAO();
	}
}
