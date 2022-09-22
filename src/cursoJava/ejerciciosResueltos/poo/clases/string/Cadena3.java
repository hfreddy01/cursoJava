package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CLASE DE TOPO STRING :
 * 
 *         CARGAR UN STRING POR TECLADO E IMPLEMENTE LOS SIGUIENTES METODOS : A)
 *         IMPRIMIR LA PRIMERA MITAD DE LOS CARATERES DE LA CADENA B) IMPRIMIR
 *         EL ULTIMO CARACTER C) IMPRIMIRLO EN FORMA INVERSA D) IMPRIMIR CADA
 *         CARACTER DEL STRING SEPARADO CON UN GUION E) IMPRIMIR LA CANTIDAD DE
 *         VOCALES ALMACENADAS F) IMPLEMENTAR UN METODO QUE VERIFIQUE SI LA
 *         CADENA SE LLE IGUAL DE IZQUUIERDA A DERECHA TANTO COMO DE DERECHA A
 *         IZQUIERDA (EJ. neuquen se lee igual en las dos direcciones)
 *
 */

public class Cadena3 {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private String cadena;

	// METODO QUE PERMITE EJECUTAR EL PROGRAMA.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE Cadena3
		Cadena3 cadena = new Cadena3();
		// IMPRIMIMOS
		cadena.primeraMitad();
		cadena.utimoCaracter();
		cadena.formaInversa();
		cadena.conGuiones();
		cadena.cantidadVocales();
		cadena.esCapicua();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public Cadena3() {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		teclado = new Scanner(System.in);
		// INGRESAMOS.
		System.out.print("Ingrese cadena : ");
		cadena = teclado.nextLine();
	}

	// METODO QUE IMPRIME LA PRIMERA MITAD DE LA CADENA.
	public void primeraMitad() {
		String mitad;
		// VALIDAMOS.
		mitad = cadena.substring(0, cadena.length() / 2);
		System.out.println("Primera mitad de la cadena es : " + mitad);
	}

	// METODO QUE PERMITE IMPRIMIR EL ULTIMO CARACTER DE LA CADENA.
	public void utimoCaracter() {
		// VALIDAMOS.
		char ultimo = cadena.charAt(cadena.length() - 1);
		// IMPRIMIMOS.
		System.out.println("Ultimo caracter :" + ultimo);
	}

	// METODO QUE PERMITE IMPRIMIR LA CADENA DE FORMA INVERSA.
	public void formaInversa() {
		System.out.print("Impresion de la cadena en forma inversa : ");
		// VALIDAMOS.
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		System.out.println();
	}

	// METODO QUE PERMITE MOSTRAR LA CADENA CON GUIONES.
	public void conGuiones() {
		System.out.print("Separado por Guiones : ");
		// VALIDAMOS.
		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i) + "-");
		}
		System.out.println();
	}

	// METODO QUE PERMITE MOSTRAR LA CADENA CON VOCALES.
	public void cantidadVocales() {
		int cantidad = 0;
		;
		// VALIDAMOS.
		for (int i = 0; i < cadena.length(); i++) {
			// VALIDAMOS.
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E'
					|| cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
				cantidad++;
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de Vocales : " + cantidad);
	}

	// METODO QUE PERMITE MOSTRAR SI UNA CADENA ES CAPUA.
	public void esCapicua() {
		int cant = 0;
		// VALIDAMOS.
		for (int i = 0; i < cadena.length() / 2; i++) {
			// VALIDAMOS.
			if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1 - i)) {
				cant++;
			}
		}
		// VALIDAMOS.
		if (cant == cadena.length() / 2) {
			System.out.print("Es capicúa la cadena " + cadena);
		} else {
			System.out.print("No es capicúa la cadena : " + cadena);
		}
	}
}
