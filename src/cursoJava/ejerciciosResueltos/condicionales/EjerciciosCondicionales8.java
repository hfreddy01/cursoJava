package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *  8 - SE INGRESAN POR TECLADO UN VALOR ENTERO, MOSTRAR UN MENSAJE QUE INDIQUE SI EL NUMERO ES POSITIVO, NULO O 
        NEGATIVO
 *
 */
public class EjerciciosCondicionales8 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int numero;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosCondicionales8
		EjerciciosCondicionales8 op = new EjerciciosCondicionales8();
		op.getCreateVentana();
		op.getValidateNumber();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOG PARA EL INGRESO DE DATOS.
	public void getCreateVentana() {
		//CREAMOS VENTANA DE DIALOGO.s
		text1 = JOptionPane.showInputDialog("Ingrese numero");
		// PASAMOS DE ENTERO A STRING.
		numero = Integer.parseInt(text1);	
	}
	
	
	// CREAMOS METODO QUE PERMITEVALIDAR SI EK NUMERO ES POSITIVO, NULO O NEGATIVO.
	public void getValidateNumber() {
		// VALIDAMOS.
		if(numero == 0) {
			System.out.println("Se ingreso el valor 0");
		} else {
			if(numero > 0) {
				System.out.println("Se ingreso un valor positivo");
			} else {
				System.out.println("Se ingreso un valor negativo");
			}
		}
	}

}
