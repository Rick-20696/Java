package moduloStream;

public class Student {
	final String name;
	final double note;
	
	public Student(String name, double note) {
		this.name = name;
		this.note = note;
	}

	@Override
	public String toString() {
		return name + " has note " + note;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(note);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(note) != Double.doubleToLongBits(other.note))
			return false;
		return true;
	}
	
	
}
