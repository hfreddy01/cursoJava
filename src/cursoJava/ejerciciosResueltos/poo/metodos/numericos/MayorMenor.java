package cursoJava.ejerciciosResueltos.poo.metodos.numericos;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 1 - CONFECCIONAR UNA CLASE QUE PERMITA INGRESAR TRES VALORES POR TECLADO. LUEGO MOSTRAR EL MAYOR Y EL MENOR.
 *
 */

public class MayorMenor {

	
	// METODO QUE PERMITE CARGAR LOS VALORES POR TECLADO.
	public void cargarValores() {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese primer valor : ");
		int num1 = teclado.nextInt();
		

		System.out.println("Ingrese segundo valor : ");
		int num2 = teclado.nextInt();
		

		System.out.println("Ingrese tercer valor : ");
		int num3 = teclado.nextInt();
		
		int mayor = calcularMayor(num1, num2, num3);
		int menor = calcularMenor(num1, num2, num3);
		
		System.out.println("El valor mayor de los tres numeros ingresado es : " +mayor);
		System.out.println("El valor menor de los tres numeros ingresado es : " +menor);

	}
	
	// METODO QUE PERMITE CALCULAR EL VALOR MAYOR.
	public int calcularMayor(int num1, int num2, int num3) {
		int mayor;
			
		// VALIDAMOS.
		if(num1 > num2 && num1 > num3) {
			mayor = num1;
			
	     } else if(num2 > num3) {
			 mayor = num2;
			 
		 } else {
			 mayor = num3;
		 }
			return mayor;	
	}
	
	
	// METODO QUE PERMITE CALCULAR EL VALOR MENOR.
	public int calcularMenor(int num1, int num2, int num3) {
		int menor;

		if(num1 < num2 && num1 < num3) {
			menor = num1;
		} else if(num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
		return menor;			
	}
}
