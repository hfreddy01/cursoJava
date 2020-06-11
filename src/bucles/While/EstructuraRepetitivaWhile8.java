package bucles.While;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)
 *
 */

public class EstructuraRepetitivaWhile8 {
	
	// METODO QUE PERMITE REALIZAR LA OPERACION.
	public void getOperacion() {
		// CREAMOS VARIABLE.
		int x = 1;
		int termino = 11;
		
		// VALIDAMOS.
		while(x <= 25) {
			System.out.println(termino);
			System.out.println(" - ");
			x++;
			termino = termino + 11;
		}
		
	}

}
