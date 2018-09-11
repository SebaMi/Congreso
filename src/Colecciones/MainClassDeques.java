package Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

import clase1.genericos.Persona;

public class MainClassDeques {

	public static void main(String[] args) {
		Deque<Persona> pila = new ArrayDeque<>();
		Deque<Persona> cola = new ArrayDeque<>();
		Deque<Persona> cila = new ArrayDeque<>();
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setName("AA");
		p2.setName("BB");
		p3.setName("CC");
		p4.setName("DD");
		
		pila.push(p1); 
		pila.push(p2); 
		pila.push(p3); 
		pila.push(p4); 
		
		cola.add(p1);
		cola.add(p2);
		cola.add(p3);
		cola.add(p4);
		
		cila.add(p1);
		cila.push(p2);
		cila.add(p3);
		cila.push(p4);
		
		for (Persona persona : pila) {
			System.out.println("peek: "+ pila.peek().getName());
			System.out.println("Despues de peek: "+pila.size());
			System.out.println("Pila: "+ pila.pop().getName());
			System.out.println("Despues de pop: "+pila.size());
			
		}
		
		System.out.println("---------------------");
		
		for (Persona persona : cola) {
			System.out.println(cola.peek().getName());
			System.out.println("Cola: "+ cola.remove().getName());
			System.out.println("Despues de remove: "+cola.size());
		}
		
		for (Persona persona : cila) {
			System.out.println(persona.getName());
			System.out.println(cila.pop().getName());
		}
		
	}

}
