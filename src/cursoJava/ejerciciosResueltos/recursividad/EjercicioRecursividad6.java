package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMETAR UN METODO RECURSIVO PARA ORDENAR LOS ELEMENTOS DE UN
 *         VECTOR.
 * 
 *
 */

public class EjercicioRecursividad6 {
	// ATRIBUTOS DE LA CLASE.
	static int[] vec = { 312, 614, 88, 22, 54 };

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioRecursividad6.
		EjercicioRecursividad6 recursivo = new EjercicioRecursividad6();
		recursivo.imprimir();
		recursivo.ordenar(vec, vec.length);
		recursivo.imprimir();
	}

	// METODO QUE PERMITE ORDENAR LOS ELEMENTOS.
	void ordenar(int[] v, int cantidad) {
		// VALIDAMOS.
		if (cantidad > 1) {
			// VALIDAMOS.
			for (int i = 0; i < cantidad - 1; i++) {
				// VALIDAMOS.
				if (v[i] > v[i + 1]) {
					int aux = v[i];
					v[i + 1] = aux;
				}
				ordenar(v, cantidad - 1);
			}
		}
	}

	void imprimir() {
		// VALIDAMOS.
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i] + " ");
			System.out.println("\n");
		}
	}
}
