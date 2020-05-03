package entities;

public class Alugueis {
	
	private String name;
	private String email;
	
	public Alugueis (String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return name
				+", "
				+email;
	}
}
