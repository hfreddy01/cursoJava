package cursoJava.ejerciciosResueltos.condicionales.Switch;

/**
 * 
 * @author cursoJava
 * 
 *         GENERAR 100 VALORES ALEATORIOS COMPRENDIDOS ENTRE 1 Y 10. CONTAR
 *         CUANTOS SE GENERARON CON VALORES 1,5,10 Y LOS QUE NO SON NI 1,5,10
 *
 */

public class EjerciciosSwitch2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int cant1 = 0;
		int cant5 = 0;
		int cant10 = 0;
		int otros = 0;
		// VALIDAMOS.
		for (int i = 0; i < 100; i++) {
			int valor = (int) (Math.random() * 10) + 1;
			// VALIDAMOS.
			switch (valor) {
			case 1:
				cant1++;
				break;
			case 2:
				cant5++;
				break;
			case 3:
				cant10++;
				break;
			default:
				otros++;
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de veces que salieron 1 : " + cant1);
		System.out.println("Cantidad de veces que salieron 5 : " + cant5);
		System.out.println("Cantidad de veces que salieron 10 : " + cant10);
		System.out.println("Cantidad de veces que no salieron 1,5 o 10 : " + otros);
	}
}
