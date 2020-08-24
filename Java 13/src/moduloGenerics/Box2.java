package moduloGenerics;

public class Box2 <Type>{
	//This is a Generic Class
	private Type object;
	
	public Type getObject () {
		return object;
	}
	
	public void setObject (Type Type) {
		object = Type;
	}
}
