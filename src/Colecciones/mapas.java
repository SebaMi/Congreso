package Colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import clase1.genericos.Persona;

public class mapas {

	public static void main(String[] args) {
		Map<String,Persona> mapaPersonas = new HashMap<>();
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setName("AA");
		p2.setName("BB");
		p3.setName("CC");
		p4.setName("AA");
		
		mapaPersonas.put("A",p1); 
		mapaPersonas.put("B",p2); 
		mapaPersonas.put("C",p3); 
		mapaPersonas.put("D",p4); 
		
		Set<String> claves = mapaPersonas.keySet();
		
		for (String clave : claves) {
			System.out.println("clave: "+ clave + " valor: "+ mapaPersonas.get(clave).getName());
		}
	}

}
