package m3ClassesEMetodos;

public class AreaCircMain {

	public static void main(String[] args) {
		AreaCirc a = new AreaCirc (3);
		//pi != PI
		a.pi = 5.18;
		//My method with the member of INSTANCE
		System.out.println(a.area ());
		//My method with the member of CLASS
		System.out.println(a.areaV());
		
		//I cannot change the value of "PI"
		
		//b.PI= 3.0;
		/*Errors that will occurs: 
		 *The camp should be accessed statically (The member belongs to class)
		 *The member cannot be assigned  
		 */
		
		//to access, just use "className.nameMember"
		System.out.println(AreaCirc.PI);
		
	}
}
