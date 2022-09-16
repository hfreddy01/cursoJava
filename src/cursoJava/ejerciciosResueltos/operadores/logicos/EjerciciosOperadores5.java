package cursoJava.ejerciciosResueltos.operadores.logicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 5 - SE INGRESAN POR TECLADO TRES NUMEROS, SI TODOS LOS VALORES INGRESADOS SON MENORES A 10 , IMPRIMIR EN PANTALLA
 *     UN MENSAJE  "TODOS LOS NUMEROS SON MENORES A DIEZ"
 *
 */
public class EjerciciosOperadores5 {

	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES.
		int num1, num2, num3;
			
		// PROGRAMA.
		JOptionPane.showMessageDialog(null, " 5 - SE INGRESAN POR TECLADO TRES NUMEROS, SI TODOS LOS VALORES INGRESADOS "
				                          + "SON MENORES A 10 , IMPRIMIR EN PANTALLA\r\n" 
				                          + "*  UN MENSAJE  \"TODOS LOS NUMEROS SON MENORES A DIEZ\"");
		
		// INTRODUCIMOS DATOS POR TECLADO.
		System.out.println("Ingrese primer numero");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo ");
		num2 = teclado.nextInt();
		
		System.out.println("Ingrese tercer numero");
		num3 = teclado.nextInt();
		
		// VALIDAMOS.
		if(num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los numeros son menores a Diez.");
		}

	 }

}
