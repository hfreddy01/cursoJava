package cursoJava.ejerciciosResueltos.poo.metodos.Void;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 1 - CONFECCIONAR UNA CLASE QUE PERMITA INGRESAR VALORES ENTEROS POR TECLADO Y NOS MUESTRE LA TABLA DE MULTIPLICAR DE
 *     VALOR. FINALIZAR EL PROGRAMA AL INGRESAR EL -1
 *
 */

public class TablaMultiplicar {
	
	// MEOTOD QUE PERMITE CARGAR VALORES ENTEROS.
	public void cargarValores() {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		int num;
		
		do {
			 System.out.println("Ingrese valor : ");
			 num = teclado.nextInt();
			 if(num != -1) {
				 calcularValor(num);
			 }
		} while(num != -1);
	}
	
	// METODO QUE PERMITE CALCULAR TABLA DE MULTIPLICAR.
	public void calcularValor(int num) {
		// VALIDAMOS.
		for(int i = num; i<=num*10; i=i+num) {
			System.out.println(i + " - ");
		}
	}

}
