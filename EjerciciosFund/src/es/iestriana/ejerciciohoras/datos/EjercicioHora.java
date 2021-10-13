package es.iestriana.ejerciciohoras.datos;

import java.util.Scanner;

public class EjercicioHora {
	
	private static Scanner sg = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Dime los segundos: ");
		int num = sg.nextInt();
		
		int horas = (num/3600);
		int minutos = (num-(3600*horas))/60;
		int segundos = num-((horas*3600)+(minutos*60));
				
				
		System.out.println("Son " + horas + " horas " + minutos + " minutos " 
							+ segundos + " segundos");

	}

}
