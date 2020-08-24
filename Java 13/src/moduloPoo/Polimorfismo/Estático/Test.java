package moduloPoo.Polimorfismo.Estático;

public class Test {

	public static void main(String[] args) {
		People p1 = new People(99.2);

		System.out.println(p1.getWeight());
		
		p1.eat(new Been (0.1));
		p1.eat(new Rice (0.24));
		p1.eat(new IceCream (0.34));

		System.out.println(p1.getWeight());
	}
}
