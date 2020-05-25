package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a 
 * este resultado se lo multiplica por el tercero.
 *
 */

public class CondicionesCompuestas4 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3, suma, producto;
	
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO PARA EL INGRESO DE VALORES.
	public void getCargarVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		num3 = Integer.parseInt(text3);
	}
	
	
	// METODO QUE PERMITE COMPROBAR EL RESULTADO DE LOS VALORES.
	public void getOperaciones() {
		// VALIDAMOS
		if(num1 == num2 && num1 == num3) {
			suma = num1 + num2;
			System.out.println("La suma del primero y segundo : " +suma);
			// VALIDAMOS
			producto = suma * num3;
			System.out.println("La suma del primero y segundo multiplicado por el tercero : " +producto);
		}
		
	}

}
