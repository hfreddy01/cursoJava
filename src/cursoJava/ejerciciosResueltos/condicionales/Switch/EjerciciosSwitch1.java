package cursoJava.ejerciciosResueltos.condicionales.Switch;

/**
 * 
 * @author cursoJava
 * 
 *         SIMULAR EL TIRADO DE UN DADO 1000 VECES. MOSTRAR LUEGO LA CANTIDAD DE
 *         VECES QUE SALIERON CADA VALOR.
 * 
 *
 * 
 */

public class EjerciciosSwitch1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		int lado4 = 0;
		int lado5 = 0;
		int lado6 = 0;
		// VALIDAMOS.
		for(int i=0; i<100; i++) {
			int lado = (int)(Math.random() * 6 +1);
			// VALIDAMOS.
			switch(lado) {
			case 1 :
				lado1++;
				break;
			case 2:
				lado2++;
				break;
			case 3:
				lado3++;
				break;
			case 4 :
				lado4++;
				break;
			case 5 :
				lado5++;
				break;
			case 6 :
				lado6++;
				break;
			}
		}
		// IMPRIMIMOS.
        System.out.println("Resultado de la simulación : ");
        System.out.println("Cantidad de veces que salieron 1 :" + lado1);
        System.out.println("Cantidad de veces que salieron 2 :" + lado2);
        System.out.println("Cantidad de veces que salieron 3 :" + lado3);
        System.out.println("Cantidad de veces que salieron 4 :" + lado4);
        System.out.println("Cantidad de veces que salieron 5 :" + lado5);
        System.out.println("Cantidad de veces que salieron 6 :" + lado6);
	}
}
