package cursoJava.operadores;

public class Manual_de_Operadores {
/**
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES JAVA : 
	  
* JAVA PROPORCIONA MUCHOS TIPOS DE OPERADORES QUE SE PUEDEN USAR SEGUN LA NECESIDAD. SE CLASIFICAN SEGUN LA 
* FUNCIONALIDAD QUE BRINDA, LOS OPERADORES EN JAVA SE UTILIZAN MAS QUE TODO PARA COMPARAR EXPRESIONES, O EN ALGUNOS 
* CASOS TAMBIEN PARA VALIDAR TODO DEPENDE DEL TIPO DE OPERADOR Y PARA LO QUE SE VAYA A UTILIZAR, ALGUNOS DE LOS 
* TIPOS SON LOS SIGUIENTES :
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES ARITMETICOS : SE UTILIZAN PARA REALIZAR OPERCIONES DE SUMA, RESTA, MULTIPLICACION, DIVISION, Y RESTO DE
* LA DIVISION 0 MODULO, EJEMPLO :
	  
* + SUMA
* - RSTA
* * MULTIPLICACION
* / DIVISION
* % MODULO O RESTO DE LA DIVISION
	  
	  public class EjemploOperacionesAritmeticos  {
	  
	    //METODO.
	    public static void main(String [] args){
	      int num1 = 20;
	      int num2 = 20;
	      int suma, resta, multiplicacion, division, modulo;
	       
	      // VALIDAMOS RESULTADOS.
	      suma = num1 + num2;
	      resta = num1 - num2;
	      multiplicacion = num1 * num2;
	      division = num1 / num2;
	      modulo = num1 % num2;
	       
	     // IMPRIMIMOS RESULTADOS DE LAS OPERACIONES ARITMETICAS.   
	     System.out.println(suma);
	     System.out.println(resta);
		 System.out.println(multiplicacion);
		 System.out.println(division);
		 System.out.println(modulo);
	    }
	   
	 }
	  
* NOTA : EL OPERADOR + TAMBIEN SIRVE PARA CONCATENAR VALORES Y VARIABLES. 
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES UNARIOS : LOS OPETADORES UNARIOS SOLO NECESITAN UN OPERANDO, SE USAN PARA INCREMENTAR, DISMINUIR O NEGAR UN VALOR :
	  
*  - : OPERADOR UNARIO MENOS : UTILIZADO PARA NEGAR VALORES
*  + : OPERADOR UNARIO MAS : UTILIZADO PARA VALORES POSITIVOS
*  ++ : OPERADOR DE INCREMENTO : UTILIZADO PARA INCREMENTAR UN VALOR EN 1 EJEMPLO : ;
*  PRE-INCREMENETO : EL VALOR SE INCREMENTA PRIMERO Y LUEGO SE IMPRIME EL RESULTADO EJEMPLO : ++num;
*  POST-INCREMENTO : EL VALOR SE USA PARA CALCULAR EL RESULTADO Y LUEGO SE INCREMENTA EJEMPLO : num++;
*  -- : OPERADOR DE DECREMENTO : UTILIZADOMPARA DISMINUIR UN VALOR EN 1
*  PRE-DECREMENTO : EL VALOR SE DISMINUYE Y LUEGO SE IMPRIME EL RESULTADO EJEMPLO : --num;
	   
*  EJEMPLO :
	   
	  public class EjemploOperadorUnario{
	  
	   // METODO.
	   	public static void main(String[] args){
	   	  int num1 = 1;
	   	  
	   	  // IMPRIMIMOS RESULTADOS DE INCREMENTO
	   	  num1++;
	   	  // ++num1;
	   	  System.out.println(num1);
	   
	   	  int num2 = 100;
	   	  // IMPRIMIMOS RESULTADOS DE DECREMENTO
	   	  num2--;
	      //--num2;
	   	  System.out.println(num1);		
	     }
	  }
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES DE ASIGNACION : SE ESCRIBE CON EL SIGNO DE IGUAL = LOS OPERADORES DE ASIGNACION SE UTILIZA PARA SIGNAR VALORES 
* A LAS VARIABLES, EJEMPLO :
	  
	  public class EjemploOperaciones  {
	    // METODO.
	    public static void main(String [] args){
	     int numero = 3; 
	     
	     System.out.println(numero);  // IMPRIME 3
	     }
       }	 
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES RELACIONALES : LOS OPERADORES RELACIONALES SE UTILIZAN PARA COMPARAR VALORES, POR LO GENERAL ESTOS 
* OPERADORES SE UTILIZAN CON CONDICIONALES Y BUCLES LOS OPERADORES SON :
	  
* == : IGUAL QUE
* < : MENOR QUE
* > : MAYOR QUE
* <= : MENOR IGUAL QUE
* >= : MAYOR IGUAL QUE
* != : DISTINTO DE
	  
* EJEMPLO :
	  
	public class EjemploOperaciones  {
	  // METODO. 
      public static void main(String [] args){
	    int edad = 18;
	    if(edad > 18){
	      System.out.println("Es mayor de edad");
	     }    
	  }
    }
       
NOTA : ESTOS OPERADORES SE UTILIZAN MEJOR CON CONDICIONALES. 
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADORES LOGICOS : SE UTILIZAN PARA DETERMINAR LA LOGICA ENTRE VARIABLES O VALORES, DENTRO DE ESTOS OPERADORES,TENEMOS LOS 
* SIGUIENTE :
	 
* OPERADOR LOGICO AND : SE ESCRIBE CON LA PALABRA RESERVADA && ESTE OPERADOR DEVUELVE VERDADERO (true) CUANDO AMBAS 
* SENTENCIAS ON VERDADERAS EJEMPLO :
	  
	 public class EjemploAnd {
	    // METODO.
        public static void main(String[] args) {
          int x = 5;
          System.out.println(x > 3 && x < 10);   // Devuelve verdadero si ambas afirmaciones son verdaderas
          }
      }
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADOR LOGICO OR : SE ESCRIBE CON LA PALABRA RESERVADA || ESTE OPERADOR DEVUELVE VERDADERO (true) SI ALGUNA DE LAS SENTENCIA 
* ES VERDADERA EJEMPLO :
	  
	 public class EjemploOr {
	    // METODO.
        public static void main(String[] args) {
         int x = 5;
         System.out.println(x > 3 || x < 4);
         
         // devuelve verdadero porque una de las condiciones es verdadera (5 es mayor que 3, pero 5 no es menor que 4)
         }
     }
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADOR LOGICO DE NEGACION O DISTINTO != : SE ESCRIBE CON LA PALABRA RESERVADA ! Y SE USA PARA NEGAR INSTRUCCIONES DE CODIGO, 
* EJEMPLO :
	   
	  public class EjemploNegacion {
	  
	     // METODO.
         public static void main(String[] args) {
           int x = 5;
           int y = 3;
             System.out.println(x != y); // devuelve verdadero porque 5 no es igual a 3
          }
     }
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADOR TERNARIO : EL OPERADOR TERNARIO ES UNA VERSION ABREVIADA DE LA DECLARACION IF-ELSE ESTE OPERADOR CUENTA CON TRES 
* OERANDO DE ALLI EN NOMBRE DE TERNARIO, EL FORMAO GENERAL ES (condicion ? if true : if false) ESTE OPERADOR CONSTA DE TRES 
* OPERANDO, PRIMERO LA CONDICION DETRO DE PARENTESIS, EL ? QUE REPRESENTA LA CONDICON TRUE, Y EL : REPRESENTA LA CONDICION 
* FALSE EJEMPLO : variable = (condition) ? expressionTrue :  expressionFalse;
*  EJEMPLO:
	  
    public class OperadorTernario {
      // METODO.
       public static void main(String[] args) {   
	   int time = 20;
	   String result;
	   result = (time < 18) ? "Buen diay" : "Buenas noches";
	       System.out.println(result);
         }
      }
***********************************************************************************************************************************
***********************************************************************************************************************************
** EJERCICICOS OPERADORES LOGICOS : 
	 
*  1 - CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO TRES NUMEROS DISTINTOS Y NOS MUESTRE EL MAYOR.
	   
*  2 - SE CARGA UNA FECHA(DIA Y MES) POR TECLADO. MOSTRAR UN MENSAJE SI CORRESPONDE AL PRIMER TRIMESTRE DEL AÑO 
*      (ENERO, FEBRERO MARZO) CARGAR POR TECLADO EL VALOR NUMERICO DEL DIA, Y MES. EJEMPLO : dia:10 mes:1
	       
*  3 - REALIZAR UN PROGRAMA QUE PIDA UNA FECHA CUALQUIERA, LUEGO VERIFICAR SI DICHA FECHA CORRESPONDE A NAVIDAD.
	   
*  4 - SE INGRESAN TRES VALORES POR TECLADO, SI TODOS SON IGUALES SE IMPRIME LA SUMA DEL PRIMERO CON EL SEGUNDO Y A 
*      ESTE RESULTADO SE LO MULTIPLICA POR EL TERCERO
	       
*  5 - SE INGRESAN POR TECLADO TRES NUMEROS, SI TODOS LOS VALORES INGRESADOS SON MENORES A 10 , IMPRIMIR EN PANTALLA
*      UN MENSAJE  "TODOS LOS NUMEROS SON MENORES A DIEZ"
	       
*  6 - SE INGRESAN POR TECLADO TRES NUMEROS, SI AL MENOS UNO DE LOS VALORES INGRESADOS ES MENOR A 10 , IMPRIMIR EN
*      PANTALLA UN MENSAJE  "ALGUNO DE LOS NUMEROS ES MENOR A DIEZ"
	       
*  7 - ESCRIBIR UN PROGRAMA QUE PIDA INGRESAR LA COORDENADA DE UN PUNTO EN EL PLANO, ES DECIR DOS VALORES ENTEROS 
*      (x - y) (DISTINTOS A CERO) POSTERIORMENTE IMPRIMIR EN PANTALLA EN QUE CUADRANTE SE UBICA DICHO PUNTO, 
*      EJEMPLO: (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
	       
*  8 - DE UN OPERARIO SE CONOCE SU SUELDO Y LOS AÑOS DE ANTIGUEDAD. SE PIDE CONFECCIONAR UN PROGRAMA QUE LEA LOS 
*      DATOS DE ENTRADA E INFORME: A) SI EL SUELDO ES INFERIOR A 500 Y SU ANTIGUEDAD ES IGUAL O SUPERIOR A 10 AÑOS, 
*      OTORGARLE UN AUMENTO DE 20%, MOSTRAR EL SUELDO A PAGAR. B) SI EL SUELDO ES INFERIOR A 500 PERO SU ANTIGUEDAD 
*      ES MENOR A 10 AÑOS OTORGARLE UN AUMENTO DE 5% C) SI EL SUELDO ES MAYOR O IGUAL A 500 MOSTRAR EL SUELDO EN 
*      PANTALLA SIN CAMABIOS.
	      
*  9 - ESCRIBIR UN PROGRAMA EN EL CUAL DADA UNA LISTA DE TRES VALORES NUMERICOS DISTINTOS SE CALCULE E INFORME SU 
*      RANGO DE VARIACION (DEBE MOSTRAR EL MAYOR Y EL MENOR DE ELLOS).
***********************************************************************************************************************************
***********************************************************************************************************************************
	 
	 */

}
