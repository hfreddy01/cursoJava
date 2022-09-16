package cursoJava.ejerciciosResueltos.operadores.logicos;
<<<<<<< HEAD

import java.util.Scanner;

import javax.swing.JOptionPane;

=======
>>>>>>> f267f9486b11f36775d0889a5f8690d0579c628a
/**
 * 
 * @author cursoJava
 * 
 * 1 - CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO TRES NUMEROS DISTINTOS Y NOS MUESTRE EL MAYOR.
 *
 */

public class EjerciciosOperadores1 {

<<<<<<< HEAD
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// MOSTRAMOS 
		JOptionPane.showMessageDialog(null, "CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO TRES NUMEROS DISTINTOS Y NOS MUESTRE EL MAYOR.");
		// CREAMOS VARIABLES.
		int num1, num2, num3;
		
		System.out.println("Ingrese primer numero");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo numero");
		num2 = teclado.nextInt();
		
		System.out.println("Ingrese tercer numero");
		num3 = teclado.nextInt();
		
		// VALIDAMOS.
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 +" es mayor");
		} else {
			if(num2 > num3) {
				System.out.println(num2 +" es mayor");
			} else {
				System.out.println(num3 +" es mayor");
			}
		}
=======
	public static void main(String[] args) {
		// TODO Auto-generated method stub
>>>>>>> f267f9486b11f36775d0889a5f8690d0579c628a

	}

}
