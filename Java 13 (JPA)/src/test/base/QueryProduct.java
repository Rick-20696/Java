package test.base;

import java.util.List;

import infra.DAO;
import models.base.Product;

public class QueryProduct {
	public static void main(String[] args) {
		//Eu poderia fazer uma classe já com o DAO implementado, mas iria gerar mais arquivos
		DAO<Product> dao = new DAO<>(Product.class);
		
		List<Product> products = dao.beginTransaction().query(10, 0);
		
		for(Product p: products) {
			System.out.println("ID " + p.getId() + " Name" + p.getName());
		}
		
		dao.closeDAO();
	}
}
