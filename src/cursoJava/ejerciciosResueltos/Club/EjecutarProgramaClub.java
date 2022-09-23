package cursoJava.ejerciciosResueltos.Club;

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

public class EjecutarProgramaClub {

	// METODO QUE PERMITE EJECUTAR EL PROGRAMA CLUB.
	public static void main(String[] ar) {
		Club club1 = new Club();
		club1.mayorAntiguedad();
	}
}
