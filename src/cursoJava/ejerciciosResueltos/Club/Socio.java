package cursoJava.ejerciciosResueltos.Club;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         PLANTEAR UNA CLASE CLUB Y OTRA CLASE SOCIO. LA CLASE SOCIO DEBE TENER
 *         LOS SIGUIENTES ATRIBUTOS PRIVADOS: NOMBRE Y LA ANTIGUEDAD EN EL CLUB
 *         (EN AÑOS). EN EL CONSTRUCTIR DE LA CLASE PEDIR LA CARGA DEL NOMBRE Y
 *         DE SU ANTIGUEDAD POR TECLADO, LA CLASE CLUB DEBE TENER COMO ATRIBUTOS
 *         3 OBJETOS DE LA CLASE SOCIO. DEFINIR UNA RESPOSABILIDAD PARA IMPRIMIR
 *         EL NOMBRE DEL SOCIO CON MAYOR ANTIGUEDAD EN EL CLUB.
 * 
 *
 */

public class Socio {
	// ATRIBUTOS DE LA CLASE.
	private String nombre;
	private int antiguedad;

	// METODO CONSTRUCTOR.
	public Socio(Scanner teclado) {
		System.out.print("Ingrese el nombre del socio:");
		nombre = teclado.next();
		System.out.print("Ingrese la antiguedad:");
		antiguedad = teclado.nextInt();
	}

	// METODO QUE PERMITE IMPRIMIR EL SOCIO Y SU ANTIGUEDAD.
	public void imprimir() {
		System.out.println(nombre + " tiene una antiguedad de " + antiguedad);
	}

	// METODO QUE PERMITE MOSTRAR LA ANTIGUEDAD
	public int retornarAntiguedad() {
		return antiguedad;
	}
}
