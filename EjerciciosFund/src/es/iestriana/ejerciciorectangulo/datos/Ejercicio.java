package es.iestriana.ejerciciorectangulo.datos;

import java.util.Scanner;

public class Ejercicio {

	
	private static Scanner ba = new Scanner(System.in);
	private static Scanner al = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Dime la base en cm: ");
		double medidaBase = ba.nextDouble();
		System.out.println("Dime la altura en cm: ");
		double medidaAltura = al.nextDouble();
		
		double perimetro = (medidaBase + medidaBase + medidaAltura + medidaAltura);
		double area = (medidaBase * medidaAltura);
		
		System.out.println("La base son: " + medidaBase + " cm," + " la altura son: "
							+ medidaAltura + " cm" + " por lo tanto el perimetro es: " + perimetro
							+ " cm" + " y el area seria: " + area + " cm");
		
	}

}
