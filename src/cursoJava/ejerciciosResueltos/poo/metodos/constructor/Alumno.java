package cursoJava.ejerciciosResueltos.poo.metodos.constructor;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 2 - PLANTEAR UNA CLASE LLAMADA ALUNNO Y DEFINIR COMO ATRIBUTOS SU NOMBRE Y SU EDAD. EN EL CONSTRUCTOR DE LA CLASE
 *     REALIZAR LA CARGA DE DATOS, DEFINIR OTROS DOS METODOS PARA IMPRIMIR LOS DATOS INGRESADOS Y PARA VALIDAR SI ES
 *     MAYOR DE EDAD.
 *
 */

public class Alumno {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	
	
	// METODO CONSTRUCTOR DE LA CLASE.
	public Alumno() {
		// CREAMOS OBJETO SCANNER.
		teclado = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese nombre del Alunno : ");
			nombre = teclado.next();
			
			System.out.println("Ingrese edad del Alunno : ");
			edad = teclado.nextInt();
			
		} catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	// METODO QUE PERMITE IMPRIMIR LOS DATOS DEL ALUNNO.
	public void datosAlunno() {
		
		System.out.println("Nombre Alunno : " +nombre);
		System.out.println("Edad Alunno : " +edad);
	}
	
	
	// METODO QUE VALIDA SI EL ALUNNO ES MAYOR DE EDAD.
	public void esMayorEdad() {
		
		try {
			
			if(edad >= 18) {
				System.out.println("Es mayor de edad");
			} else {
				System.out.println("NO es mayor de edad");
			}
			
		}  catch(Exception e) {
			e.printStackTrace();
			}
	}

}
