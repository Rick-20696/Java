package moduloPoo.Herança.Desafio;

public class Car {
	private final double maxVelocity;
	private double velocity = 0;
	protected int acceleration = 2;
	
	Car (double maxVelocity){
		this.maxVelocity = maxVelocity;
		this.acceleration = 2;
	}
	
	public String toString () {
		return "The velocity is " + velocity;
	}
	public void speed () {
		if (velocity + acceleration < maxVelocity)
			velocity += acceleration;
		else
			velocity = maxVelocity;
	}
	
	public boolean brake () {
		if (velocity == 0) {
			return false;
		}
		if (velocity > 0)
			velocity -= acceleration;
			return true;
	}
}
