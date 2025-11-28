package daw1t.tarea3;

import java.util.Scanner;

public class Ej3pt2 {
	
public static Scanner scanner = new Scanner(System.in);
	 
public static void main(String[] args) {

		
		System.out.print("Introduce tu año de nacimiento: ");
	        short añoNacimiento = scanner.nextShort();
	
	    System.out.print("Introduce el año actual: ");
	        short añoActual = scanner.nextShort();
	        
	        short edad = (short) (añoActual - añoNacimiento);
	        System.out.println("Tu edad es: " + edad + " años");
	        
	}
}
