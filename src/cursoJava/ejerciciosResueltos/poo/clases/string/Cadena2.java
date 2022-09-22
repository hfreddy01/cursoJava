package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * EJERCICIOS CLASE DE TIPO STRING :
 * 
 * REALIZAR UNA CLASE, QUE PERMITA CARGAR UNA DIRECCION DE EMAIL EN EL CONSTRUCTOR, LUEGO EN OTRO METODO MOSTRAR
 * UN MENSAJE SI CONTIENE EL CARACTER '@.
 * 
 * EJERCICIOS CLASE DE TIPO STRING :
 * 
 *
 */

public class Cadena2 {
	// ATRIBUTOS DE LA CLASE.
	Scanner teclado;
	String email;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	public void validarEmail() {}
	
}
