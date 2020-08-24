package moduloGenerics;

public class TestPair {

	public static void main(String[] args) {
		Pairs<Integer, String> approveds = new Pairs<>();
		
		approveds.addItem(1, "Aline");
		approveds.addItem(2, "Teixeira");
		approveds.addItem(3, "Ramos");
		approveds.addItem(4, "Barbos");
		//Testing the mechanism
		approveds.addItem(4, "Ricardo");
		
		System.out.println(approveds.getValue(1));
		System.out.println(approveds.getValue(4));
	}
}
