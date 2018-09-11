package Colecciones.ordenamiento;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {

	public static void main(String[] args) {
		List<Estudiante> lista = new ArrayList<>();
		
		lista.add(new Estudiante(123, 22, "Martin"));
		lista.add(new Estudiante(129, 23, "Tobias"));
		lista.add(new Estudiante(126, 21, "Adrian"));
		lista.add(new Estudiante(122, 19, "Diego"));
		lista.add(new Estudiante(127, 24, "Susana"));
		lista.add(new Estudiante(125, 27, "Sebastian"));
		lista.add(new Estudiante(120, 29, "Juan Pablo"));
		
		System.out.println("Lista sin ordenar");
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		
		System.out.println("Lista ordenada por edad");
		Collections.sort(lista, new ComparadorEdad());
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		Collections.sort(lista, new ComparadorLegajo());
		
		System.out.println("Lista ordenada por legajo");
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		
		System.out.println("Lista ordenada por nombre");
		
		Collections.sort(lista, new Comparator<Estudiante>(){
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		} );
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		Comparator<Estudiante> porNombre = (Estudiante o1, Estudiante o2)->o1.getNombre().compareTo(o2.getNombre());
				
		Collections.sort(lista, porNombre);
		
		System.out.println("Ordenada con lambda");
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
	}

}
