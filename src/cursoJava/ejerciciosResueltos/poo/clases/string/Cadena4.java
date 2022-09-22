package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE CLASE STRING :
 * 
 *         DESARROLLAR UN PROGRAMA QUE SOLICITE LA CARGA DE UNA CLASE. LA CLASE
 *         DEBE TENER DOS METODOS UNO PARA LA CARGA Y OTRO METODO QUE MUESTRE SI
 *         LA CLAVE ES LA CORRECTA (LA CLAVE A COMPARAR ES : "123abc")
 *
 */

public class Cadena4 {
	// ATRIBUTOS DE LA CLASE
	private Scanner teclado;
	private String password;

	// METODO QUE PERMITE EJECUTAR EL PROGRAMA
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE Caden4.
		Cadena4 cadena4 = new Cadena4();
		cadena4.validarPassword();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public Cadena4() {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		teclado = new Scanner(System.in);
		// INGRESAMOS PASSWORD POR TECLADO.
		System.out.println("Ingrese password :");
		password = teclado.nextLine();
	}

	// METODO QUE PERMITE VALIDAR LA CLAVE.
	public void validarPassword() {
		// VALIDAMOS.
		if (password.equals("123abc") == true) {
			System.out.println("La clave es correcta.");
		} else {
			System.out.println("No se ingresó la clave en forma correcta");
		}
	}
}
