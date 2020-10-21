package cursoJava.ejerciciosResueltos.bucles.DoWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 5 - SE INGRESAN UN CONJUNTO DE N ALTURAS DE PERSONAS POR TECLADO. MOSTRAR LA ALTURA PROMEDIO DE LAS PERSONAS.
 *
 */
public class EjercicisoBucleWhile5 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "5 - SE INGRESAN UN CONJUNTO DE N ALTURAS DE PERSONAS POR TECLADO. MOSTRAR LA "
		+ "ALTURA PROMEDIO DE LAS PERSONAS.");
		
		// CREAMOS VARIABLES.
		String text1, text2;
		int n, x;
		float altura, promedio, suma;
		
		// INICIALIZAMOS VARIABSLE.
		x = 1;
		suma = 0;
		
		// IMPRIMMIMOS
		text1 = JOptionPane.showInputDialog("Cuantas personas hay");
		// TRANSFORMAMOS DE INT A STRING.
		n = Integer.parseInt(text1);
		
		// VALIDAMOS
		while(x <= n) {
		  // CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
		  text2 = JOptionPane.showInputDialog("Ingrese altura");
		  // TRANSFORMAMOS DE INT A STRING.
		  altura = Float.parseFloat(text2);
		  suma = suma + altura;
		  // INCREMENTAMOS X.
		  x=x+1;  
		}
		
		// VALIDAMOS EL PROMEDIO.
		promedio = suma / n;
		// IMPIRMIMOS
		System.out.print("Altura promedio : " +promedio);	
	}

}
