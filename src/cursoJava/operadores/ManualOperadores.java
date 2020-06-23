package cursoJava.operadores;

public class ManualOperadores {
	/**
	 * **************************************************************************************************************************
	 * OPERADORES JAVA : 
	 * 
	 * JAVA PROPORCIONA MUCHOS TIPOS DE OPERADORES QUE SE PUEDEN USAR SEGUN LA NECESIDAD. SE CLASIFICAN SEGUN LA FUNCIONALIDAD
	 * QUE BRINDA ALGUNOS DE LOS TIPOS SON LOS SIGUIENTES :
	 * **************************************************************************************************************************
	 * OPERADORES ARITMETICOS : SE UTILIZAN PARA REALIZAR OPERCIONES DE SUMA, RESTA, MULTIPLICACION, DIVISIO, Y RESTO DE LA
	 * DIVISION 0 MODULO, LOS TIPOS DE OPERADORES ARITMETICOS EN JAVA SON LOS SIGUIENTES :
	 * + SUMA
	 * - RSTA
	 * * MULTIPLICACION
	 * / DIVISION
	 * % MODULO O RESTO DE LA DIVISION
	 * 
	 * EJEMPLO :
	 * 
	 * public class EjemploOperaciones  {
	 *   
	 *   public static void main(String [] args){
	 *  	int num1 = 20;
	 *      int num2 = 20;
	 *      int suma, resta, multiplicacion, division, modulo;
	 *      
	 *      // VALIDAMOS RESULTADOS.
	 *      suma = num1 + num2;
	 *      resta = num1 - num2;
	 *      multiplicacion = num1 * num2;
	 *      division = num1 / num2;
	 *      modulo = num1 % num2;
	 *      
	 *      // IMPRIMIMOS RESULTADOS DE LAS OPERACIONES ARITMETICAS.   
	 *  	System.out.println(suma);
		 *  System.out.println(resta);
		 *  System.out.println(multiplicacion);
		 *  System.out.println(division);
		 *  System.out.println(modulo);
	 *     }
	 *  
	 *  }
	 **************************************************************************************************************************
	 * OPERADORES UNARIOS : LOS OPETADORES UNARIOS SOLO NECESITAN UN OPERANDO, SE USAN PARA INCREMENTAR, DISMINUIR O NEGAR UN
	 * VALOR :
	 * 
	 *  - : OPERADOR UNARIO MENOS : UTILIZADO PARA NEGAR VALORES
	 *  + : OPERADOR UNARIO MAS : UTILIZADO PARA VALORES POSITIVOS
	 *  ++ : OPERADOR DE INCREMENTO : UTILIZADO PARA INCREMENTAR UN VALOR EN 1 EJEMPLO : ;
	 *  PRE-INCREMENETO : EL VALOR SE INCREMENTA PRIMERO Y LUEGO SE IMPRIME EL RESULTADO EJEMPLO : ++num;
	 *  POST-INCREMENTO : EL VALOR SE USA PARA CALCULAR EL RESULTADO Y LUEGO SE INCREMENTA EJEMPLO : num++;
	 *  -- : OPERADOR DE DECREMENTO : UTILIZADOMPARA DISMINUIR UN VALOR EN 1
	 *  PRE-DECREMENTO : EL VALOR SE DISMINUYE Y LUEGO SE IMPRIME EL RESULTADO EJEMPLO : --num;
	 *  EJEMPLO :
	 *  
	 *  public class EjemploOperadorUnario{
	 *  	public static void main(String[] args){
	 *  		int num1 = 1;
	 *  		// IMPRIMIMOS RESULTADOS DE INCREMENTO
	 *  		num1++;
	 *  		// ++num1;
	 *  		System.out.println(num1);
	 *  
	 *  		int num2 = 100;
	 *  		// IMPRIMIMOS RESULTADOS DE DECREMENTO
	 *  		num2--;
	 *          //--num2;
	 *  		System.out.println(num1);		
	 *    }
	 *  }
	 **************************************************************************************************************************
	 * OPERADORES DE ASIGNACION : LOS OPERADORES DE ASIGNACION SE UTILIZA PARA SIGNAR VALORES A LAS VARIABLES, EJEMPLO :
	 * 
	 *  public class EjemploOperaciones  {
	 *   
	 *    public static void main(String [] args){
	 *    	int numero = 3; 
	 *    	System.out.println(numero);
	 *    }
       }	 
	 **************************************************************************************************************************
	 * OPERADORES RELACIONALES : LOS OPERADORES RELACIONALESM SE UTILIZAN PARA COMPARAR VALORES, LOS CUALES SON :
	 * == : IGUAL QUE
	 * < : MENOR QUE
	 * > : MAYOR QUE
	 * <= : MENOR IGUAL QUE
	 * >= : MAYOR IGUAL QUE
	 * != : DISTINTO DE
	 * 
	 * EJEMPLO :
	 *  public class EjemploOperaciones  {
	 *   
	 *    public static void main(String [] args){
	 *   
	 *    }
       }
	 **************************************************************************************************************************
	 * OPERADORES LOGICO AND : LOS OPERADORES LOGICOS SE UTILIZAN CON LA PALABRA RESERVADA "&&"  Y SE USA PARA DETERMINAR 
	 * LA LOGICA ENTRE VARIABLES Y VALORES. EL OPERADOR AND(&&) DEVUELVE VERDADERO SI AMBAS AFIRMACIONES SON VERDAERAS, 
	 * EJEMPLO :
	 * 
	 * public class MyClass {
         public static void main(String[] args) {
          int x = 5;
          System.out.println(x > 3 && x < 10);  // devuelve verdadero porque 5 es mayor que 3 Y 5 es menor que 10
          }
      }
	 **************************************************************************************************************************
	 * OPETRADOR LOGICO OR : SE ESCRIBE CON LA PALABRA RESERVADA || ESTE OPERADOR DEVUELVE VERDADERO SI UNA DE LAS 
	 * DECLARACIONES ES VERDADERA, EJEMPLO :
	 * 
	 * public class MyClass {
         public static void main(String[] args) {
         int x = 5;
         System.out.println(x > 3 || x < 4);         
        // devuelve verdadero porque una de las condiciones es verdadera (5 es mayor que 3, pero 5 no es menor que 4
        }
	  }
	 **************************************************************************************************************************
	 * OPERADOR LOGICO NEGACION : SE ESCRIBE CON LA PALABRA RESERVADA (!) SE USA PARA INVERTIR EL RESULTADO, DEVUELVE FALSO SI
	 * EL RESULTADO ES VERDADERO, EJEMPLO : 
	 * 
	 * public class MyClass {
         public static void main(String[] args) {
         int x = 5;
         System.out.println(!(x > 3 && x < 10)); // devuelve falso porque! (no) se usa para revertir el resultado
         }
     }
	 **************************************************************************************************************************
	 * OPERADOR LOGICO TERNARIO : EL OPERADOR TERNARIO ES UNA VERSION ABREVIADA DE LA DECLARACION IF-ELSE, ESTE OPERADOR TIENE
	 * TRES OPERANDO, EJEMPLO:
	 * 
	 * clase  OperatorExample {  
		public static void  main (String args []) {    
		int  a = 2 ;  
		int  b = 5 ;  
		int  min = (a <b)? a: b;  // operador ternario
		System.out.println (min);  
		}
	 }
	 **************************************************************************************************************************
	 * NOTA : FALTA COMPLETAR ESTA SECCION.
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 **************************************************************************************************************************
	 ************************************************************************************************************************** 

	 */

}
