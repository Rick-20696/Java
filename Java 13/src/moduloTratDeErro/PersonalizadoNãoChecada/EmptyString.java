package moduloTratDeErro.PersonalizadoNãoChecada;

@SuppressWarnings("serial")
public class EmptyString extends RuntimeException{
	private String nameAtt;

	public EmptyString(String nameAtt) {
		this.nameAtt = nameAtt;
	}

	public String getMessage() {
		return String.format("The attribute %s is empty", nameAtt);
	}
}
