package moduloTratDeErro.PersonalizadoChecada;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{
	private String nameAtt;

	public NegativeNumberException(String nameAtt) {
		this.nameAtt = nameAtt;
	}

	public String getMessage() {
		return String.format("The attribute %s is invalid", nameAtt);
	}
}
