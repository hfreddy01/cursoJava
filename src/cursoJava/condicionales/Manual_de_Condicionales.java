package cursoJava.condicionales;

public class Manual_de_Condicionales {
/**
***********************************************************************************************************************************
***********************************************************************************************************************************
*  ESTRUCTURAS CONDICIONALES EN JAVA : 
	   
* LA TOMA DE DECICIONES EN LA PROGRAMACION ES SIMILAR A LA TOMA DE DECISIONES EN LA VIDA REAL. EN LA PROGRAMACION TAMBIEN 
* ENFRENTAMOS ALGUNAS SITUACIONES EN LAS QUE QUEREMOS QUE SE EJECUTE CIERTO BLOQUE DE CODIGO CUANDO SE CUMPLE UNA COMDICION, UN 
* LENGUAJE DE PROGRAMACION UTILIZA INSTRUCCIONES DE CONTROL PARA CONTROLAR EL FLUJO DE EJECUCION DEL PROGRAMA EN FUNCION DE 
* CIERTAS CONDICIONES. ESTOS SE UTILIZAN PARA HACER QUE EL FLUJO DE EJECUCION AVANCE Y SE RAMIFIQUE EM FUNCION DE LOS CAMBIOS EN 
* EL ESTADO DE UN PROGRAMA. EN JAVA EXISTEN VARIOS TIPOS DE CONDICIONALES QUE PODEMOS UTILIZAR DE ACORDE A LA NECESIDAD QUE SE 
* REQUIERA AL MOMENTO, LOS CONDICONALES QUE PRESENTAREMOS A CONTINUACION SON LOS SIGUIENTES :
***********************************************************************************************************************************
***********************************************************************************************************************************
* if : LA SENTENCIA "if" SE USA PARA ESPECIFICAR UN BLOQUE DE CODIGO QUE SE EJECUTARA, SI UNA CONDICION ES PECIFICADA ES 
* VERDADERA EJEMPLO :
	   
	 if (20 > 18) {
	    // IMPRIMIMOS 
        System.out.println("20 es mayor que 18");
      }
      
* NOTA : LA CONDICION DENTRO DE LA SENTENCIA if DEBE SER UNA EXPRESION "BOOLEANA" ES DECIR DEBE DEVOLVER UN VALOR 
***********************************************************************************************************************************
***********************************************************************************************************************************
* else :  LA SENTENCIA "else" SE USA PARA ESPECIFICAR UN BLOQUE DE CODIGO QUE SE EJECUTARA, SI UNA CONDICION ES PECIFICADA ES 
* FALSA EJEMPLO :
	   
	   class EjemploCondicionalesCompuesta {
	   
	    // METODO.
        public static void main(String args[]){
          int i = 20;
          
          // VALIDAMOS CONDICION.
          if (i < 15){
            System.out.println("Soy menor que 15");
          } else {
               System.out.println("Soy mayor de 15");
          }
        }  
     }
     
* NOTA : LA DECLARACION IF SOLO NOS DICE QUE, SI UNA CONDICION ES VERDADERA EJECUTARA UN BLOQUE DE INSTRUCCIONES Y SI LA CONDICION 
  ES FALSA. NO LO HARA. PERO ¿Y SI QUEREMOS HACER OTRA COSA CUANDO LA CONDICION SEA FALSA? AQUI VIENE LA DECLARACION ELSE. 
  PODEMOS USAR LA DECLARACION ELSE CON LA INSTRUCCION else CON LA INSTRUCCION if PARA EJECUTAR UN BLOQUE DE CODIGO CUANDO LA 
  CONDICION SEA FALSA   
***********************************************************************************************************************************
***********************************************************************************************************************************
* else if : LA SENTENCIA "else-if" SE USA PARA ESPECIFICAR UNA NUEVA CONDICION SI LA PRIMERA ES FALSA, EJEMPLO :
	  
     int time = 22;
     
     // VALIDAMOS.
	  if (time < 10) {
		  System.out.println("Buenos dias.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Buenas noches");
		}
	  
	  
* NOTA : EN EL EJEMPLO ANTERIOR, LA VARIABLE time(22) ES MAYOR QUE 10, POR LO QUE LA PRIMERA CONDICION ES false. LA SIGUIENTE 
* CONDICION EN EL else if TAMBIEN ES false, ASI PASAMOS A AL else, YA QUE LA CONDICION1 Y LA CONDICION2 SON AMBAS false, E 
* IMPRIMIMOS EN LA PANTALLA "Buenas noches", SIN EMBARGO SI LA VARIABLE time FUERA 14, NUESTRO PROGRAMA EN LA PANTALLA  IMPRIMIRIA 
* "Buen día".
***********************************************************************************************************************************
***********************************************************************************************************************************
* CONDICONALES ANIDADAS : UN if ANIDADO ES UNA DECLARACION IF QUE SE DERIVA DE OTRO IF O ELSE, LAS DECLARACIONES IF
* ANIDADAS SIGNIFICAN UNA INSTRUCCION IF DENTRO DE UNA DECLARACION IF. SI JAVA NOS PERMITE ANIDAR LAS DECLARACIONES 
* IF CON IF ES DECIR PODEMOS COLOCAR UNA INSTRUCCION IF DENTRO DE OTRA INSTRUCCION IF, EJEMPLO : 
	  
	  public class EjemploCondicionalesAnidadas {
	   
          public static void main(String[] ar) {
	        Scanner teclado=new Scanner(System.in);
	        
	        int nota1,nota2,nota3;
	        System.out.print("Ingrese primer nota:");
	        nota1=teclado.nextInt();
	        
	        System.out.print("Ingrese segunda nota:");
	        nota2=teclado.nextInt();
	        
	        System.out.print("Ingrese tercer nota:");
	        nota3=teclado.nextInt();
	        
	        int promedio=(nota1 + nota2 + nota3) / 3;
	        
	        if (promedio>=7) {
	            System.out.print("Promocionado");    
	        } else {
	            if (promedio>=4) {
	                System.out.print("Regular");
	            } else {
	                System.out.print("Reprobado");
	            }
	        }
	    }
	 }
***********************************************************************************************************************************
***********************************************************************************************************************************
* OPERADOR TERNARIO : SEGURAMENTE YA HAZ ESCUCHADO DE ESTE OPERADOR, TAMBIEN ES UN CONDICIONAL, ES LA ABREVIATURA 
* DEL CONDICONAL IF-ELSE, ESTE OPERADOR CONSTA DE TRES OPERANDO, PRIMERO LA CONDICION DETRO DE PARENTESIS, EL ? 
* QUE REPRESENTA LA CONDICON TRUE, Y EL : REPRESENTA LA CONDICION FALSE
  variable = (condition) ? expressionTrue :  expressionFalse; EJEMPLO:
	  
	 public class MyClass {
	   // METODO.
       public static void main(String[] args) {   
         int time = 20;
         String result;
         result = (time < 18) ? "Good day" : "Good evening";
         System.out.println(result);
         }
      }
***********************************************************************************************************************************
***********************************************************************************************************************************
* CONDICONALES SWITCH : LA INSTRUCCION SWITCH ES UNA DECLARACION DE BIFURCACION DE MULTIPLES VIAS ("SELECCION MULTIPLES"). 
* PROPORCIONA UNA FORMA SENCILLA DE ENVIAR LA EJECUCION A DIFERENTES PARTES DEL CODIGO EN FUNCION DEL VALOR DE LA EXPRESION 
* EJEMPLO :
	  
	 public class MyClass {
	 
	    // METODO.
        public static void main(String[] args) {
	    int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	  }
	}
	
* NOTA : LA EXPRESION SWITCH SE EVALUA UNA VEZ. EL VALOR DE LA EXPRESION SE COMPARA CON LOS VALORES DE CADA UNO case. 
* SI HAY UNA CONCIDENCIA , SE EJECUTARA EL BLOQUE DE CADA ASOCIADO. CUANDO JAVA ALCANZA UN break SE ESCAPA DE BLOQUE 
* DE INSTRUCCIONES. ESTO DETENDRA LA EJECUCION DE MAS CODIGO Y PRUEBAS DE CASOS(case) DENTRO DEL BLOQUE. EL default 
* ESPECIFICA ALGUN CODIGO PARA EJECUTAR SI NO HAY COINCIDENCIA DE MAYUSCULAS Y MINUSCULAS.
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERCICIOS CONDICIONALES :
    
* 1 - INGRESAR EL SUELDO DE UNA PERSONA, SI SUPERA LOS 3000 PESOS, DEBE MOSTRAR UN MENSAJE EN PANTALLA INDICANDO QUE 
      DEBE ABONAR IMPUESTOS.
        
* 2 - REALIZAR UN PROGRAMA QUE SOLICITE INGRESAR DOS NUMEROS DISTINTOS Y MUESTRE POR PANTALLA EL MAYOR DE ELLOS.
    
* 3 - REALIZAR UN PROGRAMA QUE LEA POR TECLADO DOS NUMEROS, SI EL NUMERO PRIMERO ES MAYOR AL SEGUNDO INFORMAR SU SUMA 
      Y SU RESTA EN CASO CONTRARIO INFORMAR EL PRODUCTO Y LA DIVISION DEL PRIMERO RESPECTO AL SEGUNDO.
        
* 4 - SE INGRESAN TRES NOTAS DE UN ALUNNO, SI EL PROMEDIO ES MAYOR O IGUAL A SIETE MOSTRAR UN MENSAJE "Promocionado"
    
* 5 - SE INGRESA POR TECLADO UN NUMERO POSOTIVO DE UNO O DOS DIGITOS(1..99) MOSTRAR UN MENSAJE INDICANDO SI EL NUMERO
      TIENE UNO O DOS DIGITOS (TENER EN CUENTA QUE CONDICION DEBE CUMPLIRSE PARA TENER DOS DIGITOS. 
      "UN NUMERO ENTERO")
      
* 6 - CONFECCIONAR UN PROGRAMA QUE PIDA POR TECLADO TRES NOTAS DE UN ALUNNO, CALCULE EL PROMEDIO E IMPRIMA ALGUNO DE 
      ESTOS MENSAJES : SI EL PROMEDIO ES MAYOR O IGUAL A 7 MOSTRAR "PROMOCIONADO", SI EL PROMEDIO ES MAYOR O IGUAL A 
      4 Y MENOR QUE 7 MOSTRAR "REGULAR" SI EL PROMEDIO ES MENOR A 4 MOSTRAR "REPROBADO".
        
* 7 - SE CARGAN POR TECLADO TRES NUMEROS DISTINTOS, MOSTRAR POR PANTALLA EL MAYOR DE ELLOS.
    
* 8 - SE INGRESAN POR TECLADO UN VALOR ENTERO, MOSTRAR UN MENSAJE QUE INDIQUE SI EL NUMERO ES POSITIVO, NULO O 
       NEGATIVO.
    
* 9 - CONFECCIONAR UN PROGRAMA QUE PERMITA CARGAR UN NUMERO ENTERO POSITIVO DE HASTA TRES CIFRAS Y MUESTRE UN MENSAJE 
      INDICANDO SI TIENE 1, 2, 3 CIFRAS. MOSTRAR UN MENSAJE DE ERROR SI EL NUMERO DE CIFRAS ES MAYOR.
        
* 10  UN POSTULANTE A UN EMPLEO, REALIZA UN TEST DE CAPACITACION, SE OBTUVO LA SIGUIENTE INFORMACION: CANTIDAD TOTAL DE
      PREGUNTAS QUE SE REALIZARON Y LA CANTIDAD DE PREGUNTAS QUE CONTESTO CORRECTAMENTE. SE PIDE CONFECCIONAR UN 
      PROGRAMA QUE INGRESE LOS DOS DATOS POR TECLADO E INFORMAR EL NIVEL DEL MISMO SEGUN EL PORCENTAJE DE RESPUESTAS 
      CORRECTAS QUE SE HA OBTENIDO SABIENDO QUE: NIVEL MAXIMO Porcentaje>=90% NIVEL MEDIO Porcentaje>=75% y <90% NIVEL
      REGULAR Porcentaje>=50% y <75% FUERA DE NIVEL Porcentaje<50%
	    
* NOTA : SE PUEDEN UTILIZAR CUALQUIER TIPO DE CONDICIONALES COMPUESTAS SIMPLES ANIDADAS Y SWITCH 
***********************************************************************************************************************************
***********************************************************************************************************************************
	* 
	*/
}

