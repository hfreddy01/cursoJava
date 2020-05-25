package constructor;

public class Ejecutar {

	public static void main(String[] args) {
		// REFERENCIA DE LAS CLASES.
		/***********************************************************************************/
		Constructor1 op = new Constructor1("Freddy ", "Herrera ", 35);
		Constructor1 op1 = new Constructor1("Wilfrido ", "Herrera ", 65);
	    //op.getDatos();
	//	System.out.println(op.setDatos());
	//  System.out.println(op1.setDatos());
		
		// IMPRIME CON EJEMPLO FOR
		Constructor1[] ops = new Constructor1[4];
		ops[0] = new Constructor1("Freddy ", " Herrrea ", 35);
		ops[1] = new Constructor1("Wilfrido ", " Herrrea ", 65);
		ops[2] = new Constructor1("Wilfredo ", " Herrrea ", 39);
		ops[3] = new Constructor1("Teresa ", " Bornachera ", 69);
		
		for(Constructor1 person : ops) {
		//	System.out.println(person.setDatos());
		}
		
		// CONSTRUCTOR
		Constructor1 opx = new Constructor1("Freddy Herrera");
		System.out.println(opx.setDatos());
	
		/***********************************************************************************/
		/***********************************************************************************/
		/***********************************************************************************/
		/***********************************************************************************/

	}

}
