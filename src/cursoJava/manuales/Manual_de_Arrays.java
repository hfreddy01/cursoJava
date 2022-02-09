package cursoJava.arrays;

public class Manual_de_Arrays {
/**
 *********************************************************************************************************************************************
Arrays Java :
Un arrys en java es una estructura de dtaos que nos permite almacenar una lista de datos de un mismo tipo. La longitud de un arrys se pude
declarar en un momento
Ejemplo:
 	 Sintaxis:
	 tipo_dato nombre_array[];
     nombre_array = new tipo_dato[tamano];

      // declaramos arrays
     String nombrePasises[];
     nombrePasises = new String[6];
Nota : En java existen varias maneras de de inicializar arrays o asignarles valores a los objetos
	 
     nombrePasises[] = {"Argentina", "Brazil", "Colombia", "Chile", "Ecuador", "Peru"};
     // OTRA MANERA DE ASIGNARLES VALORES A UN ARRAYS
	 nombrePasises = ["Argentina"];
	 nombrePasises = ["Brazil"];
	 nombrePasises = ["Colombia"];
	 nombrePasises = ["Chile"];
	 nombrePasises = ["Ecuador"];
	 nombrePasises = ["Peru"];

		
* LOS ARRAYS EN JAVA SE NUMERAN DESDE EL ELEMENTO CERO, QUE SERIA EL PRIMER ELEMENTO, HASTA EL TAMA�O -1 QUE SERIA
* EL ULTIMO ELEMENTO. ES DECIR SI TENEMOS UN ARRAYS DE DIEZ ELEMENTOS, EL PRIMER ELEMENTO SERIA EL CERO Y EL ULTIMO
* ELEMENTO SERIA EL NUEVE. PARA ACCEDER A UN ELEMENTO ESPECIFICO UTILIZAREMOS LOS CORCHETES DE LA SIGUIENTE FORMA. ENTENDEMOS POR 
* ACCESO, TANTO EL INTENTAR LEER EL ELEMENTO, COMO ASIGNARLE UN VALOR.
	  
	   arrayCaracteres[numero_elemento];
	    
* POR EJEMPLO, PARA ACCEDER AL TERCER ELEMENTO LO HARIAMOS DE LA SIGUIENTE FORMA: 
	  
       numeroPasises = [2];
       System.out.println(numeroPasises[2]); / accedemos a la posicion 3 del arrays.
                  
* HAY QUE TENER EN CUENTA QUE PARA MOSTRAR EL CONTENIDO DE UN ARRAYS TENDREMOS QUE UTILIZAR BUCLES. EN ESTE EJEMPLO
* SE SABE QUE EL ARRAYS CONTIENE 6 ELEMENTOS DECLARADOS ARRIBA EN EL EJEMPLO ANTERIOR, PARA MOSTRAR TODO EL
* CONTENIDO DEL ARRAYS LO HACEMOS DE LA SIGUIENTE MANERA
	 
	   nombrePasises[] = {"Argentina", "Brazil", "Colombia", "Chile", "Ecuador", "Peru"};
	  
	  		for(int i =0; i<6; i++){
	  		  System,.out.println(numeroPasises[i]); // IMPRIME 6
	      }
	       
* NOTA : PARA SABER EL TAMA�O DEL ARRAYS DEBEMOS UTILIZAR EL METODO "length" EL CUAL PERMITE MEDIR LA LONGITUD
* DE UN ARRAYS ESTE METODO SE UTILIZA DE LA SIGUIENTE MANERA.
	  
		for(int i = 0; i<6.length; i++){
	 		System,.out.println(numeroPasises[i]);  // imprime 6
	    }
 *********************************************************************************************************************************************
* ARRAYS - MATRIZ : PODEMOS DECLARAR ARRAYS EN JAVA DE VARIOS SUB-INDICES, PUDIENDO TENER ARRAYS DE DOS NIVELES,
* QUE SERIAN SIMILARES A LAS MATRICES, ARRAYS DE TRES NIVELES QUE SERIAN COMO CUBOS Y ASI SUCESIVAMENTE, SI BIEN A
* PARTIR DEL TERCER NIVEL SE PIERDE LA PERSPECTIAVA GEOMETRICA. PARA DECLARAR E INICIALIZAR UN ARRAYS DE VARIOS
* SUB-INDICES LO HAREMOS DE LA SIGUIENTE MANERA.
	   
* 		PARA DEFINIR UNA MATRIZ DEBEMOS ANTECEDER LOS CORCHETES ABIERTOS Y CERRADOS DOS VECES:
	  
		int[][] matriz;
	  
* PARA CREAR LA MATRIZ, ES DECIR HACER LA RESERVA DE ESPACIO DE TODAS SUS COMPONENTES DEBEMOS UTILIZAR EL OPERADOR
* new Y MEDIANTE DOS SUB-INDICES INDICAMOS LA CANTIDAD DE FILAS Y COLUNNAS QUE TENDRA LA MATRIZ:
	 
	 	matriz = new int[3][5];

 *********************************************************************************************************************************************
* EJERCICIOS ARRAYS JAVA :
	  
* 1 - SE DESEA GUARDAR LOS SUELDOS DE 5 OPERARIOS. SEGUN LO CONOCIDO DEBERIAMOS DEFINIR 5 VARIABLES SI QUEREMOS 
*     TENER EN UN CIERTO MOMENTO LOS 5 SUELDOS ALMACENADOS EN MEMORIA. EMPLEANDO UN ARRAYS SOLO SE REQUIERE DEFINIR 
*     UN UNICO NOMBRE Y ACCEDEMS A CADA ELEMENTO POR MEDIO DEL SUB-INDICE.
	  
* 2 - DEFINIR UN ARRAYS DE 5 COMPONENTES DE TIPO float QUE REPRESENTEN LAS ALTURAS DE 5 PERSONAS. OBTENER EL 
*     PROMEDIO DE LAS MISMAS. CONTAR CUANTAS PERSONAS SON MAS ALTAS QUE EL PROMEDIO Y CUANTAS MAS BAJAS.
	      
* 3 - UNA EMPRESA TIENE DOS TURNOS (MA�ANA Y TARDE) EN LOS QUE TRABAJAN 8 EMPLEADOS (4 POR LA MA�ANA Y 4 POR LA
*     TARDE) CONFECCIONAR UN PROGRAMA QUE PERMITA ALMACENAR LOS SUELDOS DE LOS EMPLEADOS AGRUPADOS POR TURNO.
*     IMPRIMIR LOS GASTOS EN SUELDOS DE CADA TURNO.
	      
* 4 - DESARROLLAR UN PROGRAMA QUE PERMITA INGRESAR UN ARRAYS DE 8 ELEMENTOS E INFORMAR EL VALOR ACOMULADO DE TODOS
*     LOS ELEMENTOS DEL ARRAYAS. EL VALOR ACOMULADO DE LOS ELEMENTOS DEL ARRAYS QUE SEAN MAYORES A 36. CANTIDAD DE
*     VALORES MAYORES A 50
	     
* 5 - REAILZAR UN PROGRAMA QUE PIDA LA CARGA DE DOS ARRAYS NUMERICOS DE TIPO ENTEROS. OBTENER LA SUMA DE LOS DOS
<<<<<<< HEAD
*     ARRAYS. DICHO RESULTADO GUARDARLO EN UN TERCER ARRAYS DEL MISMO TAMA�O. SUMAR COMPONENTE A COMPONENTE.
=======
*     ARRAYS. DICHO RESULTADO GUARDARLO EN UN TERCER ARRAYS DEL MISMO TAMA�O. SUMAR COMPONENTE A COMPONENTE.    
	  
* 6 - SE TIENEN LAS NOTAS DEL PRIMER PARCIAL DE LOS ALUNNOS DE LOS CURSOS, EL CURSOA A Y EL CURSO B, CADA CURSO
*     CUENTA CON 5 ALUNNOS. REALIZAR UN PROGRMAMA QUE MUESTRE EL CURSO QUE OBTUVO EL MAYOR PROMEDIO GENERAL.
	      
* 7 - CARGAR UN ARRAYS DE 10 EKEMENTOS Y VERIFICAR POSTERIORMENTE SI EL MISMO ESTA ORDENADO DE MENOR A MAYOR.
	 
* 8 - SE DESEA ALMACENAR LOS SUELDOS DE OPERARIOS. CUANDO SE EJECUTA EL PROGRAMA SE DEBE PEDIR LA CANTIDAD DE 
*     SUELDOS A INGRESAR. LUEGO CREAR UN ARRAYS CON DICHO TAMA�O.
	      
* 9 - DESARROLLAR UN PROGRAMA QUE PERMITA INGRESAR UN ARRAYS DE N ELEMENTOS, INGRESAR N POR TECLADO. LUEGO 
*     IMPRIMIR LA SUMA DE TODOS LOS ELEMENTOS.
	      
* 10 - DESARROLLAR UN PROGRAMA QUE PERMITA CARGAR 5 NOMBRES DE PERSONAS Y SUS EDADES RESPECTIVAS. LUEGO DE REALIZAR
*      LA CARGA POR TECLADO DE TODOS LOS DATOS IMPRIMIR LOS NOMBRES DE LAS PERSONAS MAYORES DE EDAD
*      (MAYORES O IGUALES A 18 A�OS)
 *********************************************************************************************************************************************
* EJERCICIOS DE MATRIZ - ARRAYS.
      
* 1 - CREAR UNA MATRIZ DE 3 FILAS POR 5 COLUNNAS CON ELEMENTOS DE TIPO ENTERO, CREAR SUS COMPONENTES Y LUEGO
*     IMPRIMIRMLOS.
          
* 2 - CREAR Y CARGAR UNA MATRIZ DE 4 FILAS POR 4 COLUNNAS. IMPRIMIR LA DIAGONAL PRINCIPAL.
      
* 3 - CREAR Y CARGAR UNA MATRIZ DE 3 FILAS POR 4 COLUNNAS. IMPRIMIR LA PRIMERA FILA. IMPRIMIR LA ULTIMA FILA E
*     IMPRIMIR LA PRIMERA COLUNNA.
          
* 4 - CREAR UNA MATRIZ DE 2 FILAS Y 5 COLUNNAS. REAILIZAR LA CARGA DE COMPONENTES POR COLUNNA, ES DECIR PRIMERO 
*     INGRESAR TODA LA PRIMERA COLUNNA, LUEGO LA SEGUNDA COLUNNA Y ASI SUCESIVAMENTE. IMPRIMIR LUEGO LA MATRIZ.
          
* 5 - CREAR UNA MATRIZ DE N * M FILAS (CARGAR N Y M  POR TECLADO) IMPRIMIR LA MATRIZ COMPLETA Y LA ULTIMA FILA.

* 6 - CREAR UNA MATRIZ DE N + M FILAS (CARGAR N Y M POR TECLADO) IMPRIMIR EL MAYOR ELEMENTO Y LA FILA Y COLUNNA
*     DONDE SE ALMACENA.
          
* 7 - CREAR UNAMMATRIZ DE N + M FILAS (CARGAR N Y M POR TECLADO) INTERCAMBIAR LA PRIMERA FILA CON LA SEGUNDA.
*     IMPRIMIR LUEGO LA MATRIZ.
          
* 8 - CREAR UNA MATRIZ DE N + M FILAS (CARGAR N Y M POR TECLADO) IMPRIMIR LOS CUATROS VALORES QUE SE ENCUANTRAN EN
*     LOS VERTICES DE LA MISMA (matriz[0][0] etc.)

 *********************************************************************************************************************************************
	 */

}