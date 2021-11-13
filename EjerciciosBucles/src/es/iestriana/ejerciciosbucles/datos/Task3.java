package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Task3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int contador = 0;
		int contadorespacios = 1;
		int contadorpares = 0;
		int sumaimpares = 0;
		do {
			System.out.println("Nº1: ");
			num1 = sc.nextInt();
			System.out.println("Nº2: ");
			num2 = sc.nextInt();
		} while (num1 >= num2);
		
		while (num1 < num2)
		{
			contadorespacios++;
			if(contadorespacios==7) {
				System.out.println("Numero separado en 7 unidades es: " + num1);
				contadorespacios = 0;
				contador++;
				if (num1 % 2 == 0) {
					contadorpares++;
				} else {
					sumaimpares+=num1;
				}
			}
			num1++;
		}
		System.out.println("La cantidad de numeros separados 7 unidades es:" + contador + " La cantidad de numeros pares es: " + contadorpares +
				" La suma de los numeros impares es: " + sumaimpares);
		
	}

}
