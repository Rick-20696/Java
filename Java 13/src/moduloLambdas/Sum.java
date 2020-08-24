package moduloLambdas;

public class Sum implements Calc{

	@Override
	public double execute(double a, double b) {
		double result = a + b;
		return result;
	}
}
