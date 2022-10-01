package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         OBYENER EL FACTORIAL DE UN NUMERO. RECORDAR QUE EL FACTORIAL DE UN
 *         NUMERO ES EL RESULTADO QUE SE OBTIENE DE MULTIPLICAR DICHO NUMERO POR
 *         EL ANTERIOR Y ASI SUCESIVAMENTE HASTA LLEGAR A UNO. (EJ. EL FACTORAL
 *         DE 4 ES 4 * 3 * 2 * 1 ES DECIR 24)
 * 
 */

public class EjercicioRecursividad5 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioRecursividad5.
		EjercicioRecursividad5 recursivo = new EjercicioRecursividad5();
		int resultado = recursivo.factorial(4);
		System.out.println("El factorial es 4 " + resultado);
	}

	// METODO QUE PERMITE VALIDAR EL FACTORIAL.
	int factorial(int fact) {
		// VALIDAMOS
		if (fact > 0) {
			int valor = fact * factorial(fact - 1);
			return valor;
		} else {
			return 1;
		}
	}
}
