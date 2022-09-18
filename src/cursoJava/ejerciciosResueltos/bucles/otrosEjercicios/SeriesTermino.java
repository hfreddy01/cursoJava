package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE BUCLE WHILE
 * 
 *         REALIZAR UN PROGRAMA QUE IMPRIMA 25 TERMINOS DE LA SERIE 11 - 22 - 33
 *         - 44, ETC. NOTA (NO SE INGRESAN VALORES POR TECLADO)
 * 
 */

public class SeriesTermino {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int x = 1;
		int termino = 11;
		// VALIDAMOS.
		while (x <= 25) {
			System.out.println(termino);
			System.out.println(" -- ");
			x++;
			termino = termino + 11;
		}
	}
}
