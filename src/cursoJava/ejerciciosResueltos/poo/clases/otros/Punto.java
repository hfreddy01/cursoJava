package cursoJava.ejerciciosResueltos.poo.clases.otros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 3 - DESARROLLAR UNA CLASE QUE REPRESENTE UN PUNTO EN EL PLANO Y TENGA LOS SIGUIENTES METODOS: CARGAR LOS VALORES DE X E Y,
 * IMPRIMIR EN QUE CUADRANTE SE ENCUENTRA DICHO PUNTO (CONCEPTO MATEMATICO PRIMER CUADRANTE SI X E Y SON POSITIVOS, SI X<0
 * E Y>0 SEGUNDO CUADRANTE ETC.)
 *
 */
public class Punto {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int x, y;
	
	// METODO QUE PERMITE INGRESAR LAS COORDENADAS POR TECLADO.
	public void cargarDatosCoordenadas() {
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingrese coordenada X :");
			x = teclado.nextInt();
			
			System.out.println("Ingrese coordenada Y :");
			y = teclado.nextInt();
			
		} catch(ArithmeticException e) {
		   e.printStackTrace();
			
		
	    } catch(Exception e) {
		  e.printStackTrace();

}
	}
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LOS CUADRANTES.
	public void imprimirCuadrante() {
		try {
			
			if(x>0 && y>0) {
				System.out.println("Se encuentra en el primer cuadrante.");
			} else if(x<0 && y>0) {
				System.out.println("Se encuentra en el segundo cuadrante");
			} else if(x<0 && y<0) {
				System.out.println("Se encuentra en el tercer cuadrante");
			} else if(x>0 && y<0) {
				System.out.println("Se encuentra en el cuatro cuadrante");
			} else {
				System.out.println("El punto no se encuantra en ningun cuadrante");
			}
			
	    } catch(ArithmeticException e) {
			   e.printStackTrace();	
			    } 
	}

}
