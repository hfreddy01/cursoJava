package cursoJava.tipoDatos;

public class ManualTiposDatosJava {
	/**
	 * **************************************************************************************************************************
	 * TIPOS DE DATOS EN JAVA :
	 * 
     * LOS TIPOS DE DATOS ESPECIFICAN LOS DIFERENTES TAMAÑOS Y VALORES QUE SE PUEDEN ALMACENAR EN LA VARIABLE. HAY DOS TIPOS
     * DE DATOS EN JAVA LOS CUALES SON :
     * 
     * TIPOS DE DATOS PRIMITIVOS : LOS TIPOS DE DATOS PRIMITIVOS SON (boolean, char, byte, short, int, long, float y double)
     * TIPOS DE DATOS NO PRIMITIVOS : LOS TIPOS DE DATOS NO PRIMITIVOS INCLUYEN CLASES, INTERFACES Y MATRICES.
     ****************************************************************************************************************************
       TIPOS DE DATOS PRIMITIVOS DE JAVA : 
       
       EN EL LENGUAJE JAVA LOS TIPOS DE DATOS PRIMITIVOS SON LOS COMPONENTES BASICO DE LA MANIPULACION DE DATOS, ESTOS SON LOS
       TIPOS DE DATOS DISPONIBLES EN EL LENGUAJE JAVA:
    
       NOTA : JAVA ES UN LENGUAJE DE PROGRAMACION DE TIPO STATICO, ES DECIR QUE TODAS LAS VARIABLES DEBEN DECLARARSE ANTES DE SU
       USO, ES POR ESO QUE NECESITAMOS DECLARAR EL TIPO Y EL NOMBRE DE LA VARIABLE, EXISTEN 8 TIPOS DE DATOS PRIMITIVOS LOS CUALES
       SON :
     *****************************************************************************************************************************
     * TIPO DE DATOS BOOLEANOS : EL TIPO DE DATOS BOOLEANOS SE USA PARA ALMACENAR SOLO DOS VALORES POSBLES : TRUE Y FALSE.
     * ESTE TIPO DE DATOS SE USA PARA CONDICIONALES QUE PERMITAN VALIDAR SI UNA ACCION ES VERDADERA O FALSA EJEMPLO :
  
         public class Ejemplo {
	 *    // VARIABLES DE TIPO BOOLEAN QUE SE ENCUENTRA UBICADA EN UNA CLASE FUERA DE UN METODO.
	 *    public boolean nombre = true;
	 *  
	 *    public static void main(String [] args){
	 *  	
	 *     } // NOTA : LE FALTA UN BUEN EJEMPLO DE EJERCICIO PARA ENTEDER MEJOR ESTE TIPO DE DATO PRIMITIVO.
	 *  
	 *  }
	 * *************************************************************************************************************************** 
	 * TIPO DE DATOS DE BYTE : EL TIPO DE DATOS BYTE ES UN EJEMPLO DE TIPO DE DATO PRIMITIVO, ES UN ENETERO DE DOS BITS CON SIGNO
	 * DE 8 BITS. SU RANGO DE VALORES SE ENCUENTRA ENTRE -128 A 127(INCLUSIVE). SU VALOR MINIMO ES -128 Y EL VALOR MAXIMO ES 127
	 * SU VALOR PREDETERMINADO ES 0, EL TIPO DE DATOS BYTE SE USA PARA AHORRAR MEMORIA EN MATRICER("arrays") GRANDES DONDE EL
	 * AHORRO DE MEMORIA ES MAS NECESARIO, AHORRA ESPACIO PORQUE UN BYTE ES 4 VECES MAS PEQUEÑO QUE UN ENTERO("int"), TAMBIEN SE
	 * PUEDE USAR EN LUGAR DE TIPO DE DATOS "int" EJEMPLO :
	 * 
	 *   public class Ejemplo {
	 *   
	 *    public static void main(String [] args){
	 *  	byte numero = 2;
	 *  	System.out.println(numero);
	 *     }
	 *  
	 *  }
	 **************************************************************************************************************************** 
	  TIPO DE DATOS SHORT : EL TIPO DE DATOS SHORT ES UN ENTERO("int") DE DOS BITS CON SIGNO DE 16 BITS, SU RANGO DE VALORES SE
	  ENCUENTRA ENTRE -32,768 y 32,767 (INCLUSIVE). SU VALOR MINIMO ES -32,768  Y EL VALOR MAXIMO ES 32,767. SU VALOR 
	  PREDETERMINADO ES CERO(0), EL TIPO DE DATOS SHORT TAMBIEN SE PUEDE UTILIZAR PARA AHORRAR ESPACIO EN MEMORIA AL IGUAL QUE EL
	  TIPO DE DATOS DE BYTE, UN TIPO DE DATOS SHORT ES 2 VECES MAS PEQUEÑO QUE UN ENTERO, EJEMPLO :
	  
	    public class Ejemplo {
	 *   
	 *  public static void main(String [] args){
	 *  	short numero = 5;
	 *  	System.out.println(numero);
	 *     }
	 *  
	 *  }
     *****************************************************************************************************************************   
	  TIPO DE DATOS INT : EL TIPO DE DATO INT ES UN ENTERO DE COMPLEMENTO DE DOS CON SIGNO DE 32 BITS. SU RANGO DE VALORES SE
	  ENCUENTRA ENTRE - 2,147,483,648 (-2 ^ 31) a 2,147,483,647 (2 ^ 31 -1) INCLUSIVE SU VALOR MINIMO ES - 2,147,483,648 Y EL
	  VALOR MAXIMO ES 2,147,483,647  SU VALOR PREDETERMINADO ES 0, EL TIPO DE DATOS INT GENERALMENTE SE USA COMO UN TIPO DE DATO 
	  PREDETERMINADO PARA VALORES INTEGRALES A MENOS QUE NO HAYA NINGUN PROBLEMA CON LA MEMORIA, EJEMPLO :
	  
	  public class Ejemplo {
	 *   
	 *  public static void main(String [] args){
	 *  	int edad = 34;
	 *  	System.out.println(edad);
	 *     }
	 *  
	 *  }
	 ****************************************************************************************************************************** 
	 TIPO DE DATOS LONG : EL TIPO DE DATO LONG ES UN ENTERO DE COMPLEMENTO A DOS DE 64 BITS, SU RANGO DE VALORES SE ENCUENTRA
	 ENTRE -9,223,372,036,854,775,808 (-2 ^ 63) a 9,223,372,036,854,775,807 (2 ^ 63 -1) (inclusive). SU VALOR MINIMO ES DE 
	 - 9,223,372,036,854,775,808 Y EL VALOR MAXIMO ES  9,223,372,036,854,775,807. SU VALOR PREDETERMINADO ES 0, EL TIPO DE DATO
	 LONG SE UTILIZA CAUNDO SE NECESITA UN RANGO DE VALORES MAYOR QUE LOS PROPORCIONADOS POR INT
	 
	 NOTA : PARA DECLARAR UNA VARIABLE DE TIPO LONG SE DEBE COLOCAR EL SUFIJO L AL FINAL DE LA VARIABLE, EJEMPLO :
	 
	 	public class Ejemplo {
	 *   
	 *    public static void main(String [] args){
	 *  	long numero = 20000000L;
	 *  	System.out.println(numero);
	 *     }
	 *  
	 *  }
	 ******************************************************************************************************************************
	 * TIPOS DE DATOS FLOAT : EL TIPO DE DATO FLOAT ES UN PUNTO FLOTANTE IEEE 754 DE 32 BITS DE PRECISION SIMPLE. SU RANGO DE
	 * VALORES ILIMITADO. SE RECOMIENDA USAR FLOAT ("EN LUGAR DE DOUBLE") SI SE NECESITA GUARDAR MEMORIA EN GRANDES MATRICES DE
	 * NUMEROS DE COMA FLOATANTE, EJEMPLO :
	 * 
	 * public class Ejemplo {
	 *   
	 *    public static void main(String [] args){
	 *  	float sueldo = 450,56
	 *  	System.out.println(sueldo);
	 *     }
	 *  
	 *  }
	 *******************************************************************************************************************************
	 * TIPO DE DATOS DOUBLE : EL TIPO DE DATO DOUBLE ES UN PUNTO FLOTANTE IEEE 754 DE DOUBLE PRECISION DE 64 BITS. SU RANGO DE 
	 * VALORES ES ILIMITADO. EL TIPO DE DATOS DOUBLE GENERALMENTE SE USA PARA VALORES DECIMALES COMO FLOTANTES, ESTE TIPO DE VALOR
	 * NO DE BE USARSE NUNCA PARA VALORES PRECISOS COMO LA MONEDA, EJEMPLO :
	 * 
	 * public class Ejemplo {
	 *   
	 *    public static void main(String [] args){
	 *  	double numero = 50.30
	 *  	System.out.println(numero);
	 *     }
	 *  
	 *  }
	 *******************************************************************************************************************************
	 * TIPO DE DATOS CHAR : EL TIPO DE DATOS CHAR ES UN UNICO CARACTER UNICOIDE DE 16 BITS. SU RANGO DE VALORES SE ENCUENTRA ENTRE 
	 * '\ u0000' (o 0) a '\ uffff' a '\ uffff' (o 65,535 inclusive) EL TIPO DE DATOS CHAR SE USA PARAV ALMACENAR CARACTERES,
	 * EJEMPLO :
	 * 
	 * public class Ejemplo {
	 *   
	 *    public static void main(String [] args){
	 *  	char letterA = 'A'
	 *  	System.out.println(letterA);
	 *     }
	 *  
	 *  }
	 ********************************************************************************************************************************


	**/

}
