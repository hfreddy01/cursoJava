package cursoJava.ejerciciosResueltos.otros;

public class EjemploString {

	public static void main(String[] args) {
		//EjerciciosString1 op = new EjerciciosString1();
		//op.getString();

	}
	
	// METODO QUE PERMITE MOSTRAR ALGUNAS FUNCIONES DE STRING
	public void getString() {
		// EJEMPLO DE METODOS STRING :
		String nombre = "Freddy Herrera";
		
		// LENGTH
		System.out.println(nombre.length());
		// CHARAT
		System.out.println(nombre.charAt(0));
		
		// VERIFICAMOS VALOR DE ULTIMA LETRA.
		int ultima_letra = nombre.length();
		System.out.println(nombre.charAt(ultima_letra-1));
		
		// VALIDAMOS UNA SUB CADENA.
		String oracion = "hoy es un excelente dia para aprender a programar en java.";
		String sub_cadena = oracion.substring(24);
		
		// VALIDAMOS CON EQUAL
		String nombre1 = "freddy";
		String nombre2 = "Freddy";
		// IMPRIMIMOS
		//System.out.println(nombre1.equals(nombre2));
		System.out.println(nombre1.equalsIgnoreCase(nombre2));
		
	}

}
