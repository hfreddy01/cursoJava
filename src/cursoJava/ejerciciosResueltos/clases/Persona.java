package cursoJava.ejerciciosResueltos.clases;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 1 - CONFECCIONAR UNA CLASE QUE PERMITA CARGAR EL NOMBRE Y LA EDAD DE UNA PERSONA. MOSTRAR LOS DATOS CARGADOS E IMPRIMIR UN MENSAJE 
 *     SI ES MAYOR DE EDAD (edad>=18)
 *     
 *     NOTA : SE UTILIZA TRY-CATCH.
 *
 */
public class Persona {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int edad;
	private String nombre;
	
	// METODO QUE PERMITE CARGAR LOS DATOS DE UNA PERSONA.
	public void cargarDatosPersona() {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		try {
			
			System.out.println("Ingrese Nombre ");
			nombre = teclado.next();
			
			System.out.println("Ingrese edad");
			edad = teclado.nextInt();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR SI LA PERSONA ES MAYOR DE EDAD.
	public void esMayorEdad() {
		try {
			if(edad >= 18 ) {
				System.out.println("Es mayor de edad");
			  } else {
				System.out.println("NO es mayor de edad...");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
