package cursoJava.string;

public class Manual_de_String {
/**
***********************************************************************************************************************************
***********************************************************************************************************************************
* CADENAS DE CARACTERES "String" : 
	 
* EN JAVA HEMOS VISTO QUE CUANDO QUEREMOS ALMACENAR UN VALOR ENTERO DEFINIMOS UNA VARIABLE DE TIPO int, SI QUEREMOS ALMACENAR UN
* VALOR CON DECIMALES DEFINIMOS UNA VARIABLE DE TIPO float. AHORA SI QUEREMOS ALMACENAR UNA CADENA DE CARACTERES (POR EJEMPLO UN 
* NOMBRE DE UNA PERSONA) DEBEMOS DEFINIR UN OBJETO DE LA CLASE String.
	  
* UNA CADENA DE CARATERES NO DEJA DE SER MAS QUE UNA SUCESION DE UN CONJUNTO DE CARATERES ALFANUMERICOS, PODEMOS ENCONTRARNOS 
* DESDE LA ARCHICONOCIDA CADENA "hola mundo" Y LA NO MENOS "mi primera pagina web", PASANDO POR LAS CADENAS DE TEXTO 
* PERSONALIZADAS.
	  
* NOTA : EN JAVA LAS CADENAS DE TEXTO "String" ES UNA CLASE QUE PERTENECE AL PAQUETE "java.lang.String" PARA CREAR
* UNA VARIABLE DE TIPO TEXTO SE DEBE ESCRIBIR LA CLASE "String" SEGUIDO DEL NOMBRE DE LA VARIABLE MAS EL VALOR DE DICHA VARIANLE 
* SEGUIDO DE PUNTO Y COMO, CABE RECORDAR QUE EN JAVA TODASS LAS VARIABLES DEBEN CULMINAR EN PUNTO Y COMA, EJEMPLO :
	  
* 	 String nombre = "Freddy Herrera";
	 
	 
* UNA CADENA EN JAVA ES EN REALIDAD UN OBSJETO, QUE CONTIENE METODOS QUE PUEDEN REALIZAR CIERTAS OPERACIONES EN 
* CADENAS, A CONTINUACION SE COMENTAN ALGNOS METODOS IMPORTANTES.
***********************************************************************************************************************************
***********************************************************************************************************************************
* charAt() : EL METODO charAt DEVUELVE EL CARACATER INDICADO POR PARAMETRO, EJEMPLO : 
	  
* 	String cadena = "El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";

    // IMPRIMIMO.
    System.out.println(cadena.charAt(0));   // Nos devolvera E
    System.out.println(cadena.charAt(11)); //  Nos devolvera u
           
NOTA : PARA CONTAR LA CADENA DE CARACTERES SIEMPRE COMIENZA POR CERO, UNO, DOS TRES .... Y ASI SUCESIVAMENTE EN EL EJEMPLO DE 
ARRIBA EL RESULTAO ES E PORQUE LA PRIMERA LETRA DE LA CADENA QUE CONTIENE LA VARIABLE CADENA ES COMIENZA CON "E", EN EL PARAMETRO 
DEL METODO charAt(0) PASAMOS COMO PARAMETRO EL CERO QUE CORRESPONDE A LA POSICION DE LA LETRA DE LA CADENA.  
***********************************************************************************************************************************
***********************************************************************************************************************************
* compareTo() : ESTE METODO SIRVE PARA COMPARAR CADENAS, DEVUELVE UN NUMERO SEGUN EL RESULTADO, POR EJEMPLO SI LA 
* VARIABLE X ES IGUAL AL ARGUMENTO DEVUELVE 0, SI VARIABLE X ES MENOR QUE EL ARGUMENTO DEVUELVE -1,  
* SI VARIABLE X ES MAYOR AL ARGUMENTO DEVUELVE 1,  EJEMPLO : 

	  public class EjemploCompareTo { 
         // METODO.
		 public static void main(String args[]) {
		  Integer x = 5;
		  
		   // IMPRIMIMOS.   
		   System.out.println(x.compareTo(3));           -1
		   System.out.println(x.compareTo(5));			 0
		   System.out.println(x.compareTo(8));            1 
		   }
		}
***********************************************************************************************************************************
***********************************************************************************************************************************
* equals() : EL METODO "equals" RETORNA VERDADERO SI LOS CONTENIDOS DE LOS DOS STRING SON EXACTAMENTE IGUALES, EJEMPLO :
* 
	   public class EjemploEquals { 
         // METODO.
		 public static void main(String args[]) {
             String apellido1 = "Herrera";
	         String apellido2 = "herrera";
	   
			  if (apellido1.equals(apellido2)) {
		            System.out.print("Los apellidos son iguales");
		       } else {
		            System.out.print("Los apellidos son distintos");
		         }
		       }
		    }  
      
* NOTA : PARA COMPARAR SI EL CONTENIDO DE LOS String SON IGUALES NO PODEMOS UTILIZAR EL OPERADOR == DEBEMOS  UTILIZAR UN METODO 
* DE LA CLASE String LLAMADO equals Y PASAR COMO PARAMETROD RL STRINGCON EL QUE QUEREMOS COMPARARLO
***********************************************************************************************************************************
***********************************************************************************************************************************
* equalsIgnoreCase() : ES IGUAL AL METODO equals LA DIFERENECIA ES QUE ESTE METODO IGNORA LAS MAYUSCULAS Y LAS MINUSCULAS, EJEMPLO :
	  
	   String apellido1 = "Herrera";
	   String apellido2 = "herrera";
	   
	   // VALIDAMOS.
	   if (apellido1.equalsIgnoreCase(apellido2)) {
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }	
***********************************************************************************************************************************
***********************************************************************************************************************************
* lenght() : METODO QUE DEVUELVE LA LONGITUD ES DECIR LA CANTIDAD DE NUMERO QUE TIENE UNA CADENA, EJEMPLO :
	  
* 	String apellido1 = "Herrera";
* 	System.out.print(apellido1.lenght());  // devuelve 6
	  
	  
* NOTA : EL METODO "lenght" TAMBIEN SE UTILIZAR PARA DEVOLVER LA LONGITUD DE AMATRIZ Y ARRAYS
***********************************************************************************************************************************
***********************************************************************************************************************************
* toLowerCase() :	METODO QUE PERMITE CONVERTIR UNA CADENA DE TEXTO A MINUSCULAS. EJEMPLO:

	  public class EjemploTolowerCase { 
        // METODO.
		public static void main(String args[]) {
		 String nombre = "FREDDY HERRERA";      
		 System.out.println(nombre.toLowerCase());           -      
		   }
		}
***********************************************************************************************************************************
***********************************************************************************************************************************
* toUpperCase() : METODO QUE CONVIERTE UNA CADENA DE TEXTO A MAYUSCULAS, EJEMPLO :
	  
	    public class EjemplotoUpperCase { 
           // METODO.
		   public static void main(String args[]) {
		   
		      String nombre = "freddy herrera";      
		      
		      System.out.println(nombre.toUpperCase()); // IMPRIME "FREDDY HERFRERA" TODO EN MAYUSCULAS.    
		   }
		}
***********************************************************************************************************************************
***********************************************************************************************************************************
* trim() : METODO QUE ELIMINA LOS ESPACIOS DE LOS LADOS DE UNA CADENA DE TEXTO, EJEMPLO :
	  
 	public class EjemploTrim { 
     // METODO.
	 public static void main(String args[]) {
	   String nombre = "freddy herrera        ";
		           
		 System.out.println(nombre.trim());                 
	   }
	}
***********************************************************************************************************************************
***********************************************************************************************************************************
* substring() : SE UTILIZA PARA OBTENER LA SUBCADENA DE UNA CADENA DADA, EN FUNCION DE LOS PARAMETROS ESPECIFICADOS ESTE METODO 
* SE LE PASAN DOS PARAMETROS EL PRIMERO ES DE DESDE DONDE COMENZARA A CONTAR LA CADENA, Y EL SEUNDO  PARAMETRO ES EL FINAL DONDE 
* TERMINA LA CADENA EJEMPLO :
	  
	 public class EjemploSubstring{
	     // METODO.
         public static void main(String args[]){
 
		   String s="Sachin Tendulkar";
		   
		   System.out.println(s.substring(6));   // Imprime "Tendulkar"
		   System.out.println(s.substring(0,6)); // Imprime "Sachin"
		  }
	}
***********************************************************************************************************************************
***********************************************************************************************************************************
* concat() : ESTE METODO PERMITE COMBINAR UNA CADENA ESPECIFICADA AL FINAL DE ESTA CADENA, DEVUELVE UNA CADENA, ES COMO AGREGAR 
* OTRA CADENA, EJEMPLO :
	  
	 public class ConcatEjemplo{
	  // METODO.
   	  public static void main(String args[]){
		 String s1= "cadena java";
		 s1.concat("is immutable");
		 System.out.println(s1);
		 s1=s1.concat("es inmutable, así que asígnelo explícitamente");
		 System.out.println(s1);
		   }
		}
		
* NOTA : EL SIMBOLO DE + TAMBIEN SE UTILIZA PARA CONCATENAR EXPRESIONES U VALORES.
***********************************************************************************************************************************
***********************************************************************************************************************************
* endsWith() : ESTE METODO COMPRUEBA SI LA CEDENA TERMNA CON EL SUFIJO DADO. DEVUELVE VERDADERO SI ESTA CADENA TERMINA CON EL 
* SIFIJO DADO, DE LO CONTRARIO DEVUELVE FALSO, EJEMPLO :
	  
	 public class EndsWithEjemplo {   
	 
	  // METODO.
	  public static void  main (String args []) { 
		      
		   String s1 = "java por javatpoint";  
		   System.out.println (s1.endsWith( "t"));  
		   System.out.println (s1.endsWith ("punto"));  
		   }
		}
***********************************************************************************************************************************
***********************************************************************************************************************************
* valueOf() : ESTE METODO CONVIERTE DIFERENTES TIPOS DE VALORES EN CADENA, CON LA AYUDA DEL METODO String valueOf() PUEDE 
* CONVERTIR int a String, LARGO long a String, boolean a String, char a String, float a String, double a String, object a 
* String, char a arrays a string, EJEMPLO :
	  
	 public class  ValueOfEjemplo{  
	 
	  // METODO. 
	  public static void  main (String args []) {    
	    int valor = 30;  
		    
		String s1 = String.valueOf(valor);  
		System.out.println (s1 +10 );  
	   }
	}  
***********************************************************************************************************************************
***********************************************************************************************************************************
* split() : ESTE METODO DIVIDE UNA CADENA DADA Y DEVUELVE UN ARRAYS, ES DECIR TRANSFORMA UNA CADENA EN UN ARRAYS, EJEPMLO : 
	  
	public class  SplitEjemplo { 
	    
      // METODO PRINCIPAL DE LA CLASE.
	  public static void  main (String args []) { 
		     
		 String s1 = "método de división de cadenas de Java por javatpoint";
		  
		 Cadena[] palabras = s1.split("\\ s");  // DIVIDE LA CADENA SEGUN EL ESPACIO EN BLANCO.
		   
		 // FOR-EACH PARA IMPRIMIR EL ARRAYS.    
		 for(String w : palabras) {  
		   System.out.println(w);  
		     }  
		   }
		}  
***********************************************************************************************************************************
*********************************************************************************************************************************** 
* isEmpty() : ESTE METODO COMPRUEBA SI LA CADENA ESTA VACIA O NO. DEVUELVE VERDADERO SI LA LONGITUD DE LA CADENA ES CERO, DE LO  
* CONTRARIO ES FALSO, EN OTRAS PALABRAS, SE DEVUELVE VERDADERO SI LA CADENA ESTA VACIA; DE LO CONTRARIO DEVUELVE FALSO, EJEMPLO :
	  
	  public class  IsEmptyEjemplo {  
	  
		public static void  main (String args []) {    
		 String s1 = "";  
		 String s2 = "javatpoint";  
		  
		 System.out.println (s1.isEmpty ());  // true
		 System.out.println (s2.isEmpty ());  // false
		     }
		} 
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERCICIOS DE CADENAS DE CARACTERES :
	 
<<<<<<< HEAD
* 1 - CONFECCIONA UNA CLASE QUE SOLICTE EL INGRESO DE DOS VARIABLES DE TIPO "STRING" Y LUEGO EMPLEE LOS METODOS MAS COMUNES DE LA
*     CLASE STRING.
	  
  2 - REALIZAR UN PROGRAMA QUE PERMITA CREAR UNA DIRECCION DE EMAIL
  

=======
* 1 - SOLICITAR EL INGRESO DEL NOMBRE Y EDAD DE DOS PERSONAS. MOSTRAR EL NOMBRE DE LA PERSONA CON MAYOR EDAD.
	  
* 2 - SOLICITAR EL INGRESO DEL APELLIDO, NOMBRE Y EDAD DE DOS PERSONAS. MSTRAR EL NOMBRFE DE LA PERSONA CON MAYOR 
*     EDAD. REALIZAR LA CARGA DEL APELLIDO Y NOMBRE EN UNA VARIABLE DE TIPO String.
	      
* 3 - SOLICITAR EL INGRESO DE DOS APELLIDOS. MOSTRAR UN MENSAJE SI SON IGUALES O DISTINTOS.
	
>>>>>>> f267f9486b11f36775d0889a5f8690d0579c628a
***********************************************************************************************************************************
***********************************************************************************************************************************
*/

}
