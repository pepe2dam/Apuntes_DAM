
PL/SQL (Procedural Language/Structured Query Language)
======================================================

Es un lenguaje duseñado para trabajar con bases de datos y manejar grandes volúmenes
de información. Oracle tiene muchos paquetes predefinidos pero uno muy importante es
DBMS_OUTPUT, que tiene fines de depuración. Vamos a incluir el procedimiento PUT_LINE 
que permite visualizar textos en la pantalla.

	DBMS_OUTPUT.PUT_LINE(['expresión'||variable]);

Para que esto funcione debemos tener la variable de entorno SERVEROUTPUT ON.
En caso contrario, los programas nos darán error pero no se visualizará nada.
Para cambiar esto introduciremos al comienzo de la sesión:

	SET SERVEROUTPUT ON;

Desde el entorno de SQLPLUS podremos trabajar con:

+ Bloques anónimos.
+ Subprogramas (programas y funciones).
+ Paquetes.

###IDENTIFICADORES:

Se utilizan para nombrar los objetos que intervienen en un programa: variables, 
constantes, cursores, excepciones, procedimientos, funciones, etc. En PL/SQL deben
cumplir las siguientes características:

+ Pueden tener entre 1 y 30 caracteres de longitud.
+ El primer carácter debe ser una letra.
+ Los restantes caracteres deben ser alfanuméricos o signos admitidos (letras,
  dígitos, '$', '#' y '_').

###DECLARACIÓN Y UTILIZACIÓN DE VARIABLES:

Todas las variables PL/SQL deben declararse en la sección declarativa antes de su uso.
El formato génerico para declarar una variable es el siguiente:

	nombre_variable TIPO [NOT NULL] [{:=|DEFAULT} valor];

+ DEFAULT | := : Sritven para asignar valores por defecto a la variable desde el 
  momento de su creación.

+ NOT NULL: Fuerza a la variable a tener siempre un valor. 

Ejemplo:

	DECLARE 
		Importe NUMBER(8,2);
		Contador NUMBER(2,0):=0;
		Nombre NUMBER(20) NOT NULL DEFAULT 'miguel';

###USO DE LOS ATRIBUTOS '%TYPE' Y '%ROWTYPE':

En lugar de indicar explícitamente el tipo y la longitud de una variable existe la 
posibilidad de utilizar los atributos %TYPE y %ROWTYPE para declarar variables que 
sean del mismo tipo que otros objetos ya definidos.

+ %TYPE: Declara una variable del mismo tipo que otra o que una columna de una 
tabla. Su formato es: nombre_variable nombre_objeto%TYPE;
Ejemplo:
