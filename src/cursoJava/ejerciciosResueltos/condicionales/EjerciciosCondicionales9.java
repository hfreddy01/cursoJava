package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 9 - CONFECCIONAR UN PROGRAMA QUE PERMITA CARGAR UN NUMERO ENTERO POSITIVO DE HASTA TRES CIFRAS Y MUESTRE UN MENSAJE 
       INDICANDO SI TIENE 1, 2, 3 CIFRAS. MOSTRAR UN MENSAJE DE ERROR SI EL NUMERO DE CIFRAS ES MAYOR.
 *
 */
public class EjerciciosCondicionales9 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int num;

	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosCondicionales9
		EjerciciosCondicionales9 op = new EjerciciosCondicionales9();
		op.getCreateWindows();
		op.getValidateNumber();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE REGISTROS.
	public void getCreateWindows() {
		// VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Ingrese un valor de hasta tres dígitos positivo");
		// PASAMOS DE INT A STRING
		num = Integer.parseInt(text1);
	}
	
	
	// METODO QUE PERMITE VALIDAR EL NUMERO INGRESADO POR VENTANA DE DOIALOG.
	public void getValidateNumber() {
		// VALIDAMOS.
		if(num < 10) {
			System.out.println("Tiene un digito");
		} else {
			if(num < 100) {
				System.out.println("Tiene dos digito");
			} else {
				if(num < 1000) {
					System.out.println("Tiene tres digito");
				} else {
					System.out.println("Error en la entrada de datos.");
				}
			}
		}
	}

}
