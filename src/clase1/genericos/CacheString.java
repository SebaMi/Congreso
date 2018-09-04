package clase1.genericos;

public class CacheString {
	private String s;
	
	public void guardar(String str) {
		this.s = str;
	}

	public String obtener() {
		return this.s;
	}
}
