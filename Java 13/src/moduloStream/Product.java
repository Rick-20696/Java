package moduloStream;

public class Product {

	public final String name;
	public final double price;
	public final double discount;
	public double frete;
	
	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public Product(String name, double price, double discount, double frete) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.frete = frete;
	}
	
	
}
