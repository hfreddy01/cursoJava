package cursoJava.ejerciciosResueltos.poo.metodos.constructor;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 5 - IMPLEMETAR LA CLASE OPERACIONES. SE DEBEN CARGAR LOS VALORES ENTEROS EN EL CONSTRUCTOR, CALCULAR SU SUMA, RESTA, 
 *     MULTIPLICACION Y DIVISION, CADA UNA EN UN METODO. IMPRIMIR DICHOS RESULTADOS.
 */

public class OperacionesCalculo {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private int num1, num2;
	
	// CONSTRUCTOR DE LA CLASE.
	public OperacionesCalculo() {
		// CREAMOS OBJETO SCANNER.
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese valor : ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese valor : ");
		num2 = teclado.nextInt();
	}
	
	// SUMA.
	public void sumar() {
		int result;
		result = num1 + num2;
		System.out.println("La Suma es : " +result);
	}
	
	// RESTA.
	public void restar() {
		int result;
		result = num1 - num2;
		System.out.println("La Resta es : " +result);
	}
	
	// MULTIPLICAR.
	public void multiplicar() {
		int result;
		result = num1 * num2;
		System.out.println("La Multiplicacion es : " +result);
	}
	
	// DIVISION.
	public void dividir() {
		int result;
		result = num1 / num2;
		System.out.println("La Division es : " +result);
	}
	

}
