package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 3 - REALIZAR UN PROGRAMA QUE LEA POR TECLADO DOS NUMEROS, SI EL NUMERO PRIMERO ES MAYOR AL SEGUNDO INFORMAR SU SUMA 
        Y SU RESTA EN CASO CONTRARIO INFORMAR EL PRODUCTO Y LA DIVISION DEL PRIMERO RESPECTO AL SEGUNDO.
 *
 */
public class EstructuraCondicionalCompuesta2 {

	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int num1, num2, suma, resta, producto, division;
		String text1, text2;
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE SUELDO POR PANTALLA.
			text1 = JOptionPane.showInputDialog("Ingrese primer numero");
				
				// PASAMOS DE STRING A FLOAT CON parseFloat.
				num1 = Integer.parseInt(text1);
						
		        text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
				
				// PASAMOS DE STRING A FLOAT CON parseFloat.
				num2 = Integer.parseInt(text2);
				
				// VALIDAMOS
				if(num1 > num2) {
					suma = num1 + num2;
					resta = num1 - num2;
					System.out.println("La suma de los dos valores es : " +suma);
					System.out.println("La resta de los dos valores es : " +resta);
				} else {
					producto = num1 * num2;
					division = num1 / num2;
					System.out.println("El producto de los dos valores es : " +producto);
					System.out.println("La division de los dos valores es : " +division);
					
				}
 
	}

}
