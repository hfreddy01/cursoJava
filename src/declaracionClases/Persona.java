package declaracionClases;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Confeccionar una clase que permita carga el nombre y la edad de una persona. Mostrar los datos cargados. Imprimir un 
 * mensaje si es mayor de edad (edad>=18)
 *
 */

public class Persona {
	// PROPIEDADES DE LA CLASE.
	private String nombre1, nombre2;
	private int edad;
	
	// METODO UE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCargarDatosPersona() {
		
		nombre1 = JOptionPane.showInputDialog("Ingrese Nombre");
		
		nombre2 = JOptionPane.showInputDialog("Ingrese Edad");
		edad = Integer.parseInt(nombre2);	
	}
	
	
	// METODO QUE PERMITE MOSTRAR EL NOMBRE Y LA EDAD DE UNA PERSONA.
	public void getMostrarDatosPersonas() {
		// VALIDAMOS.
		System.out.println("Nombre : " +nombre1);
		System.out.println("Edad : " +edad);
	}
	
	
	// METODO QUE PERMITE MOSTRAR SI LA PERSONA ES MAYOR DE EDAD.
	public void getMayorEdad() {
		// VALIDAMOS.
		if(edad > 18) {
			System.out.println("Nota : Es mayor de edad...");
		} else {
			System.out.println("Nota : No es mayor de edad...");
		}
	}

}
