package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTAR UN METODO RECURSIVO QUE IMPRIMA EN FORMA DECENDENTES DE 5
 *         A 1 DE UNO EN UNO.
 * 
 *
 */

public class EjercicioRecursividad3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioRecursividad3.
		EjercicioRecursividad3 recursivo = new EjercicioRecursividad3();
		recursivo.imprimir(5);
	}

	// METODO QUE PERMITE IMPRIMIR LOS VALORES.
	void imprimir(int x) {
		// VALIDAMOS.
		if (x <= 5) {
			System.out.println(x);
			imprimir(x - 1);
		}
	}
}
