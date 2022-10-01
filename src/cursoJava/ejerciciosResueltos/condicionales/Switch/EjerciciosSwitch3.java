package cursoJava.ejerciciosResueltos.condicionales.Switch;

/**
 * 
 * @author cursoJava
 * 
 *         SIMULAR EL TIRADO DE UN DADO 1000 VECES. MOSTRAR LUEGO LA CANTIDAD DE
 *         VECES QUE SALIERON VALORES PARES E IMPARES.
 *
 */

public class EjerciciosSwitch3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int pares = 0;
		int impares = 0;
		// VALIDAMOS.
		for (int i = 0; i < 1000; i++) {
			// VALIDAMOS.
			int lado = (int) (Math.random() * 6) + 1;
			// VALIDAMOS.
			switch (lado) {
			case 1:
			case 3:
			case 5:
				impares++;
				break;
			case 2:
			case 4:
			case 6:
				pares++;
				break;
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de veces que salieron pares : " + pares);
		System.out.println("Cantidad de veces que salieron impares : " + impares);
	}
}
