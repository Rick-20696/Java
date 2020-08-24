package moduloStream;

public class Average {

	 // I'm created a Class to calculated the average
	
	private double total;
	private int qntd;
	
	//I can have a Class as return, so i can chain methods
	public Average add(double value) {
		total += value;
		qntd++;
		
		return this;
	}
	
	public double getTotal() {
		return total / qntd;
	}
	
	static public Average comnineAverage (Average a1, Average a2) {
		Average result = new Average();
		result.total = a1.total + a1.total;
		result.qntd = a1.qntd + a2.qntd;
		
		return result;
	}
}
