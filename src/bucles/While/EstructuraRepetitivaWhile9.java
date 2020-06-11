package bucles.While;

/**
 * 
 * @author Freddy
 * 
 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc
 *
 */

public class EstructuraRepetitivaWhile9 {
	
	// METODO QUE REALIZA LA OPERACION.
	public void getOperacion() {
		// CREAMOS VARIABLES.
		int mult8 = 8;
		// 	VALIDAMNOS.
		while(mult8 <= 500) {
			System.out.println(mult8);
			mult8 = mult8 + 8;
			
		}
	}

}
