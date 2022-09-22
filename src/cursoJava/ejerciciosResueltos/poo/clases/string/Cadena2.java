package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CLASE DE TIPO STRING :
 * 
 *         REALIZAR UNA CLASE, QUE PERMITA CARGAR UNA DIRECCION DE EMAIL EN EL
 *         CONSTRUCTOR, LUEGO EN OTRO METODO MOSTRAR UN MENSAJE SI CONTIENE EL
 *         CARACTER '@.
 * 
 * 
 *
 */

public class Cadena2 {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private String email;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE CLASE Cadena2.
		Cadena2 cadena2 = new Cadena2();
		cadena2.validarEmail();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public Cadena2() {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		teclado = new Scanner(System.in);
		// INGRESAMOS VALORES POR TECLADO.
		System.out.print("Ingrese email :");
		email = teclado.nextLine();
	}

	// METODO QUE PERMITE VERFICIAR SI EXISTE EL CARACTER ARROBA.
	public void validarEmail() {
		// CREAMOS VARIABLE.
		boolean existe = false;
		// VALIDAMOS.
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				existe = true;
			}
		}
		// VALIDAMOS.
		if (existe == true) {
			System.out.println("Contiene el caracter @");
		} else {
			System.out.println(email + " no contiene el caracter @");
		}
	}
}
