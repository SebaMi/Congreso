package Colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import clase1.genericos.Persona;

public class Sets {

	public static void main(String[] args) {
		
		Set<Persona> treeset = new TreeSet<>();  // respeta la unicidad y los agrega ordenados (implementa sortedSet)
		Set<Persona> hashset = new HashSet<>();	 //

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setName("AA");
		p2.setName("BB");
		p3.setName("CC");
		p4.setName("AA");
		
		System.out.println("hash");
		System.out.println(hashset.add(p3));
		System.out.println(hashset.add(p2));
		System.out.println(hashset.add(p1));
		System.out.println(hashset.add(p4));
		
		System.out.println("tree");
		System.out.println(treeset.add(p1));
		System.out.println(treeset.add(p2));
		System.out.println(treeset.add(p3));
		System.out.println(treeset.add(p4));
		
		for(int i=0; i<5; i++) {
			p1.setName("Juan"+i);
			treeset.add(p1);
		}
		
		for (Persona persona : treeset) {
			System.out.println(persona.getName());
		}
		
		for (Persona persona : hashset) {
			System.out.println(persona.getName());
		}
	}

}
