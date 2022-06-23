package cursoJava.ejerciciosResueltos.clases;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 4 - DESARROLLAR UNA CLASE QUE REPRESENTE UN CUADRADO Y TENGA LOS SIGUIENTES METODOS; CARGAR EL VALOR DE SU LADO E IMPRIMIR SU
 * PERIMETRO Y SU SUPERFICIE.
 *
 */

public class Cuadrado {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int lado;
	
	// METODO QUE PERMITE CARGAR EL VALOR DEL LADO POR TECLADO.
	public void cargarValorLado() {
		// CREAMOS OBJETO ESCANNER.
		teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingrese el valor del Lado :");
			lado = teclado.nextInt();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR EL PERIMETRO DE UN CUADRADO.
	public void validarPerimetro() {
		int perimetro;
		
		try {
			
			perimetro = lado * 4;
			System.out.println("El perimetro del lado es : " +perimetro);
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LA SUPERFICIE DE UN LADO.
	public void validarSuperficie() {
		int superficie;
		
		try {
			
			superficie = lado * lado;
			System.out.println("La superficie del lado es : " +superficie);
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
