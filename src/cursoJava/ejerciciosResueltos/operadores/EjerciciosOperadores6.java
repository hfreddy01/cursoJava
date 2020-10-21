package cursoJava.ejerciciosResueltos.operadores;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *  6 - SE INGRESAN POR TECLADO TRES NUMEROS, SI AL MENOS UNO DE LOS VALORES INGRESADOS ES MENOR A 10 , IMPRIMIR EN
 *      PANTALLA UN MENSAJE QUE DIGA "ALGUNO DE LOS NUMEROS ES MENOR A DIEZ"
 *
 */

public class EjerciciosOperadores6 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3;
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String [] args) {
		// CREAMOS OBJETO DE LA CLASE EjerciciosOperadores6
		EjerciciosOperadores6 op = new EjerciciosOperadores6();
		op.getAddWindows();
		op.getValidatNumber();
		
	}
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOG, PARA EL INGRESO DE DATOS.
	public void getAddWindows() {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "6 - SE INGRESAN POR TECLADO TRES NUMEROS, SI AL MENOS UNO DE LOS VALORES INGRESADOS ES MENOR A 10 , IMPRIMIR EN\r\n" 
		 + "* PANTALLA UN MENSAJE QUE DIGA \"ALGUNO DE LOS NUMEROS ES MENOR A DIEZ\"");
		
		// CREAMOS VENTANA PARA EL INGRESO DE DATOS.
		text1 = JOptionPane.showInputDialog("Ingrese primner numero");
		// TRANSFORMAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS DE INT A STRING
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// TRANSFORMAMOS DE INT A STRING
		num3 = Integer.parseInt(text3);
	}
	
	
	// METODO QUE PERMITE VALIDAR SI ALGUNO DE LOS NUMEROS ES MENOR A DIEZ.
	public void getValidatNumber() {
		// VALIDAMOS.
		if(num1 < 10 || num2 < 10 || num3 <10) {
			System.out.println("Algunos de los numeros es menor a diez");
		}
	}

}
