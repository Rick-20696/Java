package moduloPoo.Abstrato;

public abstract class Notebook {

	//Here i can't implement this method because is more generic
	abstract String on();
	
	public String off() {
		return "All notebooks turns off with win + delete";
	}
}
