package cursoJava.ejerciciosResueltos.otros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pildoras_Informaticas {

	// MRTODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		Pildoras_Informaticas op = new Pildoras_Informaticas();
		op.getAdivinaNumber();

	}
	
	
	// METODO QUE VALIDA LAS AREAS DE UN TRIANGULO UTILIZANDO SWITCH.
	public void getOptions() {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Elija una opcion : \n 1 : Cuadrado \n 2 : Rectangulo \n 3 : Trinagulo \n 4 : Circulo");
		
		int figura = teclado.nextInt();
		
		// VALIDAMOS
		switch(figura) {
		
		case 1 :
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
			// VALIDAMOS EL LADO DE UN CUADRADO Y IMPRIMIMOS.
			System.out.println("El lado de un cuadrado es : " + Math.pow(lado, 2));
			break;
			
		case 2 :
			int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			// IMPRIMIMOS.
			System.out.println("El area del rectangulo es : " + base*altura);
			break;
			
		case 3 :
			 base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			 altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			// IMPRIMIMOS.
			System.out.println("El area del triangulo es : " + (base*altura)/2);
			break;
			
		case 4 :
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
			// IMPRIMIMOS.
			System.out.print("El area del circulo es : ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
			
			default :
				System.out.println("Error alo introducir un valor");
			
		}
	}
	
	
	// METODO QUE PERMITE VALIDAR INGRESO DE CONTRASEÑA.
	public void getPassword() {
		// CREAMOS VARIABLE.
		String clave = "Freddy1234";
		String pass ="";
		
		// VALIDAMOS.
		while(clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce contrañea");
			
			// VALIDAMOS.
			if(clave.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contrseña Correcta");
	}
	
	
	// METODO QUE PERMITE GENERAR UN NUMERO ALEATORIO ENTRE 0 Y 100
	public void getAdivinaNumber() {
		// REFUNDICION.
		int aleatorio = (int)(Math.random()*100);
		int intentos = 0;
		int numero = 0;
		
		// VALIDAMOS.
		while(numero != aleatorio) {
		intentos ++;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
		
		// VALIDAMOS.
		if(aleatorio < numero) {
			JOptionPane.showInputDialog("Mas bajo");
			
		} else if(aleatorio > numero) {
			JOptionPane.showInputDialog("Mas alto");
		  }
		}
		// IMPRIMIMOS.
		System.out.println("Correcto lo has conseguido en " +intentos);
	}
	
	// METODO QUE REDONDEA NUMEROS.
	public void getRendondeo_Numeros() {

		// METODO PRINCIPAL DE LA CLASE.
			double numero = 5.82;
			
			// HACEMOS UN CAST
			int resultado = (int)Math.round(numero);
			
			// IMPRIMIMOS.
			System.out.println(resultado);
	}
	

	
}
