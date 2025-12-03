package examen_ud3;

import java.util.Scanner;

public class ej1 {


	    // Excepción propia
	    static class DNIInvalidoException extends Exception {
	        public DNIInvalidoException(String mensaje) {
	            super(mensaje);
	        }
	    
	    }

	    public static String leerDNI() throws DNIInvalidoException {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el DNI (8 números y una letra): ");
	        String dni = sc.nextLine();

	        // Expresión regular: 8 dígitos + 1 letra
	        if (!dni.matches("[0-9]{8}[a-zA-Z]")) {
	            throw new DNIInvalidoException( "Formato de DNI inválido. Debe ser 8 números y una letra.");
	        }

	        return dni;
	    }


	    public static String cambiarDigito(String dni, int posicion, char nuevoValor)
	            throws DNIInvalidoException {

	       
	        if (posicion < 1 || posicion > 8) {
	            throw new DNIInvalidoException("La posición debe estar entre 1 y 8.");
	        }

	        // Comprueba que el nuevo valor sea un dígito
	        if (!Character.isDigit(nuevoValor)) {
	            throw new DNIInvalidoException("El nuevo valor debe ser un dígito numérico.");
	        }

	        char[] chars = dni.toCharArray();

	        chars[posicion - 1] = nuevoValor;

	        // La letra del final a mayúscula
	        chars[8] = Character.toUpperCase(chars[8]);

	        return new String(chars);
	    }


	    public static void main(String[] args) {
	        try {
	            String dni = leerDNI();
	            System.out.println("DNI válido: " + dni.substring(0, 8) + dni.substring(8).toUpperCase());

	            String dniModificado = cambiarDigito(dni, 3, '9');
	            System.out.println("DNI modificado: " + dniModificado);

	        } catch (DNIInvalidoException e) {
	            System.out.println("Error: " + e.getMessage());
	            
	            
	            
	        }
	    }
	    }


	

	            
	            
	       
	      


