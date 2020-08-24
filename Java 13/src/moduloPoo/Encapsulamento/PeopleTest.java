package moduloPoo.Encapsulamento;

public class PeopleTest {

	public static void main(String[] args) {
		People p1 = new People(-10);
		People p2 = new People(18);
		
		//so, i don't take the attribute
		//System.out.println(p1.age);
		
		//my protection mechanism doesn't accept negative values. 
		//So age will receive default value: 0 
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
		
		p2.setAger(19);
		System.out.println(p2.getAge());
	}
}
