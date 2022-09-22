package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE CLASE DE TIPO STRING :
 * 
 *         CONFECCIONAR UN PROGRAMA QUE PERMITA CARGAR LOS NOMBRES DE 5 PERSONAS
 *         Y SU EMAIL, LUEGO IMPLEMENTAR LOS SIGUIENTES METODOS : A) MOSTRAR POR
 *         PANTALLA LOS DATOS, B) CONSULTA DEL EMAIL INGRESANDO SU NOMBRE. C)
 *         MOSTRAR LOS EMAIL QUE NO TIENEN EL CARACTER @.
 *
 */

public class Cadena5 {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private String nombres[];
	private String email[];

	// METODO QUE PERMITE EJECUTAR EL PROGRAMA.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLSE Cadena5
		Cadena5 cadena5 = new Cadena5();
		cadena5.listarDatos();
		cadena5.validarEmail();
		cadena5.sinArroba();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public Cadena5() {
		// CREAMOS EL OBJETO DE LA CLASE SCANNER.
		teclado = new Scanner(System.in);
		// CREAMOS OBJETO ARRAYS.
		nombres = new String[5];
		email = new String[5];
		// INGRESAMOS.
		for (int i = 0; i < nombres.length; i++) {
			System.err.print("Ingrese nombre : ");
			nombres[i] = teclado.nextLine();
			System.err.print("Ingrese email : ");
			email[i] = teclado.nextLine();
		}
	}

	// METODO QUE PERMITE MOSTRAR TODO LOS DATOS.
	public void listarDatos() {
		// VALIDAMOS.
		for (int i = 0; i < nombres.length; i++) {
			// IMPRIMIMOS.
			System.out.println(nombres[i] + " - " + email[i]);
		}
	}

	// METODO QUE PERMITE VALIDAR EL EMAIL.
	public void validarEmail() {
		// INGRESAMOS NOMBRE POR TECLADO
		System.out.println("Ingrese nombre : ");
		String nombrePersona = teclado.nextLine();
		boolean existe = false;
		// VALIDAMOS.
		for (int i = 0; i < nombres.length; i++) {
			// VALIDAMOS.
			if (nombrePersona.equals(nombres[i])) {
				System.out.println("Email de la persona : " + email[i]);
				existe = true;
			}
		}
		// VALIDAMOS.
		if (existe == false) {
			System.out.println("No existe el nombre, por favor verifique.");
		}
	}

	// METODO QUE PERMITE MOSTRAR LOS EMAIL QUE NO TIENEN EL CARACTER @
	public void sinArroba() {
		for (int f = 0; f < email.length; f++) {
			boolean tiene = false;
			for (int k = 0; k < email[f].length(); k++) {
				if (email[f].charAt(k) == '@') {
					tiene = true;
				}
			}
			if (tiene == false) {
				System.out.println(email[f] + " no tiene @");
			}
		}
	}
}
