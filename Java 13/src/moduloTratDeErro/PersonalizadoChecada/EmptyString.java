package moduloTratDeErro.PersonalizadoChecada;

@SuppressWarnings("serial")
public class EmptyString extends Exception{
	private String nameAtt;

	public EmptyString(String nameAtt) {
		this.nameAtt = nameAtt;
	}

	public String getMessage() {
		return String.format("The attribute %s is empty", nameAtt);
	}
}
