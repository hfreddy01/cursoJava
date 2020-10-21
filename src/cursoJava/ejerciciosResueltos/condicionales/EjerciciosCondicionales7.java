package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 7 - SE CARGAN POR TECLADO TRES NUMEROS DISTINTOS, MOSTRAR POR PANTALLA EL MAYOR DE ELLOS.
 *
 */

public class EjerciciosCondicionales7 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3;
	
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosCondicionales7
		EjerciciosCondicionales7 op = new EjerciciosCondicionales7();
		op.getAddVentana();
		op.getMayorNumeros();

	}
	
	// METODO QUE PEMITE CREAR VENTANA DE DIALOG PARA EL INGRESO DE DATOS.
	public void getAddVentana() {
		// CREAMOS VENTANA DE DIALOGO.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// PASAMOS DE INT A STRING.
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// PASAMOS DE INT A STRING.
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// PASAMOS DE INT A STRING.
		num3 = Integer.parseInt(text3);
	}
	
	
	// METODO QUE PERMITE MOSTRAR POR PANTALLA EL MAYOR DE LOS NUMEROS.
	public void getMayorNumeros() {
		// VALIDAMOS.
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 +" es mayor");
			} else {
				System.out.println(num3 +" es mayor");
			}
		} else {
			if(num2 > num3) {
				System.out.println(num2 +" es mayor");
			} else {
				System.out.println(num3 +" es mayor");
			}
		}
	}

}
