package cursoJava.ejerciciosResueltos.clases;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 6 - IMPLEMETAR LA CLASE OPERACIONES. SE DEBEN CARGAR LOS VALORES ENTEROS, CALCULAR SU SUMA, RESTA, MULTIPLICACION Y DIVISION,
 *     CADA UNA EN UN METODO. IMPRIMIR DICHOS RESULTADOS.
 */


public class Operaciones {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int num1;
	private int num2;
	
	// METODO QUE PERMITE CARGAR LOS VALORES POR TECLADO.
	public void cargarValores() {
		// CREAMOS OBJETO SCANNER.
		teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingrese valor :");
			num1 = teclado.nextInt();
			
			System.out.println("Ingrese valor :");
			num2 = teclado.nextInt();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE SUMAR LOS VALORES.
	public void sumar() {
		int suma;
		
		try {
			
			suma = num1 +  num2;
			System.out.println("La suma de los valores ingresado es : " +suma);
			
		} catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE RESTAR LOS VALORES.
	public void resta() {
		int resta;
		
		try {
			
			resta = num1 -  num2;
			System.out.println("La resta de los valores ingresado es : " +resta);
			
		} catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE MULTIPLICAR LOS VALORES.
	public void multiplicacion() {
		int multiplicacion;
		
		try {
			
			multiplicacion = num1 *  num2;
			System.out.println("La multiplicacion de los valores ingresado es : " +multiplicacion);
			
		} catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE DIVIDIR LOS VALORES.
	public void division() {
		int division;
		
		try {
			
			division = num1 /  num2;
			System.out.println("La Division de los valores ingresado es : " +division);
			
		} catch(ArithmeticException e){
			e.printStackTrace();
		}
	}

}
