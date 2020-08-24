package moduloPoo.Herança.Desafio;

public interface Sporty {

	/*
	 * Interface is a "class" that has behaviors, but don't are defined. Interface has no body!
	 * I can't implement the method here because there will be a class inheriting this interface,
	 * and a class can has the same behavior, but it using different
	 * 
	 * The Class that will inherit of Interface, will have implements the behavior
	 */

	//by default, all method of a Interface is Public and Abstract (has no body)
	public abstract void onTurbo();
	void offTurbo();
}
