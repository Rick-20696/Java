package moduloPoo.Polimorfismo.Estático;

public class People {
	private double weight;
	
	//build
	public People (double weight) {
		setWeight(weight);
	}
	
	//here i'm making a static polymorphism
	
	//i'm overloading the method "eat"
	public void eat (Been been) {
		this.weight += been.getWeight();
	}

	public void eat (Rice rice) {
		this.weight += rice.getWeight();
	}
	
	public void eat (IceCream iceCream) {
		this.weight += iceCream.getWeight();
	}
	
	//get and set
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight >= 0)
			this.weight = weight;
	}
}
