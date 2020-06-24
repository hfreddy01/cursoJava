package cursoJava.variables;

public class ManualVariables {
	
	/**
	 * ****************************************************************************************************************************
	 * VARIABLES :
	 * 
	 * UNA VARIABLE ES UN ESPACIO EN LA MEMORIA DEL ORDENADOR QUE ALMACENA UN VALOR, UNA VARIABLE EN JAVA PUEDE CAMBIAR DE VALOR 
	 * MEDIANTE LA EJECUCION DE UN PROGRAMA, CABE DESTACAR QUE LAS VARIABLES EN JAVA SE DEBEN INICIALIZAR ANTES DE SER UTILIZADAS,
	 * O DE LO CONTARIO PROVOCARIA UN ERROR EN EL PROGRAMA, UNA VARIABLE EN JAVA DEBE TERMINAR EN PUNTO Y COMA,  UNA VARIABLE EN 
	 * JAVA TIENES TRES CARACTERISTICAS, "EL TIPO DE DATOS", "EL NOMBRE DE LA VARIABLE", "Y EL VALOR".
	 * EJEMPLO : int edad = 35;EJEMPLO :
	 * 
	 * int edad = 34;
	 * 
	 *  // int ES EL TIPO DE DATO.
	    // edad ES EL NOMBRE DE LA VARIABLE.
	    // 34 ES EL VALOR DE LA VARIBALE.
	 * 
	 * LAS VARIABLES EN JAVA NO DEBEN COMENZAR CON NUMEROS NI CARACTERES EXTRA�OS, EXISTEN DIFERENCIAS ENTRES VARIABLES ESCRITA
	 * CON MAYUSCULAS, Y VARIABLES ESCRITA EN MINUSCULA. ES RECOMENDABLE ESCRIBIR LOS NOMBRES DE LA VARIABLES CON LA PRIMERA 
	 * PALABRA EN MINUSCULA.
	 *  
	 * NO ES LO MISMO int EDAD = 35; QUE  int edad = 35;
	 * 
	 * JAVA ES UN LENGUAJE INTELICENSE, ES DECIR SE PUEDE ESCRIBIR PALABRAS EN MAYUSCULAS INTERCALADAS CON MINUSCULAS EJEMPLO :
	 * 
	 * String nombreApellido = "Freddy Herrera";
	 * int edadSugeto = 35;
	 * 
	 * NOTA : PARA CONTINAR DEBES CONOCER LOS TIPOS DE DATOS EN JAVA, DEBES DIRIGIRTE A LA SECCION "tipoDatos" Y CONSULTAR EL
	 * MANUAL DENTRO DE ESTE PROYECTO.
	 ****************************************************************************************************************************
	 * AMBITO DE UNA VARIABLE : LAS VARIABLES TIENEN DIFERENTES AMBITOS, PUEDEN SER AMBITOS LOCALES O AMBITOS GLOBALES, ES DECIR
	 * LAS VARIABLES QUE SE DECLARAN EN LA CLASE SON VARIABLES GLOBALES A LO QUE SE LLAMA VARIABLES DE INSTANCIA, Y LAS VARIABLES
	 * QUE SE DECLARAN DENTRO DE LOS METODOS O FUNCIONES SON VARIABLES LOCALES EJEMPLO :
	 * 
	 *  public class Ejemplo {
	 *    int edad = 34;  // VARIABLE GLOBAL DENTRO DE LA CLASE DE JAVA.
	 *    
	 *  public static void main(String [] args){
	 *  	int edad = 34;  // VARIABLE LOCAL DENTRO DEL METODO PRINCIPAL DE JAVA.
	 *     }
	 *  
	 *   }
	 *   
	 * NOTA : CUANDO UNA VARIABLE SE DECLARA DENTRO DE LA CLASE YA PASA HACER UNA VARIABLE DE CLASE, O LO QUE SE CONOCE COMO
	 * UNA PROPIEDAD DE UNA CLASE, YA QUE JAVA ES UN LENGUAJE DE PROGRAMACION ORIENTADO A OBJETO, TODO SE TRATA COMO CLASES, 
	 * METODOS, PROPIEDADES, OBJETOS, ETC.  
	 *****************************************************************************************************************************
	 * TIPOS DE VARIABLES  : 
	 * 
	 * HAY TRES TIPOS DE VARIABLES EN JAVA
	 *  - VARIABLES LOCALES.
	 *  - VARIABLES DE INSTACIA.
	 *  - VARIABLES STATICIAS.
	 * ****************************************************************************************************************************
	 *  VARIABLES LOCALES : UNA VARIABLE DEFINIDA DENTRO DE UN BLOQUE, FUNCION, METODO O CONSTRUCTOR SE LLAMA VARIABLE LOCAL.
	 *  ESTAS VARIABLES SE CREAN CUANDO EL BLOQUE INGRESADO O METODO SE LLAMA Y DESTRUYE DESPUES DE SALIR DEL BLOQUE O CUANDO LA
	 *  LLAMADA INGRESA DEL METODO, EL ALCANCE DE ESTAS VARIABLES SOLO EXISTE DENTRO DEL BLOQUE EN EL QUE SE DECLARA LA VARIABLE
	 *  ES DECIR PODEMOS ACCEDER A ESTAS VARIABLES SOLO DENTRO DE ESE BLOQUE O METODO EJEMPLO :
	 *  
	 *  public class Ejemplo {
	 *  
	 *  public static void main(String [] args){
	 *  	int edad = 34;  // VARIABLE LOCAL DENTRO DEL METODO PRINCIPAL DE JAVA.
	 *     }
	 *  
	 *   }
	 * ****************************************************************************************************************************  
	 *  VARIABLE DE INSTANCIA : LAS VARIABLES DE INSTANCIA SON VARIABLES NO STATICAS Y SE DECLARAN EN UNA CLASE, ESTAS VARIABLES
	 *  SE DECLARAN FUERA DE CUALQUIER METODO, BLOQUE, CONSTRUCTOR  O FUNCION, COMO LAS VARIABLES DE INSTANCIA SE DECLARAN EN UNA
	 *  CLASE, ESTAS VARIABLES SE CREAN CUANDO UN OBJETO DE LA CLASE SE CREA Y SE DESTRUTE CUANDO SE DESTRUYE EL OBJETO A
	 *  DIFERENCIA DE LAS VARIABLES LOCALES, PODEMOS USAR ESPECIFICADORES DE ACCESO PARA VAROABLES DE INSTACIA, EJEMPLO :
	 *  
	 *  public class Ejemplo {
	 *  // VARIABLES DE INSTANCIA O PROPIEDADES DE LA CLASE.
	 *  edad = 34;
	 *  
	 *  public static void main(String [] args){
	 *  	
	 *     }
	 *  
	 *  }
	 *  
	 *  NOTA : SI NO ESPECIFICAMOS NINGUN ESPECIFICADOR DE ACCESO, SE UTILIZARA EL ESPECIFICADOR PREDETERMINADO.
	 * **************************************************************************************************************************** 
	 *  VARIABLES ESTATICAS : LAS VARIABLES ESTATICAS TAMBIEN SE CONOCEN COMO VARIABLES DE CLAE, O PROPIEDAD DE UNA CLASE
	 *  ESTAS VARIABLES SE DECLARAN DE FORMA SIMILAR A LAS VARIABLES DE INSTANCIA LA DIFERENCIA ES QUE LAS VARIABLES ESTATICAS
	 *  SE DECLARAN UTILIZANDO LA PALABRA RESERVADA "static" DENTRO DE UNA CLASE FUERA DE CUALQUIER CONSTRUCTOR O BLOQUE DE 
	 *  METODOS, A DIFERENCIA DE LAS VARIABLES DE INSTANCIA, SOLO PODEMOS TENER UNA COPIA DE UNA VARIABLE ESTATICA POR CLASE,
	 *  INDEPENDIENTEMENTE DE CUANTOS OBJETOS CREEMEOS, LAS VARIABLES ESTATICAS SE CREAN AL INICIO DE LA EJECUCION DEL PROGRAMA
	 *  Y SE DESTRUYEN AUTOMATICAMENTE CUANDO FINALIZA LA EJECUCION.
	 *  
	 *  NOTA : PARA ACCEDER A VARIABLES ESTATICAS NO NECESITAMOS CREAR NINGUN OBJETO DE ESA CLASE, SIMPLEMENTE PODEMOS ACCEDER
	 *  COLOCANDO EL NOMBRE DE LA CLASE, SEGUIDO DEL NOMBRE O METODO STATICO EJEMPLO :
	 *  
	 *    public class Ejemplo {
	 *    // VARIABLES STATICA.
	 *    static String name = "Freddy";
	 *  
	 *     public static void main(String [] args){
	 *      	System.out.println(Ejemplo.name); // ESTO IMPRIME POR CONSOLA "Freddy"
	 *  	
	 *      }
	 *  
	 *   }
	 *****************************************************************************************************************************
	 * EJERCICIOS VARIABLES :
	 * 
	 * 1 - REALIZAR UN PROGRAMA QUE MUESTRE POR CONSOLA UN MENSAJE DE "HOLA MUNDO DESDE JAVA..."
	 * 
	 * 2 - REALIZAR UN PROGRAMA QUE PERMITA CREAR DOS VARIABLES QUE PERMITA IMPRIR POR CONSOLA SU NOMBRE Y SU EDAD. 
	 * 
	 * 3 - REALIZAR UN PROGRAMA QUE PERMITA CREAR 2 VARIABLE DE TIPO "STATIC" CON SU NOMBRE Y EDAD, DEBE IMPRIMIR POR 
	 *     CONSOLA EL RESULTADO.
	 *     
	 * 4 - REALIZAR UN PROGRAMA QUE PERMITA CREAR DOS VARIABLES LOCALES CON SU NOMBRE Y SU EDAD, IMPRIMIR POR PANTALLA EL RESULTADO.
	 * 
	 * 5 - REALIZAR UN PROGRAMA QUE PERMITA CREAR DOS VARIABLES DE INSTANCIA CON SU NOMBRE Y SU EDAD, IMPRIMIR POR PANTALLA
	 *     EL RESULTADO. 
	 ******************************************************************************************************************************
	 */

}
