package moduloPoo.Polimorfismo.Dinâmico;

public class People {
	private double weight;
	
	//build
	public People (double weight) {
		setWeight(weight);
	}
	
	//here i'm making a dynamic polymorphism
	public void eat (Food food) {
		this.weight += food.getWeight();
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
