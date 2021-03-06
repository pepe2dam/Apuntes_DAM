
Estructuras repetitivas:
-----------------------

####For ... Next: 

Estructura repetitiva que de antemano se sabe el n�mero de  veces que se va
a realizar. 

#####Sintaxis:

	For variablecontrol = valorinicial To valorfinal [Step salto(valor ++/--]
		
		Instrucciones 
	
	Next variablecontrol

Si no se pone Step es de uno en uno. Ejemplo:


	For a = 1 To 10 [Step 1]
	
		Console.WriteLine("{0}", a);

	Next a

Para salir de un For se pone la condici�n de salida, o se escribe Exit For evitando 
que se ejecute hasta el final. Los For pueden estar anidados.

Ejer6:

Realizar un programa que aparezcan todas las tablas de multiplicar del o al 10:

	Module Module1

    		Sub Main()
       			Dim res As Integer = 0
        		Console.WriteLine("** TABLAS DE MULTIPLICAR **")
       			Console.ReadLine()
        		For i As Integer = 0 To 10
            			Console.WriteLine()
            			Console.WriteLine("Tabla del {0}", i)
            			Console.WriteLine("-------------")
            			Console.WriteLine()
            			For j As Integer = 0 To 10
                			res = i * j
                			Console.WriteLine("{0} * {1} = {2}", i, j, res)
            			Next
        		Next
        	Console.Read()
    		End Sub

	End Module


####While... End While: 

Consiste en repetir una o un grupo de acciones mientras la condici�n sea verdadera. Para 
salir de un While se hace de dos formas, cumpliendo la condici�n del While o poniendo
Exit While.

####Do... Loop (Loop = Bucle): 

Es una estructura repetitiva que tiene cuatro posibles sintaxis:

+ Do While condici�n� Loop: Realiza una o un grupo de acciones mientras la condici�n 
sea cierta, es equivalente al While� End While.

+ Do� Loop While condici�n: Realiza una o un grupo de acciones mientras la condici�n sea 
cierta, con la diferencia de la anterior de que esta realiza la acci�n al menos una vez. 
Se usa cuando se necesite (al menos se ejecute una vez el c�digo).

+ Do Until condici�n� Loop: Realiza una o un bucle de acciones hasta que la condici�n sea 
cierta. 

+ Do� Loop Until condici�n: Realiza una o un grupo de acciones hasta que la condici�n sea 
cierta, se diferencia de la anterior en que al menos las acciones se ejecutan una vez.

+Do� Loop tiene Exit Loop como el While para salir.

Ejer7: 

Realizar una aplicaci�n que me permita introducir n�meros por teclado y visualice cuantos 
n�meros se han introducido, la suma total de ellos, su media aritm�tica y cu�l es el mayor. 
La condici�n desalida ser� pulsar lo que el programador estime necesario.

	Module Module1

    		Sub Main()

        		Dim med As Integer
       			Dim may As Integer = 0
        		Dim sum As Integer = 0
       			Dim cont As Integer = 0
        		Dim cnd As Integer

			Console.WriteLine("Introduzca n�meros por teclado, para hayar     la suma total, media aritm�tica y el mayor de ellos.")

        		Do

				Console.Write("Introduzca un n�mero (Para salir pulse cero [0]): ")
            			cnd = Console.ReadLine()
           			If cnd > may Then
                			may = cnd
           			End If
            			sum = sum + cnd
            			cont = cont + 1

       			Loop Until cnd = 0

        		med = sum / cont

			Console.WriteLine("La suma total es {0}, la media es {1} y el n�mero mayor es {2}", sum, med, may)
       			 Console.Read()

    			End Sub

	End Module


EXCEPCIONES: 
-----------

####Try� Catch� Finally� End Try:

Se utiliza para captura Exceptions (Excepciones) o controlar posibles errores. Sintaxis:

	Try 

		Acciones a controlar
	Catch [Excepci�n]

		Acci�n en caso de error 1

	Catch [Excepci�n]

		Acci�n en caso de error 2
		�

	[Finally] 

		Acci�n que se ejecuta SIEMPRE haya o no error.

	End Try

Ejer8:

Con el ejercicio anterior haz un try�catch para controlar posibles excepciones:

	Module Module1

		Sub Main()
        		Dim med As Integer
        		Dim may As Integer = 0
        		Dim sum As Integer = 0
        		Dim cont As Integer = 0
       	 		Dim cnd As Integer

        		Console.WriteLine()
  			Console.WriteLine("Introduzca n�meros por teclado, para hayar la  suma total, media aritm�tica y el mayor de ellos.")

        		Do
            			Try

					Console.Write("Introduzca un n�mero (Para salir pulse cero [0]): ")
                			cnd = Console.ReadLine()
               				If cnd > may Then
                    				may = cnd
               				End If
               				sum = sum + cnd
                			cont = cont + 1
                			med = sum / cont

            			Catch

					Console.WriteLine("Se ha producido un error o excepci�n.")
               				Main()

           			End Try

        		Loop Until cnd = 0

			Console.WriteLine("La suma total es {0}, la media es {1} y el mayor es {2}", sum, med, may)
        		Console.Read()
        
    		End Sub

	End Module


ESTRUCTURAS DE DATOS:
---------------------

En muchas ocasiones es necesario asignar mas de un valor a una variable, por lo que es necesario 
utilizar alguna Estructura interna que permita guardar esos datos y poder gestionarlos. Existen 
dos estructuras internas:

+ Array: Es una estructura interna que permite guardar datos del mismo tipo en una �nica variable. 
Para hacer referencia a esos datos se utilizan uno o varios �ndices seg�n la dimensi�n. .Net acepta 
hasta 32 dimensiones en un solo Array. Para definir un Array en .Net se utiliza la siguiente sintaxis:

+ Vectores o tablas unidimensionales:

	Dim nomTab (longitud) As tipo

Empieza en 0 y tiene una posici�n mas de lo que se declara en la longitud.

Para introducir valores seria:

	nomTab (posici�n) = valor

Ejemplo:

	Dim Dinero (7) As Integer

Existe la posibilidad de inicializar un Array en el momento de declararlo, siendo as�:

	Dim Tab () As Integer = {listaValores}

Ejemplo:
 
	Dim Notas () As Integer = {5, 4, 8, 7, 6}

La dimensi�n es el n�mero de elementos que tenga la listaValores, si se quieren dar m�s posiciones
 de los que se necesitan se ponen ceros.

Ejer9:

Realizar un programa que permita introducir las calificaciones de cinco participantes en un concurso
de cocina de tal manera que deber� aparecer cual es la puntuaci�n m�s alta y a que numero de 
participante pertenece, la puntuaci�n m�s baja y a que numero de participante pertenece y la 
nota media.

Deber� existir una opci�n de salir preguntando si se desea salir o no. Utilizando try�catch.

+ Matrices o Arrays bidireccionales: Tienen dos �ndices, que se har�a de la siguiente forma:

	Dim Tab (7, 3) As Integer

El primer n�mero son las filas y el segundo n�mero son las columnas.

No se pueden inicializar directamente. 

#####Poliedros o Arrays Tridimensionales.

+ Arrays Paralelos: En muchas ocasiones, tenemos la necesidad de utilizar Arrays con diferentes 
tipos de datos (num�ricos y de cadena), esto es imposible en una matriz, por lo que es aconsejable 
utilizar el concepto de Array Paralelo que consiste en utilizar varios vectores, gestionados a la 
par, es decir, gestionando el mismo �ndice de todos los Arrays.

+ Estructuras (Structure): Es un Array especial en el sentido de que permite diferente tipos de datos 
a la hora de almacenarlos, a diferencia de los Arrays que solo permiten datos con los que se declara.

Una estructura se define con Structure� End Structure.

Una estructura est� formada por dos partes:

Definir la propia estructura que se realizara justo antes del sub main(), fuera del sub Main(). 

Sintaxis:

	Structure nombre
		Dim�
		Dim�
		�
	End Structure
	Sub Main ()

		C�digo

	End sub

Definir una variable especial del tipo nombre de la Estructura con la que voy a poder acceder a todas las 
variables, para poder leer y/o escribir en ellos. Si se define fuera del main, sirve para todo el proyecto 
y es:

	Public nomVar As nomStruct.

Cuando se declara en el main, seria local, siendo: Dim nomVar As nomStruct.

Para utilizarla seria: 

	nomVar.nomVarStruc = � �

Ejemplo Ejer10Estr:

	Module Module1
    		Structure Libro
        		Dim titulo As String
        		Dim Autor As String
       	 		Dim Editorial As String
        		Dim A�o As Integer
    		End Structure

    		Sub Main()
        		Dim libr As Libro
        		libr.titulo = "El Quijote"
        		libr.Autor = "Cervantes"
        		libr.Editorial = "Santillana"
        		libr.A�o = 1580

        		Console.WriteLine("Los datos son: {0}, {1}, {2}, {3}", libr.titulo, libr.Autor, libr.Editorial, libr.A�o)
        		Console.ReadLine()
    		End Sub

	End Module

Para poder guardar m�s de un dato ser� necesario dimensionar la variable estructura de la siguiente forma:

	Dim nomVar(dimensi�n) As nomEstr

Para referirse a un registro seria:

	nomVar(0).nomVarEstr = � �
 
Ejer11:

Hacer una agenda, con nombre, tel�fono, direcci�n y nivel de amistad, con tres entradas y visualizar.

	Module Module1
    	 Structure Agenda
        	Dim nombre As String
        	Dim telef As Integer
        	Dim amis As Integer
   	 End Structure

    	 Sub Main()
        	Dim agn(2) As Agenda
        	Dim i As Integer
        	Try
            		Console.WriteLine("*APLICACI�N")
            		Console.WriteLine()
            		'introduccion de valores en la estructura'
            		For i = 0 To 2

                		Console.WriteLine("Nombre del amigo {0}:", i + 1)
                		agn(i).nombre = Console.ReadLine()
                		Console.WriteLine("Telefono del amigo {0}:", i + 1)
                		agn(i).telef = Console.ReadLine()
                		Console.WriteLine("Nivel de amistad del amigo {0}:", i + 1)
                		agn(i).amis = Console.ReadLine()

           		Next
            		'visualizacion de los valores de la estructura'
            		For i = 0 To 2
                		Console.WriteLine("Amigo {0}-> Nombre: {1}, Telefono: {2}, Amistad: {3}", i + 1, agn(i).nombre, agn(i).telef, agn(i).amis)
            		Next
        	Catch
            		Console.WriteLine("Se ha producido un error.")
            		Main()
        	End Try
        	Console.Read()
    	 End Sub

	End Module

Para utilizar varias estructuras seria (ejemplo):

	Structure Fecha

		Dim dia as Integer

	End Structure



	Structure Libros

		Dim aut as String
		Dim fecha_publicacion as Fecha

	End Structure

Fecha tiene que estar declarada obligatoriamente antes que libros.

Para utilizarla en el main seria:

	var(i).fecha_publicacion.dia = 23

Esto se puede hacer las veces que queramos.


SUBPROGRAMAS, PROCEDIMIENTOS Y FUNCIONES:
----------------------------------------

+ Subprograma o procedimiento: Un subprograma o procedimiento, representado por sub, es una forma de organizar c�digo por
bloques que tiene la caracter�stica de que no puede devolver ning�n valor tras los
c�lculos. 
Para poder llamar a un procedimiento basta con poner nombreProc (), cuando acaba el procedimiento, 
el procedimiento que llama sigue con la l�nea siguiente. El que llama al procedimiento es el 
nombrado llamador y el otro se denomina llamado.

Ejer12:

Realizar un programa, que calcule el �rea de un triangulo, utilizando un procedimiento 
denominado triangulo, y terminando con un saludo final dise�ado en otro procedimiento.

	Module Module1

    	 Sub Triangulo()

         	Dim base, altura, result As Double

        	Console.WriteLine()
        	Console.WriteLine("Introducir la base del tri�ngulo: ")
        	base = Console.ReadLine()
        	Console.WriteLine()
        	Console.WriteLine("Introducir la altura del triangulo: ")
        	altura = Console.ReadLine()
        	Console.WriteLine()

        	result = base * altura / 2

        	Console.WriteLine("El �rea del tri�ngulo es {0}", Math.Round(result, 2))
        	Console.WriteLine()

    	 End Sub
    	 Sub Saludo()

        	Console.WriteLine("Ejecuci�n finalizada.")
       		Console.WriteLine("Gracias por utilizar la aplicaci�n.")

   	End Sub
 
    	Sub Main()

        	Console.WriteLine("*APLICAIC�N*")
        	Console.WriteLine("Inicio de la aplicaci�n.")
        	Triangulo()
        	Console.WriteLine()
        	Saludo()
        	Console.Read()

    	End Sub

       End Module

Funciones (Function): Es un procedimiento o subprograma especial, que sirve para estructurar
codigo. Tiene de especial, que la funci�n (el propio nombre de la funci�n), actua como una 
variable, es decir, una funci�n devuelce un valor.

Sintaxis:

	Function nom_funcion (parametros separados por comas si hay mas de uno) As tipoDatoDev

		Instrucciones

	End function

Para poder devolver un valor basta con poner el nombre de la funcion o opcionalmente: 

	return nom_funcion

ya que nom_funcion se puede utilizar como si fuese una variable.

Par�metro: Un parametro es un valor, que se puede transmitir entre diferentes procedimientos o funciones. Los datos que se transmiten se denominan parametros.
Los parametros actuales son los que se definen en el procedimiento llamado y los parametros formales son los que se declaran en el llamador.
Los parametros actuales, pueden ser de dos tipos, dependiendo de la posibilidad de que los valores originales, es decir, los parametros formales, puedan ser modificacdos en el procedimiento llamador. Existen por tanto dos tipos:
Paso por valor: Se expresa con ByVal, que hace que los parametros originales no cambien en cuanto a su valor, es el valor por defecto.
Paso por referencia: Permite modificar el valor formal del parametro, y se expresa con Byref.

Ejer13:

Module Module1
    Sub cua(ByVal | Byref par As Integer)
        par = 8
        Console.WriteLine("Valor inicial " & par)
    End Sub
    Sub Main()
        Dim a As Integer = 55
        Console.WriteLine("Valor antes de la llamada {0}", a)

        cua(a)

        Console.WriteLine("Valor despu�s de la llamada {0}", a)
        Console.ReadLine()

    End Sub

End Module

Ejer15:

Realizar un ejercicio, utilizando un menu, que me permita calcular el area del triangulo,
cuadrado, circunferencia y salida, utilizando unicamente procedimientos o funciones 
con parametros.


DISE�O DE CLASES:
-----------------

Para definir una clase en .Net se necesita:

+ Creaci�n de la clase: Para ello se utiliza la sintaxis class nomClase, en su interior 
se pone el conjunto de atributos y m�todos, terminando con End Class.

+ Es necesario generar una variable especial, que cuando se define, se crea una instancia 
que permite, a partir de ese momento poder utilizar esta clase. Esta instancia utiliza la 
palabra reservada new. 

Existen tres formatos para realizar o definir una instancia:

	Dim nomVar As nomClase
	nomVar = new nomClase ()


 	Dim nomVar As nomClase = new nomClase ()


	Dim nomVar As new nomClase ()

+ Una vez definidos los m�todos, en tercer lugar se podr� acceder a los elementos de la
clase, bastara con poner la variable de la instancia seguida con un punto (igual 
que structure).

Ejercicio Class:

Realizar un programa que introduciendo por teclado los datos de una agenda (nom, apel, 
tel, dir), me permita visualizarlos utilizando una clase:

	Module Module1

    	 Class Agenda
         Public nom, apel, dir As String
         Public num As Integer
         Sub introducirDatos()
            Try
                Console.WriteLine("Nombre del contacto: ")
                nom = Console.ReadLine()
                Console.WriteLine()
                Console.WriteLine("Apellido del contacto: ")
                apel = Console.ReadLine()
                Console.WriteLine()
                Console.WriteLine("Telefono del contacto: ")
                num = Console.ReadLine()
                Console.WriteLine()
                Console.WriteLine("Direccion del contacto: ")
                dir = Console.ReadLine()
                Console.WriteLine()
                Console.Read()
            Catch
                Console.WriteLine("Se ha producido un error.")
                introducirDatos()
            End Try
         End Sub
         Sub mostrar()
            Console.Clear()
            Console.WriteLine("Nombre: {0}", nom)
            Console.WriteLine("Apellido: {0}", apel)
            Console.WriteLine("Tel�fono: {0}", num)
            Console.WriteLine("Direcci�n: {0}", dir)
            Console.Read()
         End Sub
        End Class
        Sub Main()
            Dim var As Agenda = New Agenda

            var.introducirDatos()
            var.mostrar()
            Console.ReadLine()
        End Sub

       End Module

Ejercicio ClassCalculos:
Realizar un programa que utilizando una clase que incorporara un men� con una serie de opciones, como son calcular el area del triangulo, cuadrado, rombo y circunferencia, cuyos c�lculos deber�n ser programados en otra clase.
Module Module1
    Public opc As Integer
    Class Menu
        Sub menu()
            Console.WriteLine()
            Console.WriteLine("*MENU*")
            Console.WriteLine()
            Console.WriteLine("1. Tri�ngulo")
            Console.WriteLine("2. Cuadrado")
            Console.WriteLine("3. Rombo")
            Console.WriteLine("4. Cincuferencia")
            Console.WriteLine("5. Salir")
            Console.WriteLine()
        End Sub
    End Class
    Class Calculos
        Public area, calc As Double
        Sub triangulo(ByVal _base As Double, ByVal _altura As Double)
            area = _base * _altura / 2
            Console.WriteLine("El �rea del tri�ngulo es: {0}", Math.Round(area, 2))
            Console.ReadLine()
        End Sub
        Sub cuadrado(ByVal _lado As Double)
            calc = _lado * _lado
            Console.WriteLine("El �rea del cuadrado es: {0}", Math.Round(calc, 2))
            Console.ReadLine()
        End Sub
        Sub rombo(ByVal _diMay As Double, ByVal _diMen As Double)
            calc = _diMay * _diMen / 2
            Console.WriteLine("El �rea del rombo es: {0}", Math.Round(calc, 2))
            Console.ReadLine()
        End Sub
        Sub circunferencia(ByVal _radio As Double)
            calc = Math.PI * Math.Pow(_radio, 2)
            Console.WriteLine("El �rea de la circunferencia es: {0}", Math.Round(calc, 2))
            Console.ReadLine()
        End Sub
    End Class
    Sub Main()
        Dim menu As New Menu()
        Dim calc As New Calculos()
        Dim base, altura, lado, radio, diMay, diMen As Integer
        Dim opcsal As Char

        Try

            menu.menu()
            Console.WriteLine("�Qu� opci�n desea?")
            opc = Console.ReadLine()
            Select Case opc
                Case 1
                    Console.Clear()
                    Console.WriteLine("La opci�n es hayar el �rea del tri�ngulo.")
                    Console.WriteLine("Introduzca la base:")
                    base = Console.ReadLine()
                    Console.WriteLine("Introduzca la altura: ")
                    altura = Console.ReadLine()
                    calc.triangulo(base, altura)
                    Main()
                Case 2
                    Console.Clear()
                    Console.WriteLine("La opci�n es hayar el �rea del cuadrado.")
                    Console.WriteLine("Introduzca el lado: ")
                    lado = Console.ReadLine()
                    calc.cuadrado(lado)
                    Main()
                Case 3
                    Console.WriteLine("La opci�n es hayar el �rea del rombo.")
                    Console.WriteLine("Introduzca la diagonal mayor:")
                    diMay = Console.ReadLine()
                    Console.WriteLine("Introduzca la diagonal menor: ")
                    diMen = Console.ReadLine()
                    calc.rombo(diMay, diMen)
                    Main()
                Case 4
                    Console.Clear()
                    Console.WriteLine("La opci�n es hayar el �rea de la circunferencia.")
                    Console.WriteLine("Introduzca el radio: ")
                    radio = Console.ReadLine()
                    calc.circunferencia(radio)
                    Main()
                Case 5
                    Console.WriteLine("�Desea salir? Si - s / No - n")
                    opcsal = Console.ReadLine()
                    Select Case opcsal
                        Case "s", "S"
                            Console.WriteLine("Saliendo...")
                            Console.Clear()
                            Console.WriteLine("Gracias por utilizar el programa.")
                        Case "n", "N"
                            Console.WriteLine("Colviendo a ejecutar...")
                            Main()
                        Case Else
                            Console.WriteLine("La opci�n no es valida")
                    End Select
                Case Else
                    Console.WriteLine("La opci�n no es valida.")
                    Main()
            End Select
        Catch
            Console.WriteLine("Se ha producido un error.")
            Main()
        End Try
        Console.ReadLine()
    End Sub

End Module

AGREGAR UNA CLASE COMO FICHERO EN UN PROYECTO:

Consiste en seguir los siguientes pasos:

1. Ir a nombre del Proyecto, bot�n derecho agregar, y luego en clase.
2. Aparecer� la opci�n del nombre del fichero, con extensi�n .vb (fichero de 
c�digo)
3. Se abrir� un IDE, donde se escribir� la o las clases
4. Una vez escrito se guardara.

Este fichero aparecer� en el explorador de soluciones y podr� ser usado (llamar 
a todas las clases y m�todos), de forma convencional (como siempre), en el 
programa principal.



NAMESPACES:
-----------
Es un mecanismo que permite organizar, formando espacios independientes todas
las clases. Se trata de simplificar y organizar a modo de paquetes el acceso a 
clases, en bloques.

+ Son bloques de clases, cada namespace tiene un n�mero de clases a las que se 
puede acceder, para que sea mas c�modo utilizar las bibliotecas de clase.
Ejemplo:

	Namespace n1

		Clase1
			Instrucc
		End class

		Clase1
			Instrucc
		End class

	End namespace

	Namespace n2

		Clase3
			Instrucc
		End class

		Clase4
			Instrucc
		End class

	End namespace

Es necesario importar el nombre del namespace, para poder utilizarlo, de la misma
forma que las clases.
