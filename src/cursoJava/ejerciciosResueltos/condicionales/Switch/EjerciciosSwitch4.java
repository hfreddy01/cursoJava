package cursoJava.ejerciciosResueltos.condicionales.Switch;

/**
 * 
 * @author cursoJava
 * 
 *         ALMACENAR EN UN VECTOR LOS NOMBRES DE DIAS QUE TRABAJA UN EMPLEADO.
 *         CONTAR LA CANTIDAD DE DIAS QUE PERTENECEN A DIAS LABORALES Y FIN DE
 *         SEMANA.
 * 
 */

public class EjerciciosSwitch4 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] ar) {
		// CREAMOS VARIABLES
		String[] trabajo = { "lunes", "miércoles", "sábado", "domingo" };
		int laborables = 0;
		int finsemana = 0;
		// VALIDAMOS
		for (int f = 0; f < trabajo.length; f++)
			switch (trabajo[f]) {
			case "lunes":
			case "martes":
			case "miércoles":
			case "jueves":
			case "viernes":
				laborables++;
				break;
			case "sábado":
			case "domingo":
				finsemana++;
				break;
			}
		// IMPRIMIMOS.
		System.out.println("Cantidad de días que trabaja en días hábiles: " + laborables);
		System.out.println("Cantidad de días que trabaja en fin de semana: " + finsemana);
	}
}
