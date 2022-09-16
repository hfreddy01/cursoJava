package cursoJava.ejerciciosResueltos.operadores.logicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursojava
 * 
 *  3 - REALIZAR UN PROGRAMA QUE PIDA UNA FECHA CUALQUIERA, LUEGO VERIFICAR SI DICHA FECHA CORRESPONDE A NAVIDAD.
 *
 */

public class EjerciciosOperadores3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES
		int dia, mes, anio;
		
		JOptionPane.showMessageDialog(null, "Ingrese fecha y verifque que corresponda a navidad");
		
		// INTRODUCIMOS DATOS POR TECLADO.
		System.out.println("Ingrese dia");
		dia = teclado.nextInt();
		
		System.out.println("Ingrese mes");
		mes = teclado.nextInt();
		
		System.out.println("Ingrese año");
		anio = teclado.nextInt();
		
		// VALIDAMOS.
		if(dia == 24 && mes == 12) {
			System.out.println("Corresponde a navidad!!!");
		}

	}

}
