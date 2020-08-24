package moduloPoo.Polimorfismo.Dinâmico;

//Abstract Class must have "abstract" before of "Class"
public abstract class Food {
	/*
	 * The abstract class is a Class no finished.
	 * Can't be instanced because is abstract. 
	 * Can have all methods completed or no
	 */
	
	private double weight;
	
	public Food (double weight) {
		setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight >= 0)
			this.weight = weight;
	}
}
