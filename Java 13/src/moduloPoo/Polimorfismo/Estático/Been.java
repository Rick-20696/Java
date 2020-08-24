package moduloPoo.Polimorfismo.Estático;

public class Been {
	private double weight;
	
	public Been (double weight) {
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
