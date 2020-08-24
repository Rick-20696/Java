package moduloLambdas;

public class Multiply implements Calc{

	@Override
	public double execute(double a, double b) {
		double result = a *  b;
		return result;
	}
}
