package moduloTratDeErro;

public class CheckVSNoCheck {

	public static void main(String[] args) {
		
		//As i throw a exception not checked, i can or not treated
		try {
			error1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Error 3#");
		}
		
		//As i throw a checked exception and i not treated, i need do this here 
		try {
			error2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		error3();
		
		System.out.println("End XD");
	}
	
	//Exceptions of Runtime is NOT CHECKED: i can or not treating this
	//I can do exceptions, but i need throw this
	static void error1 () {
		//I'm launching a new exception of Runtime Exception with a message
		//I only can launching a exception something that inherit of Throwable
		throw new RuntimeException("It's happened the error 1#");
	}
	
	//Exceptions of Exception is CHECKED: i NEED put in assign of method that i'm launching  
	static void error2 () throws Exception {
		throw new Exception("It's happened the error 2#");
	}
	
	static void error3 () {
		try {
			new Exception("It's happened the error 2#");
		} catch (Exception e) {
			System.out.println("Erroe 3#");
		}
	}
}
