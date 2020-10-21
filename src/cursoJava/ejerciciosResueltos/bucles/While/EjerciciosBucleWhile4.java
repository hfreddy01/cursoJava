package cursoJava.ejerciciosResueltos.bucles.While;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 4 - ESCRIBIR UN PROGRAMA QUE SOLICITE INGRESAR 10 NOTAS DE ALUNNOS Y NOS INFORME CUANTOS TIENEN NOTAS MAYORES O 
 *     IGUALES A 7 Y CUANTOS MENORES.
 *
 */

public class EjerciciosBucleWhile4 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "4 - ESCRIBIR UN PROGRAMA QUE SOLICITE INGRESAR 10 NOTAS DE ALUNNOS Y NOS INFORME "
		+ "CUANTOS TIENEN NOTAS MAYORES O \r\n" + "IGUALES A 7 Y CUANTOS MENORES.");
        
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES.
		int nota, contador1, contador2, x;
		x = 1;
		contador1 = 0;
		contador2 = 0;
		
		// VALIDAMOS.
		while(x <= 10) {
		  // INTRODUCIMOS DATOS POR TECLADO.
		  System.out.println("Introduzca nota");
		  nota = teclado.nextInt();
		  
		  // VALIDAMOS.
		  if(nota >= 7) {
			  contador1++;
		  } else {
			  contador2++;
		    }
		  
		  // INCREMENTAMOS X
		  x++;
		}
		
		// IMPRIMIMOS
		System.out.println("Cantidad de alumnos con notas mayores o iguales a 7 : " +contador1);
		System.out.println("Cantidad de alumnos con notas menores o iguales a 7 : " +contador2);
	}

}
