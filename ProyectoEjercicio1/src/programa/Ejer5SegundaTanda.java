package programa;

import java.util.Scanner;

public class Ejer5SegundaTanda {
	//Recursividad
	/*
	 Programa que lea un número entero N de 5 
	 cifras y muestre sus cifras igual que en el ejemplo.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un número de 5 cifras:\n");
		Scanner scan = new Scanner(System.in);
		int numero=scan.nextInt();
//		while(!validarIngreso(numero)) {
//			System.out.println("Número incorrecto, vuelva a ingresar un número de 5 cifras");
//			scan = new Scanner(System.in);
//			numero=scan.nextInt();
//		}
		numero=validarIngreso(numero,scan);
		
	}

	public static int validarIngreso(int numero, Scanner scaner) {
		if(numero>10000 && numero<99999) {
			return numero;
		}
		else {
			System.out.println("El valor es incorrecto, reingrese un nùmero de 5 cifras");
			numero=scaner.nextInt();
			return validarIngreso(numero,scaner);
		}
	}
}
