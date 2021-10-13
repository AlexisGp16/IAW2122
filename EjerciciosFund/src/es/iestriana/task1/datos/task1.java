package es.iestriana.task1.datos;

import java.util.Scanner;

public class task1 {
	/* The user must enter the price of a product (it can be with decimals). 
	 * The price of the product must be shown applying a previously stored VAT with a value of 21%, 18% and 9%.
	 */
	private static Scanner iv = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Dime el precio del producto: ");
		double producto = iv.nextDouble();
		
		double iva9 = producto + (producto * 0.09);
		double iva18 = producto + (producto * 0.18);
		double iva21 = producto + (producto * 0.21);
		
		System.out.println("El precio final del producto será: " + iva9 + " con un iva del 9%, " + iva18 + 
						" con un iva del 18%, y " + iva21 + " con un iva del 21%");
	}

}
