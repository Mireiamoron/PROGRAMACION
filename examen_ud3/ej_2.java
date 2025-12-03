package examen_ud3;
import java.util.Scanner;


public class ej_2 {
	    static void rellenaEncuesta(String[][] encuesta) {
	        Scanner sc = new Scanner(System.in);
	        int i = 0;
	    
	        	while (i < encuesta.length) {
	            System.out.println("Escribe el código postal (o 'fin' para terminar): ");
	            String codigopostal = sc.nextLine();

	            if (codigopostal.equalsIgnoreCase("fin")) {
	                break; 
	            }

	            encuesta[i][0] = codigopostal;
	           
	            System.out.println("Escribe la edad: ");{
	            	
	            }
	            encuesta[i][1] = sc.nextLine();

	            System.out.println("Escribe el sexo (M/F): ");
	            encuesta[i][2] = sc.nextLine();

	            i++;
	        }
	        }
	   
	    static void muestraResultados(String[][] encuesta) {
	        System.out.println("\n RESULTADOS DE LA ENCUESTA ");{
	        	
	        }
	       
		for (int i = 0; i < encuesta.length; i++) {
			if (encuesta[i][0] != null) {
				System.out.println("Código Postal: " + encuesta[i][0] + ", Edad: " + encuesta[i][1] + ", Sexo: " + encuesta[i][2]);{
				}
			}
		}
	    }
		static int calculaMediaEdad(String[][] encuesta, char Sexo, int codigoPostal) {
				int suma = 0;
				int contador = 0;

		for (int i = 0; i < encuesta.length; i++) {
		   if (encuesta[i][0] != null) {
					   int codigopostal = Integer.parseInt(encuesta[i][0]);
					   char Sexo = encuesta[i][2].charAt(0);

					   if (codigopostal== codigoPostal && Sexo == Sexo) {
					            int edad = Integer.parseInt(encuesta[i][1]);
					            suma += edad;
					            contador++;
					            
					            
					   if (contador == 0) {
				        return 0;
								}
					   return suma / contador;
					        }
					    }
					}
								}

								
		public static void main(String[] args) {
				String[][] encuesta = new String[500][3];
					rellenaEncuesta(encuesta);
					muestraResultados(encuesta);

		Scanner sc = new Scanner(System.in);
				System.out.println("\nIntroduce sexo para la media (M/F): ");
					char Sexo = sc.nextLine().charAt(0);

				System.out.println("Introduce código postal: ");
					int codigopostal = Integer.parseInt(sc.nextLine());

					int media = calculaMediaEdad(encuesta, Sexo, codigopostal);

				System.out.println("La media de edad es: " + media);
				
				
			}
}
								
								

									        
									  
									  
								    
									      
								        

					
