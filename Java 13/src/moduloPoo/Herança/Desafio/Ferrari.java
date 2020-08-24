package moduloPoo.Herança.Desafio;

//when a Class inherit of a Interface, use "implements" 
public class Ferrari extends Car implements Sporty{
	//validate that you is override the method
	//if you using this annotation in a method that not exist in super class, will give error
//	@Override
//	public void speed () {
//		if (velocity + 6< maxVelocity)
//			velocity += 6;
//		else
//			velocity = maxVelocity;
//	}

	public Ferrari() {
		super(40);
		this.acceleration = 6;
	}
	
	@Override
	public void offTurbo() {
		this.acceleration = 6;
	}
	
	@Override
	public void onTurbo() {
		this.acceleration = 10;		
	}
}
