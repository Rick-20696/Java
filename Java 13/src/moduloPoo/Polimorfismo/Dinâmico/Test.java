package moduloPoo.Polimorfismo.Dinâmico;

public class Test {

	public static void main(String[] args) {
		People p1 = new People(55.22);
		
		System.out.println(p1.getWeight());
		
		p1.eat(new Rice(0.25));
		p1.eat(new Bean(0.15));
		p1.eat(new IceCream(0.35));
		
		//have a problem here...
		//Food is a generic Class, a Abstract class, as can i eat something abstract? 
		//p1.eat(new Food(0.05));
		System.out.println(p1.getWeight());
	}	
}
