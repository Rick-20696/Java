package moduloGenerics.ComHerança;

import moduloGenerics.Box2;

//I can do a constraint to the Class like this
public class BoxDouble<N extends Number> extends Box2<N>{
	/*
	 * Number is the father Class of all Wrappers that are numbers.
	 * 
	 * When i do that, the instance not will receive anything that not it's a number 
	 */
}
