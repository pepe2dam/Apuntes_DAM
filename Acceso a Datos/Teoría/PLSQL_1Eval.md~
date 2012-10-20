
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

IDENTIFICADORES:
----------------

Se utilizan para nombrar los objetos que intervienen en un programa: variables, 
constantes, cursores, excepciones, procedimientos, funciones, etc. En PL/SQL deben
cumplir las siguientes características:

+ Pueden tener entre 1 y 30 caracteres de longitud.
+ El primer carácter debe ser una letra.
+ Los restantes caracteres deben ser alfanuméricos o signos admitidos (letras,
  dígitos, '$', '#' y '_').

DECLARACIÓN Y UTILIZACIÓN DE VARIABLES:
---------------------------------------
