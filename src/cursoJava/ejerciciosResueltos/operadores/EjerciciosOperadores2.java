package cursoJava.ejerciciosResueltos.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 2 - SE CARGA UNA FECHA(DIA Y MES) POR TECLADO. MOSTRAR UN MENSAJE SI CORRESPONDE AL PRIMER TRIMESTRE DEL AÑO 
*      (ENERO, FEBRERO MARZO) CARGAR POR TECLADO EL VALOR NUMERICO DEL DIA, Y MES. EJEMPLO : dia:10 mes:1
 *
 */

public class EjerciciosOperadores2 {

	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Ingrese fecha que corresponda al primer trismetre del año");
		// CREAMOS VARIABLES.
		int dia, mes, anio;
		
		// INGRESAMOS DATOS POR TECLADO.
		System.out.println("Ingrese dia");
		dia = teclado.nextInt();
		
		System.out.println("Ingrese mes");
		mes = teclado.nextInt();
		
		System.out.println("Ingrese año");
		anio = teclado.nextInt();
		
		// VALIDAMOS.
		if(mes == 1 || mes == 2 || mes == 3) {
			System.out.println("Corresponde al primer trismetre del año");
		}
		

	}

}
