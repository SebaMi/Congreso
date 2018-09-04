package clase1.genericos;

public class MainClass {

	public static void main(String[] args) {
		CachePersona cp = new CachePersona();
		CacheString cs = new CacheString();
		
		CacheGenerica<Persona> cgp = new CacheGenerica<>();
		//CacheGenerica<String> cgs = new CacheGenerica<>();
		
		cgp.guardar(new Persona());
		cgs.guardar("un string");
		
		cgp.imprimirContenido();
		cgs.imprimirContenido();
	}

}
