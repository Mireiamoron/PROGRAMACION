package Ejercicioscasa;

import java.util.Scanner;

public class Ej8_2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int edad;
	        int contadorAlumnos = 0;
	        int mayoresEdad = 0;
	        int sumaEdades = 0;

	        System.out.println("Introduce las edades de los alumnos (número negativo para terminar):");

	        while (true) {
	            System.out.print("Edad del alumno: ");
	            edad = sc.nextInt();

	            if (edad < 0) {
	                break; 
	            }

	            sumaEdades += edad;
	            contadorAlumnos++;

	            if (edad >= 18) {
	                mayoresEdad++;
	            }
	        }

	        		if (contadorAlumnos > 0) {
	        	
	        	    System.out.println("\n--- Resultados ---");
	        	    System.out.println("Número de alumnos: " + contadorAlumnos);
	        	    System.out.println("Suma de las edades: " + sumaEdades);
	        	    System.out.printf("Media de edad: %.2f\n", (double) sumaEdades / contadorAlumnos);
	        	    System.out.println("Alumnos mayores de edad: " + mayoresEdad);
	        	} else {
	        	    System.out.println("No se ha introducido ninguna edad válida.");
	        	}
	 }
}

