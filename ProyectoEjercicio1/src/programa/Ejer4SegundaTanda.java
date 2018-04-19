package programa;

import java.util.Scanner;

public class Ejer4SegundaTanda {

	/*
	 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centigrados=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el valor de la temperatura en ºC");
		centigrados=scan.nextDouble();
		double F=farenheit(centigrados);
		System.out.println("La temperatura en grados farenheit es: "+F);
	}

	public static double farenheit(double c) {
		double f=0;
		f=32+(9*c)/5;
		return f;
	}
}
