package string;

import java.util.Scanner;

/**
 * 
 * @author Freddy
 * 
 * Solicitar el ingreso del apellido, nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad. 
 * Realizar la carga del apellido y nombre en una variable de tipo String.
 *
 */

public class CadenaDeCaracteres2 {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private String apenombre1, apenombre2;
	private int edad1, edad2;
	
	// METODO QUE PERMITE INGRESAR DATOS POR TECLADO.
	public void getVentana() {
		// INICIALIZAMOS.
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el apellido y el nombre : ");
        apenombre1=teclado.nextLine();
        System.out.println("Ingrese edad : ");
        edad1=teclado.nextInt();
        System.out.println("Ingrese el apellido y el nombre : ");
        teclado.nextLine();
        apenombre2=teclado.nextLine();
        System.out.println("Ingrese edad : ");
        edad2=teclado.nextInt();
		
	}
	
	
	// METODO UE PERMITE VALIDAR LA PERSONA DE MAYOR EDAD.
	public void getMayorEdad() {
		// VALIDMAOS.
		if(edad1 > edad2) {
			System.out.println("La persona de mayor edad es : " +apenombre1);		
		} else {
			System.out.println("La persona de mayor edad es : " +apenombre2);
		}
		
	}

}
