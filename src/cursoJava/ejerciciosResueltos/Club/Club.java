package cursoJava.ejerciciosResueltos.Club;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         PLANTEAR UNA CLASE CLUB Y OTRA CLASE SOCIO. LA CLASE SOCIO DEBE TENER
 *         LOS SIGUIENTES ATRIBUTOS PRIVADOS: NOMBRE Y LA ANTIGUEDAD EN EL CLUB
 *         (EN AÑOS). EN EL CONSTRUCTIR DE LA CLASE PEDIR LA CARGA DEL NOMBRE Y
 *         DE SU ANTIGUEDAD LA CLASE CLUB DEBE TENER COMO ATRIBUTOS 3 OBJETOS DE
 *         LA CLASE SOCIO. DEFINIR UNA RESPOSABILIDAD PARA IMPRIMIR EL NOMBRE
 *         DEL SOCIO CON MAYOR ANTIGUEDAD EN EL CLUB.
 * 
 *
 */

public class Club {
	// TRIBUTOS DE LA CLASE.
	private Socio socio1, socio2, socio3;
	private Scanner teclado;

	// METODO CONSTRUCTOR.
	public Club() {
		teclado = new Scanner(System.in);
		socio1 = new Socio(teclado);
		socio2 = new Socio(teclado);
		socio3 = new Socio(teclado);
	}

	// METODO QUE PERMITE VALIDAR EL SOCIO CON MAYOR ANTIGUEDAD.
	public void mayorAntiguedad() {
		System.out.print("Socio con mayor antiguedad:");
		if (socio1.retornarAntiguedad() > socio2.retornarAntiguedad()
				&& socio1.retornarAntiguedad() > socio3.retornarAntiguedad()) {
			socio1.imprimir();
		} else {
			if (socio2.retornarAntiguedad() > socio3.retornarAntiguedad()) {
				socio2.imprimir();
			} else {
				socio3.imprimir();
			}
		}
	}
}
