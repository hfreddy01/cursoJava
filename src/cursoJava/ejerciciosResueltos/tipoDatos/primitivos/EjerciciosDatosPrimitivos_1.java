package cursoJava.ejerciciosResueltos.tipoDatos.primitivos;

/**
 * 
 * @author cursoJava
 * 
 *         IMPRIMIR LOS VALORES MAXIMOS Y MINIMOS QUE PUEDEN ALMACENAR CADA TIPO
 *         DE DATO PRIMITIVO NUMERICO. EMPLEAR LAS CLASES DE ENVOLTURA PARA
 *         RECUPERAR DICHOS VALORES.
 *
 */

public class EjerciciosDatosPrimitivos_1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		System.out.println("Máximo y mínimo valor para un tipo de dato byte :");
		System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println("Máximo y mínimo valor para un tipo de dato shor t :");
		System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
		System.out.println("Máximo y mínimo valor para un tipo de dato int :");
		System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println("Máximo y mínimo valor para un tipo de dato long :");
		System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
		System.out.println("Máximo y mínimo valor para un tipo de dato float :");
		System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println("Máximo y mínimo valor para un tipo de dato double :");
		System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
	}
}
