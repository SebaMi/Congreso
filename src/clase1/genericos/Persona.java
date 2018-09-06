package clase1.genericos;

public class Persona implements Saludable, Comparable<Persona> {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		return p.getName().equals(this.getName());
	}



	@Override
	public String toString() {
		return "Soy Persona";
	}

	@Override
	public void imprimirPeso() {
		System.out.println("80");
		
	}

	@Override
	public int compareTo(Persona o) {
		System.out.println("usa compareTo");
			return this.getName().compareTo(o.getName());
			
	}

	@Override
	public int hashCode() {
		System.out.println("usa hashcode : " + this.getName().hashCode());
		return this.getName().hashCode();
	}
	
	

}
