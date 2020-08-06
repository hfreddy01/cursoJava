package cursoJava.tipoDatos;

public class ManualTiposDatosJava {
	/**
	 ******************************************************************************************************************
	 ******************************************************************************************************************
	 * TIPOS DE DATOS EN JAVA :
	 * 
     * LOS TIPOS DE DATOS ESPECIFICAN LOS DIFERENTES TAMAÑOS Y VALORES QUE SE PUEDEN ALMACENAR EN LA VARIABLE. HAY DOS 
     * TIPOS DE DATOS EN JAVA LOS CUALES SON : TIPOS DE DATOS PRIMITIVOS : LOS TIPOS DE DATOS PRIMITIVOS SON
     * (boolean, char, byte, short, int, long, float y double) Y TIPOS DE DATOS NO PRIMITIVOS : LOS TIPOS DE DATOS NO
     * PRIMITIVOS INCLUYEN CLASES, INTERFACES Y ARRAYS.
     * 
     * char =   letras
     * byte =   numero de byte
     * short =  numeros cortos
     * int =    numerosentero
     * long =   numeros largos
     * float =  numeros con decomales
     * double = numeros dobles
     * 
     * NOTA : PARA DECLARA UNA VARIABLE EN JAVA SE DEBEN PONER PRIMERO EL TIPO DE DATOS, LOS TIPOS DE DATOS SE DEBEN
     * ESCRIBNIR EN MINUSCULA, SEGUIDO DEL NOMBRE DE LA VARIABLE, SEGUIDO DEL VALOR DE LA VARIABLE. 
     * EJEMPLO :
     * 
     * int edad = 34; 
     *******************************************************************************************************************
     *******************************************************************************************************************
       TIPOS DE DATOS PRIMITIVOS DE JAVA : 
       
       EN EL LENGUAJE JAVA LOS TIPOS DE DATOS PRIMITIVOS SON LOS COMPONENTES BASICO DE LA MANIPULACION DE DATOS, ESTOS 
       SON LOS TIPOS DE DATOS DISPONIBLES EN EL LENGUAJE JAVA:
    
       NOTA : JAVA ES UN LENGUAJE DE PROGRAMACION DE TIPO STATICO, ES DECIR QUE TODAS LAS VARIABLES DEBEN DECLARARSE 
       ANTES DE SU USO, ES POR ESO QUE NECESITAMOS DECLARAR EL TIPO Y EL NOMBRE DE LA VARIABLE, EXISTEN 8 TIPOS DE DATOS 
       PRIMITIVOS LOS CUALES SON :
     *******************************************************************************************************************
     *******************************************************************************************************************
     * boolean : EL TIPO DE DATOS boolean SE USA PARA ALMACENAR SOLO DOS VALORES POSBLES, true Y false. ESTE TIPO DE 
     * DATOS SE USA PARA CONDICIONALES QUE PERMITAN VALIDAR SI UNA ACCION ES VERDADERA O FALSA EJEMPLO :
  
         public class EjemploBoolean {
	 *    // NOTA : LA VARIABLES DE TIPO "boolean" SE ENCUENTRA UBICADA EN UNA CLASE FUERA DE UN METODO.
	 *    boolean nombre = true;
	 *  
	 *    // METODO PRINCIPAL DE LA CLAE.
	 *    public static void main(String [] args){
	 *    
	 *  	 System.out.println(nombre);  // esto imprime true
	 *     } 
	 *  
	 *  }
	 *******************************************************************************************************************
	 *******************************************************************************************************************  
	 * byte : EL TIPO DE DATOS "byte" ES UN EJEMPLO DE TIPO DE DATO PRIMITIVO, ES UN ENETERO DE 
	 * DOS BITS CON SIGNO DE 8 BITS. SU RANGO DE VALORES SE ENCUENTRA ENTRE -128 A 127(INCLUSIVE). SU VALOR MINIMO ES 
	 * -128 Y EL VALOR MAXIMO ES 127 SU VALOR PREDETERMINADO ES 0, EL TIPO DE DATOS BYTE SE USA PARA AHORRAR MEMORIA EN 
	 * MATRICER("arrays") GRANDES DONDE EL AHORRO DE MEMORIA ES MAS NECESARIO, AHORRA ESPACIO PORQUE UN BYTE ES 4 VECES 
	 * MAS PEQUEÑO QUE UN ENTERO("int"), TAMBIEN SE PUEDE USAR EN LUGAR DE TIPO DE DATOS int
	 * EJEMPLO :
	 * 
	 *   public class EjemploByte {
	 *   
	 *    public static void main(String [] args){
	 *  	byte numero = 2;
	 *  	System.out.println(numero); // imprime 2
	 *     }
	 *  
	 *  }
	 *******************************************************************************************************************
	 ******************************************************************************************************************* 
	  short : EL TIPO DE DATOS short ES UN ENTERO("int") DE DOS BITS CON SIGNO DE 16 BITS, SU RANGO DE 
	  VALORES SE ENCUENTRA ENTRE -32,768 y 32,767 (INCLUSIVE). SU VALOR MINIMO ES -32,768  Y EL VALOR MAXIMO ES 32,767. 
	  SU VALOR PREDETERMINADO ES CERO(0), EL TIPO DE DATOS SHORT TAMBIEN SE PUEDE UTILIZAR PARA AHORRAR ESPACIO EN 
	  MEMORIA AL IGUAL QUE EL TIPO DE DATOS DE BYTE, UN TIPO DE DATOS SHORT ES 2 VECES MAS PEQUEÑO QUE UN ENTERO, 
	  EJEMPLO :
	  
	    public class EjemploShort {
	 *   
	 *    public static void main(String [] args){
	 *  	short numero = 5;
	 *  	System.out.println(numero);
	 *     }
	 *  
	 *  }
     *******************************************************************************************************************
     *******************************************************************************************************************  
	  int  : EL TIPO DE DATO INT ES UN ENTERO DE COMPLEMENTO DE DOS CON SIGNO DE 32 BITS. SU RANGO
	  DE VALORES SE ENCUENTRA ENTRE - 2,147,483,648 (-2 ^ 31) a 2,147,483,647 (2 ^ 31 -1) INCLUSIVE SU VALOR MINIMO ES
	  - 2,147,483,648 Y EL VALOR MAXIMO ES 2,147,483,647  SU VALOR PREDETERMINADO ES 0, EL TIPO DE DATOS INT GENERALMENTE
	  SE USA COMO UN TIPO DE DATO  PREDETERMINADO PARA VALORES INTEGRALES A MENOS QUE NO HAYA NINGUN PROBLEMA CON LA 
	  MEMORIA, EJEMPLO :
	  
	    public class EjemploInt {
	 *   
	 *    public static void main(String [] args){
	 *    	int edad = 34;
	 *    
	 *  	System.out.println(edad); // imprime 34
	 *     }
	 *  
	 *  }
	 *************************************************************f	****************************************************
	 ******************************************************************************************************************* 
	 long : EL TIPO DE DATO long ES UN ENTERO DE COMPLEMENTO A DOS DE 64 BITS, SU RANGO DE 
	 VALORES SE ENCUENTRA ENTRE -9,223,372,036,854,775,808 (-2 ^ 63) a 9,223,372,036,854,775,807 (2 ^ 63 -1) (inclusive).
	 SU VALOR MINIMO ES DE - 9,223,372,036,854,775,808 Y EL VALOR MAXIMO ES  9,223,372,036,854,775,807. SU VALOR 
	 PREDETERMINADO ES 0, EL TIPO DE DATO LONG SE UTILIZA CAUNDO SE NECESITA UN RANGO DE VALORES MAYOR QUE LOS 
	 PROPORCIONADOS POR INT
	 
	 NOTA : PARA DECLARAR UNA VARIABLE DE TIPO LONG SE DEBE COLOCAR EL SUFIJO L AL FINAL DE LA VARIABLE, 
	 EJEMPLO :
	 
	 	public class EjemploLong {
	 *   
	 *    public static void main(String [] args){
	 *  	long numero = 20000000L;
	 *  
	 *  	System.out.println(numero); // imprime 20000000
	 *     }
	 *  
	 *  }
	 *******************************************************************************************************************
	 *******************************************************************************************************************
	 * float : EL TIPO DE DATO float ES UN PUNTO FLOTANTE IEEE 754 DE 32 BITS DE PRECISION 
	 * SIMPLE. SU RANGO DE VALORES ILIMITADO. SE RECOMIENDA USAR FLOAT ("EN LUGAR DE DOUBLE") SI SE NECESITA GUARDAR 
	 * MEMORIA EN GRANDES MATRICES DE NUMEROS DE COMA FLOATANTE, 
	 * EJEMPLO :
	 * 
	 *   public class EjemploFloat {
	 *   
	 *    public static void main(String [] args){
	 *  	float sueldo = 450,56
	 *  	System.out.println(sueldo); // imprime 450,56
	 *     }
	 *  
	 *  }
	 ******************************************************************************************************************
	 ******************************************************************************************************************
	 * double : EL TIPO DE DATO double ES UN PUNTO FLOTANTE IEEE 754 DE DOUBLE PRECISION DE 64 BITS. SU RANGO
	 * DE VALORES ES ILIMITADO. EL TIPO DE DATOS DOUBLE GENERALMENTE SE USA PARA VALORES DECIMALES COMO FLOTANTES, 
	 * ESTE TIPO DE VALOR NO DE BE USARSE NUNCA PARA VALORES PRECISOS COMO LA MONEDA, EJEMPLO :
	 * 
	 *    public class EjemploDouble {
	 *   
	 *      public static void main(String [] args){
	 *  	  double numero = 50.30
	 *  	  System.out.println(numero);  // imprime 50.30
	 *      }
	 *  
	 *  }
	 ******************************************************************************************************************
	 ******************************************************************************************************************
	 * char : EL TIPO DE DATOS char ES UN UNICO CARACTER UNICOIDE DE 16 BITS. SU RANGO DE VALORES SE 
	 * ENCUENTRA ENTRE  '\ u0000' (o 0) a '\ uffff' a '\ uffff' (o 65,535 inclusive) EL TIPO DE DATOS CHAR SE USA PARAV 
	 * ALMACENAR CARACTERES, EJEMPLO :
	 * 
	 * public class EjemploChar {
	 *   
	 *    public static void main(String [] args){
	 *  	char letterA = 'A'
	 *  	System.out.println(letterA); // imprimie A
	 *     }
	 *  
	 *  }
	 *******************************************************************************************************************
	 *******************************************************************************************************************
		EJERCCICIOS TIPOS DE DATOS EN JAVA :
		
		1 . REALIZAR LA CARGA DE DOS NUMEROS ENTEROS POR TECLADO E IMPRIMIR SU SUMA Y SU PRODUCTO.
		
		2 . REALIZAR LA CARGA DEL LADO DE UN CUADRADO, MOSTRAR POR PANTALLA EL PERIMETRO DEL MISMO (EL PERIMETRO DE UN 
		    CUADRADO SE CALCULA MULTIPLICANDO EL VALOR DEL LADO POR CUATRO)
		    
		3 . ESCRIBIR UN PROGRAMA EN EL CUAL SE INGRESEN CUATROS NUMEROS, CALCULAR E INFORMAR LA SUMA DE LOS DOS PRIMEROS 
		    Y EL  PRODUCTO DEL TERCERO Y EL CUARTO 
		       
		4 . REALIZAR UN PROGRAMA QUE LEA CUATRO VALORES NUMERICOS E INFORMAR SU SUMA Y PROMEDIO.
		
		5 . SE DEBE DESARROLLAR UN PROGRAMA QUE PIDA EL INGRESO DEL PRECIO DE UN ARTICULO Y LA CANTIDAD QUE LLEVA EL 
		    CLIENTE, MOSTRAR LO QUE DEBE ABONAR EL COMPRDOR.
     ********************************************************************************************************************
     ********************************************************************************************************************
	**/

}
