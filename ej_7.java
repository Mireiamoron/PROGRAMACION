package daw1t.tarea3;
import java.util.Scanner;
public class ej_7 {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        final int ALUMNOS = 5;

	        int[] trimestre1 = new int[ALUMNOS];
	        int[] trimestre2 = new int[ALUMNOS];
	        int[] trimestre3 = new int[ALUMNOS];

	       
	        System.out.println("Introduce las notas del 1º trimestre:");
	        for (int i = 0; i < ALUMNOS; i++) {
	            System.out.print("Alumno " + (i+1) + ": ");
	            trimestre1[i] = sc.nextInt();
	        }

	        System.out.println("Introduce las notas del 2º trimestre:");
	        for (int i = 0; i < ALUMNOS; i++) {
	            System.out.print("Alumno " + (i+1) + ": ");
	            trimestre2[i] = sc.nextInt();
	        }

	        System.out.println("Introduce las notas del 3º trimestre:");
	        for (int i = 0; i < ALUMNOS; i++) {
	            System.out.print("Alumno " + (i+1) + ": ");
	            trimestre3[i] = sc.nextInt();
	        }

	       
	        double media1 = 0, media2 = 0, media3 = 0;

	        for (int i = 0; i < ALUMNOS; i++) {
	            media1 += trimestre1[i];
	            media2 += trimestre2[i];
	            media3 += trimestre3[i];
	        }

	        media1 /= ALUMNOS;
	        media2 /= ALUMNOS;
	        media3 /= ALUMNOS;

	        System.out.println(" MEDIAS DEL GRUPO ");
	        System.out.println("Media 1º trimestre: " + media1);
	        System.out.println("Media 2º trimestre: " + media2);
	        System.out.println("Media 3º trimestre: " + media3);

	       
	        System.out.print("Introduce la posición del alumno (1-5): ");
	        int pos = sc.nextInt() - 1;

	        if (pos < 0 || pos >= ALUMNOS) {
	            System.out.println("Posición incorrecta.");
	        } else {
	            double mediaAlumno = (trimestre1[pos] + trimestre2[pos] + trimestre3[pos]) / 3.0;
	            System.out.println("La media del alumno en posición " + (pos+1) + " es: " + mediaAlumno);
	        }

	       
	    }
	}


