package pildorasInformaticas;

import javax.swing.JOptionPane;

public class ManipulacionCadenas {

	public static void main(String[] args) {
		//ManipulacionCadenas op = new ManipulacionCadenas();
		//op.getMetodoCharAt();
		//op.getExisteArroba();

	}
	
	// METODO CHARAT
	public void getMetodoCharAt() {
		// DECLARAMOS VARIABLE.
		String nombre;
		int ultimaLetra;
		
		
		// IMPRIMIMOS
		nombre = JOptionPane.showInputDialog("Ingrese nombre");
		System.out.println("Mi nombre es : " +nombre);
		System.out.println("Mi nombre tiene : " +nombre.length() +" letras");
		System.out.println("La primera letra de : " +nombre +" es la " +nombre.charAt(0));
		// VALIDAMOS
		ultimaLetra = nombre.length();
		System.out.println("La ultima letra de mi nombre es la : " +nombre.charAt(ultimaLetra-1));
		
	}
	
	// METODO QUE COMPRUEBA EMAIL Y SI EXISTE @
	public void getExisteArroba() {
		String email;
		int arroba = 0;
		boolean punto = false;
		
		email = JOptionPane.showInputDialog("Ingrese Correo");
		// VALIDAMOS
		for(int i=0; i<email.length(); i++) {
			// COMPROBAMOS.
			if(email.charAt(i) == '@') {
				arroba++;
			}
			
			if(email.charAt(i) == '.') {
				punto = true;
			}
		}
			if(arroba == 1 && punto == true) {
				System.out.println("Es correcto");
			} else {
				System.out.println("NO es correcto");
			}
		
	}

}
