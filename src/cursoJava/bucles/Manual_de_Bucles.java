package cursoJava.bucles;

public class Manual_de_Bucles {
/**
***********************************************************************************************************************************
***********************************************************************************************************************************
* BUCLES EN JAVA : 
	  
* LOS BUCLES PUEDEN EJECUTAR UN BLOQUE DE CODIGO SIEMPRE QUE SE ALCANCE UNA CONDICION ESPECIFICA, LOS BUCLES SON 
* UTILES POERQUE AHORRAN TIEMPO, REDUCEN ERRORES Y HACEN QUE EL CODIGO SEA MAS LEGIBLE. UN BUCLE O ESTRUCTURA REPETITIVA 
* PERMITE EJECUTAR UNA INSTRUCCION O UN CONJUNTO DE INSTRUCCIONES VARIAS VECES UN BUCLE REPETITIVO SE CARATERIZA POR :

* - LA O LAS SENTENCIAS QUE SE REPITEN.
* - EL TEST O PRUEBA DE CONDICION ANTES DE CADA REPETICION, QUE MOTIVARA QUE SE REPITAN O NO LA SENTENCIAS.
***********************************************************************************************************************************
***********************************************************************************************************************************
* BUCLE WHILE : EL BUCLE "while" SE UTILIZA PARA RECORRER UN BLOQUE DE CODIGO SIEMPRE QUE UNA CONDICION SEA VERDADERA (true), 
* SE ESCRIBE CON LA PALABRA RESERVADA (while), SE DEBE DECLARAR E INICIALIZAR UNA VARIABLE EJEMPLO :
	 
	  int i = 0;
		while(i < 5) {			     ejemplo
		  System.out.println(i);
		  i++;
		}
		 
		// "En el siguiente ejemplo, el código en el bucle se ejecutará, una y otra vez, 	                                 
	      siempre que la variable (i) sea menor que 5:"  
	   
* NOTA : NO OLVIDE INCREMENTAR LA VARIABLE CON EL OPERADOR ++ LA VARIABLE UTILIZADA EN LA CONDICION DEBE SER INCREMENTADA, O 
* DE LO CONTRARIO EL CICLO NUNCA TERMINARA.
***********************************************************************************************************************************
***********************************************************************************************************************************
* BUCLE DO/WHILE : EL BUCLE do/while ES UNA VARIANTE DEL BUCLE "while", ESTE BUCLE EJECUTARA EL BLOQUE DE CODIGO 
* UNA VEZ ANTES DE VERIFICAR SI LA CONDICION ES VERDADERA, LUEGO REPETIRA EL BUCLE SIEMPRE QUE LA CONDICION SEA 
* VERDADERA (true), EJEMPLO :
	  
	 int i = 0;
	 
	   // VALIDAMOS.
	   do {
		  System.out.println(i);
		  i++;
		}
		
	   while (i < 5);
***********************************************************************************************************************************
***********************************************************************************************************************************
* BUCLE FOR : CUANDO SEPA EXACTAMENTE CUANTAS VECES DESEA RECORRER UN BLOQUE DE CODIGO, USE EL BUCLE for, EN LUGAR DEL BUCLE 
* "while", ESTE BUCLE CONSTA DE TRES PARAMETROS LOS CUALES SON : 
	  
* - SE ESTABLECE UNA VARIABLE ANTES QUE COMIENCE EL BUCLE. EJEMPLO : int nun = 1;
* - DEFINE LA CONDICION PARA QUE SE EJECUTE EL BUCLE, SI LA CONDICON ES VERDADERA (true) EL CICLO COMENZARA 
*   NUEVAMENTE, SI ES FALSE, EL CICLO FINALIZARA, EJEMPLO . i<5
* - INCREMENTA UN VALOR CADA VEZ QUE SE EJECUTE EL BLOQUE DE CODIGO EN EL BUCLE EJEMPLO : i++
	 
*  EL SIGUIENTE EJEMPLO IMPRIMIRA LOS NUMEROS DEL 0 AL 4:
	   
	   for (int i = 0; i < 5; i++) {
		  System.out.println(i);
		}
	 
*  NOTA : LOS BUCLES TAMBIEN SE UTILIZAN PARA IMPRIMIR CADENAS ARRAYS.
***********************************************************************************************************************************
***********************************************************************************************************************************
* BUECLE FORECH : ESTRUCTURA QUE NOS PERMITE RECOORER UNA COLECCION DE OBJETOS, O ARRAYS DE ELEMENTOS DE UNA FORMA
* SENCILLA, EVITANDO EL USO DE ITERADORES(int i=0) DE UN BUCLE for NORMAL, EJEMPLO:
	 
* String array[]= {"Avila", "Burgos", "León", "Palencia", "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora"};

    // VALIDAMOS.
	for (String elemento : array)
	  // IMPRIMIMOS.
	  System.out.println(elemento);
	  
      SE CREA UN OBJETO elemento PARA RECORRER EL ARRAYS.
	  
* NOTA : SE RECOMIENDA SEGUIR INVESTIGANDO PAR MAYOR CONOCIMIENTO DE ESTE BUCLE.
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERECICIOS BUCLE WHILE : 
	
* 1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100.
	  
* 2 - ESCRIBIR UN PROGRAMA QUE SOLICITE LA CARGA DE UN VALOR POSITIVO Y NOS MUESTRE DESDE 1 HASTA EL VALOR 
*     INGRESADO DE UNO EN UNO, EJEMPLO SI INGRESAMOS 30 SE DEBE MOSTRAR EN PANTALLA LOS NUMEROS 1 AL 30.
	      
* 3 - DESARROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE 10 VALORES POR TECLADO Y NOS MUESTRE POSTERIORMENTE LA SUMA 
*     DE LOS VALORES INGRESADOS Y SU PROMEDIO.
	  
* 4 - ESCRIBIR UN PROGRAMA QUE SOLICITE INGRESAR 10 NOTAS DE ALUNNOS Y NOS INFORME CUANTOS TIENEN NOTAS MAYORES O 
*     IGUALES A 7 Y CUANTOS MENORES.
	      
* 5 - SE INGRESAN UN CONJUNTO DE N ALTURAS DE PERSONAS POR TECLADO. MOSTRAR LA ALTURA PROMEDIO DE LAS PERSONAS.
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERCICIOS BUCLE DO WHILE :
	  
* 1 - ESCRIBIR UN PROGRAMA QUE SOLICTE LA CARGA DE UN NUMERO ENTRE 0 Y 999, Y NOS MUESTRE UN MENSAJE DE CUANTOS
*     DIGITOS TIENE EL MISMO. FINALIZAR EL PROGRAMA CUANDO SE CARGUE EL VALOR 0.
	      
* 2 - ESCRIBIR UN PROGRAMA QUE SOLICTE LA CARGA DE NUMEROS POR TECLADO, OBTENER SU PROMEDIO. FINALIZAR LA CARGA DE
*     VALORES CUANDO SE CARGUE EL VALOR CERO(O).
	      
* 3 - REALIZAR UN PROGRAMA QUE PERMITA INGRESAR EL PESO (EN KG) DE PIEZAS, EL PROCESO TERMINA CUANDO INGRESEMOS EL
*     VALOR CERO, DEBE INFORMAR, CUANTAS PIEZAS TIENEN PESOS ENTRE 9.8 KG Y 10.2KG, CUANTAS CON MAS DE 10.2KG Y
*     CUANTAS CON MENOS DE 9,8KG, LA CANTIDAD TOTAL DE PIEZAS PROCESADAS.
	     
* 4 - REALIZAR UN PROGRAMA QUE ACOMULE(SUME) VALORES INGRESAODS POR TECLADO HASTA INGRESAR EL 999 (NO SUMAR DICHO
*     VALOR INDICAR QUE HA FINALIZADO LA CARGA). IMPRIMIR EL VALOR ACOMULADO E INFORMAR SI DICHO VALOR ES CERO,
*     MAYOR A CERO O MENOR A CERO.
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERCICIOS BUCLE FOR : 
	 
* 1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100
	 
* 2 - DESAROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE 10 VALORES POR TECLADO Y NOS MUESTRE POSTERIORMENTE LA SUMA
*     DE LOS VALORES INGRESADOS Y SU PROMEDIO.
	      
* 3 - ESCRIBIR UN PROGRAMA QUE LEA 10 NOTAS DE ALUNNOS Y NOS INFORME CUANTOS TIENEN NOTAS MAYORES O IGUALES A 7
*     Y CUANTOS MENORES.
	      
* 4 - ESCRIBIR UN PROGRAMA QUE LEA 10 NUMEROS ENTEROS Y LUEGO MUESTRE CUANTOS VALORES INGRESADOS FUERON MULTIPLOS
*     DE 3 Y CUANTOS DE 5. DEBEMOS TENER EN CUENTA QUE HAY NUMEROS QUE SON MULTIPLOS DE 3 Y DE 5 A LA VEZ.
	      
* 5 - DESARROLLAR UN PROGRAMA QUE SOLICITE LA CARGA DE 10 NUMEROS E IMPRIMA LA SUMA DE LOS ULTIMOS 5 VALORES
*     INGRESADOS.
***********************************************************************************************************************************
***********************************************************************************************************************************
* EJERCICIOS BUCLE FOR EACH :
	  
* 1 - ESCRIBIR UN PROGRAMA QUE PERMITA MOSTRA UNA LISTA DE PAISES LATINO AMERICANOS, DEBE IMPLEMENTAR BUCLE 
*     FOR-EACH
***********************************************************************************************************************************
***********************************************************************************************************************************
*/

}
