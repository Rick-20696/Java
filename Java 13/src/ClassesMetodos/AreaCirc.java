/*
 * Difference: member of class X member of instance  
 */
package m3ClassesEMetodos;
/*
 * A member of class, usually, is too constant.
 * The value is accessible in class.
 */
public class AreaCirc {
	//This is a member of instance: is defined for all
	double raio;
	//This is a member of class, does not appear in the instance
	static final double PI = 3.14;
	
	double pi;
	
	//We have a constructor personalized 
	AreaCirc(double raioX) {
		raio = raioX;
	}
	
	double area () {
		return pi*Math.pow(raio, 2);
	}
	
	double areaV () {
		return PI*Math.pow(raio, 2);
	}
}
