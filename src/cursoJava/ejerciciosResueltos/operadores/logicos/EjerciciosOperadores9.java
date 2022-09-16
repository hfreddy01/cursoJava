package cursoJava.ejerciciosResueltos.operadores.logicos;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 9 - ESCRIBIR UN PROGRAMA EN EL CUAL DADA UNA LISTA DE TRES VALORES NUMERICOS DISTINTOS SE CALCULE E INFORME SU 
*      RANGO DE VARIACION (DEBE MOSTRAR EL MAYOR Y EL MENOR DE ELLOS).
 *
 */

public class EjerciciosOperadores9 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3;

	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosOperadores9
		EjerciciosOperadores9 op = new EjerciciosOperadores9();
		op.getCreateVentanaDialog();
		op.getRangovariacion();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCreateVentanaDialog() {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, " 9 - ESCRIBIR UN PROGRAMA EN EL CUAL DADA UNA LISTA DE TRES VALORES NUMERICOS "
				+ "DISTINTOS SE CALCULE E INFORME SU \r\n" 
				+ " RANGO DE VARIACION (DEBE MOSTRAR EL MAYOR Y EL MENOR DE ELLOS).");
		
		// CREAMOS VENTANA DE DIALOGO.
		text1 = JOptionPane.showInputDialog("Ingrese primer valor");
		// TRANSFORMAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo valor");
		// TRANSFORMAMOS DE INT A STRING
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer valor");
		// TRANSFORMAMOS DE INT A STRING
		num3 = Integer.parseInt(text3);
		
	}
	
	// METODO QUE PEMITE VALIDAR EL RANGO DE VARIACION DE LOS VALORES.
	public void getRangovariacion() {
		// VALIDAMOS.
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1);
		} else {
			if(num2 < num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
			// VALIDAMOS.
			System.out.println("-");
			if(num1 > num2 && num1 > num3) {
				System.out.println(num1);
			} else {
				if(num2 > num3) {
					System.out.println(num2);
				} else {
					System.out.println(num3);
				}
			}
	   }
   }
