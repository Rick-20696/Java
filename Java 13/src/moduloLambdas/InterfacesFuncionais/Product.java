package moduloLambdas.InterfacesFuncionais;

public class Product {
	String name;
	double price;
	double discount;
	
	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return name + "costs $ " + price;
	}
}
