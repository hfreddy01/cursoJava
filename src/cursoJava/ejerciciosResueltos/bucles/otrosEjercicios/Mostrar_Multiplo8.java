package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE WHILE :
 * 
 *         MOSTRAR LOS MULTIPLOS DE 8 HASTA EL VALOR 500. DEBE APRECER EN
 *         PALTALLA 8 - 16 - 24, ETC.
 *
 */

public class Mostrar_Multiplo8 {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int multiplo8 = 8;
		// VALIDAMOS.
		while (multiplo8 <= 500) {
			System.out.println(multiplo8);
			System.out.println(" - ");
			multiplo8 = multiplo8 + 8;
		}
	}
}
