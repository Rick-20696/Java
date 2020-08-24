package moduloPoo.Encapsulamento;

public class People {
	/*how i can read a attribute private? With Getters 
	 *And reading? Setters
	 *If the attribute be public/default, it's exposed
	 */
	private int age;
	
	public People(int age) {
		setAger(age);
	}
	
	//the advantage is that you change behaviors without changing a class that is calling
 
	//Getter: return the privates values
	public int getAge() {
		return age;
	}
	
	//i can have protection mechanism
	public void setAger(int age) {
		if (age >= 0 && age <= 100)
			this.age = age;
	}
}
