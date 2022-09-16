package cursoJava.ejerciciosResueltos.operadores.logicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 4 - SE INGRESAN TRES VALORES POR TECLADO, SI TODOS SON IGUALES SE IMPRIME LA SUMA DEL PRIMERO CON EL SEGUNDO Y A 
*      ESTE RESULTADO SE LO MULTIPLICA POR EL TERCERO
 *
 */

public class EjerciciosOperadores4 {

// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES.
		int num1;
		int num2;
		int num3;
		int suma;
		int producto;
		
		// MESSAGE.
		JOptionPane.showMessageDialog(null, "SE INGRESAN TRES VALORES POR TECLADO, SI TODOS SON IGUALES SE IMPRIME LA SUMA "
				                          + "DEL PRIMERO CON EL SEGUNDO Y A \r\n" 
				                          + "* ESTE RESULTADO SE LO MULTIPLICA POR EL TERCERO");
		
		// INTRODUCIMOS DATOS POR TECLADO.
		System.out.println("Ingrese primer numero :");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo numero :");
		num2 = teclado.nextInt();
		
		System.out.println("Ingrese tercer numero :");
		num3 = teclado.nextInt();
		
		// VALIDAMOS.
		if(num1 == num2 && num1  == num3) {
			suma = num1 + num2;
			System.out.println("La suma de los dos primeros numero es :" +suma);
			// MULTIPLICAMOS LA SUMA DEL PRIMER Y SEGUNDO NUMERO Y LO MULTIPLICAMOS POR EL TERCERO.
			producto = suma * num3;
			System.out.println("La suma del primero y segundo multiplicado por el tercero es : " +producto);
		}

	}

}
