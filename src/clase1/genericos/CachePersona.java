package clase1.genericos;

public class CachePersona {
	private Persona p;
	
	public void guardar(Persona per) {
		this.p = per;
	}

	public Persona obtener() {
		return this.p;
	}
}
