package Ejercicioscasa;

import java.util.Scanner;

public class Ej5b25 {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioComida = 0;
        double precioBebida = 0;
        String comida, bebida;

      
        System.out.print("¿Qué has tomado de comer (palmera, donut o pitufo)? ");
        comida = sc.nextLine().toLowerCase();

        switch (comida) {
            case "palmera":
                precioComida = 1.40;
                break;
            case "donut":
                precioComida = 1.00;
                break;
            case "pitufo":
                System.out.print("¿Era con aceite o con tortilla? ");
                String tipoPitufo = sc.nextLine().toLowerCase();
                if (tipoPitufo.equals("aceite")) {
                    precioComida = 1.20;
                } else if (tipoPitufo.equals("tortilla")) {
                    precioComida = 1.60;
                } else {
                    System.out.println("Tipo de pitufo no válido.");
            
                }
                break;
            default:
                System.out.println("Opción de comida no válida.");
                
        }

        System.out.print("¿Qué has tomado de beber (zumo o café)? ");
        bebida = sc.nextLine().toLowerCase();

        switch (bebida) {
            case "zumo":
                precioBebida = 1.50;
                break;
            case "café":
            case "cafe": 
                precioBebida = 1.20;
                break;
            default:
                System.out.println("Opción de bebida no válida.");
                return;
        }

      
        double total = precioComida + precioBebida;
      
    }
}

