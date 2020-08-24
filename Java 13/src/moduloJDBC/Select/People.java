package moduloJDBC.Select;

public class People {
	private int cod;
	private String name;
	
	
	
	public People(int cod, String name) {
		this.cod = cod;
		this.name = name;
	}

	public int getCod() {
		return cod;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCod(int value) {
		cod = value;
	}
	
	public void setname(String name) {
		this.name = name;
	}
}
