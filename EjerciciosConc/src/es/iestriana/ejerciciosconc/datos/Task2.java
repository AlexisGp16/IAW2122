package es.iestriana.ejerciciosconc.datos;

import java.util.Scanner;

public class Task2 {
	/*
	 * You are asked to read a positive whole number and determine if it is a 1,2,3 or 4-digit number.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Numero positivo entre 1 y 4 cifras: ");
		int num = sc.nextInt();
		int cifras = 1;
		
		if(num > 0 && num < 10000) {
			if(num/10 > 0) {
				cifras++;
			}if (num/100 > 0) {
				cifras++;
			}if(num/1000 > 0) {
				cifras++;
			}if(num/10000 > 0) {
				cifras++;
			}
			
			System.out.println("El numero tiene " + cifras + " cifras.");
		}else {
			System.out.println("El numero introducido no es correcto.");
		}
		
	}

}
