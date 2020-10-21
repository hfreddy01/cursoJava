package cursoJava.ejerciciosResueltos.otros;
/**
 * 
 * @author cursoJava
 * 
 * EJERCICIOS PARA REDONDEAR NUMEROS. EJEMPLO DE REFUNDICION.
 *
 */

public class Rendondeo_Numeros {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		double numero = 5.82;
		
		// HACEMOS UN CAST
		int resultado = (int)Math.round(numero);
		
		// IMPRIMIMOS.
		System.out.println(resultado);

	}

}
