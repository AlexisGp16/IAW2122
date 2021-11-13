package es.iestriana.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;


public class Task4 {
	
	/*
	 * Fill in a table of 10 numbers (random values from 1 to 20). 
	 * Perform a function that returns the most repeated number.
	 */

	
	private static int [] n;
	public static void main(String[] args) {
		
		n = new int [10];
		int masveces=0;
		
		inicializar();
		masveces=busqueda(n);
		System.out.println(masveces);
	}

	private static void inicializar() {

		for (int i = 0; i < 10; i++) {
			n[i] = new Random().nextInt(21);
		}
		
	}

	private static int busqueda(int[] n) {
		int repetido, contador=1, napariciones=0,naparicionesantes=0;
		int[] norepetido = new int[10];

		Arrays.sort(n);
		norepetido[0]=n[0];
		System.out.println(Arrays.toString(n));
	
		for (int i = 0; i < 9; i++) {
			if(n[i] != n[i+1]) {
				norepetido[contador]=n[i+1];
				contador++;
			}
			
		}

		repetido=norepetido[0];
		for (int i = 0; i < norepetido.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if(norepetido[i]==n[j]) {
					napariciones++;
				}
			}
			if(napariciones>naparicionesantes) {
				repetido=norepetido[i];
				naparicionesantes=napariciones;
			}
			napariciones=0;
		}		
		
		return repetido;
	}
}