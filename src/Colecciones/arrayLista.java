package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class arrayLista {
	
	public static void main(String[] args) {
	
		List<Integer> arr = new ArrayList<>(10);
	
		for(int i=0; i < 10 ;i++) {
			arr.add(i,(int) Math.pow(i+1,2));
		}

	
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	
		int numero = 5;
	
		System.out.println("La potencia de "+numero+ " es: "+ arr.get(numero-1));
		
	}
}
