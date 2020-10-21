package cursoJava.ejerciciosResueltos.operadores;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava.
 * 
 * 7 - ESCRIBIR UN PROGRAMA QUE PIDA INGRESAR LA COORDENADA DE UN PUNTO EN EL PLANO, ES DECIR DOS VALORES ENTEROS 
*      (x - y) (DISTINTOS A CERO) POSTERIORMENTE IMPRIMIR EN PANTALLA EN QUE CUADRANTE SE UBICA DICHO PUNTO, 
*      EJEMPLO: (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 *
 */

public class EjerciciosOperadores7 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x,y;
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOG PARA EL INGRESO DE DATOS.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosOperadores7.
		EjerciciosOperadores7 op = new EjerciciosOperadores7();
		op.getCreateVentanas();
		op.getCoordenadas();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCreateVentanas() {
		// IMPRIMIMOS MENSAJE.
		JOptionPane.showMessageDialog(null, " ESCRIBIR UN PROGRAMA QUE PIDA INGRESAR LA COORDENADA DE UN PUNTO EN EL PLANO, "
				+ "ES DECIR DOS VALORES ENTEROS \r\n" 
				+ "* (x - y) (DISTINTOS A CERO) POSTERIORMENTE IMPRIMIR EN PANTALLA EN QUE CUADRANTE SE UBICA DICHO PUNTO");
		
		// CREAMOS VENTANA PARA INGRESAR DATOS.
		text1 = JOptionPane.showInputDialog("Ingrese coordenada x ");
		// TRANSFORMAMOS DE INT A STRING.
		x = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese coordenada y ");
		// TRANSFORMAMOS DE INT A STRING.
		y = Integer.parseInt(text2);
	}
	
	
	// METODO QUE PERMITE VALIDAR EN QUE CUADRANTE SEN ENCUENTRAN LAS COORDENADAS.
	public void getCoordenadas() {
		// VALIDAMOS.
		if(x > 0 && y > 0) {
			System.out.println("Se encuentra en el primer cuadrante");
		} else if(x < 0 && y > 0) {
			System.out.println("Se encuentra en el segundo cuadrante");
		} else {
			if(x < 0 && y < 0) {
				System.out.print("Se encuentra en el tercer cuadrante");
			} else {
				System.out.print("Se encuentra en el cuarto cuadrante");
			}
		}
	}

}
