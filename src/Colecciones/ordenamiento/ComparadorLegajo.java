package Colecciones.ordenamiento;

import java.util.Comparator;

public class ComparadorLegajo implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getLegajo().compareTo(o2.getLegajo());
	}

}
