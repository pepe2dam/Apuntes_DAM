Desarrollo de Interfaces
========================

Parte 3. Manejo de Consola
--------------------------

Clase console:
-------------

Precedida de la expresión Console, existen una serie de métodos que permiten 
interrelacionarse con la pantalla, de todos los métodos existentes destacan 
cuatro:



+ Console.Write() = Permite escribir datos en la consola, y no se produce salto de carro del cursor.


+ Console.WriteLine() = Escribe la información en la console y produce un salto de linea. No se utiliza 
  para visualizar literales, para eso se utiliza el último.

+ Console.Read() = Detiene la ejecución de un programa y espera a que el usuario introduzca datos que 
  se asignan a una variable. NO se produce salto de carro.

+ Console.ReadLine() = Igual que el anterior pero con salto de carro.

Para visualizar el contenido de una variable, una de las formas que se puede utilizar son 
los marcadores de posición, que consiste en hacer una numeración entre llaves, empezando 
por cero, de las variables que se quieren visualizar, ejemplo:

	Console.WriteLine("El número es {0}", a)

Lo que hay detrás de la coma es la lista de variables, y lo que va entre llaves es la lista,
como haciendo un link a cada variable.

Ejer2:

Realizar un ejercicio que introduzca por teclado mi nombre y la edad y la visualiza 
por pantalla:

	Module Module1
		Sub Main()
			Dim nombre As String 
			Dim edad As Integer
			Console.Write("Introduce tu nombre: ")
			nombre = Console.ReadLine()
			Console.Write("Introduce tu edad: ")
			edad = Console.ReadLine()
			Console.WriteLine("El nombre y la edad son: {0}, {1} años", nombre, edad)
			Console.Read()
		End Sub
	End Module

Ejer3:

Realizar un proyecto que me pida dos números por teclado, visualizando la suma, resta, 
multiplicación y división:

	Module Module1

   	 Sub Main()
        	Dim a As Integer
        	Dim b As Integer
        	Dim suma As Integer
       		Dim resta As Integer
       		Dim multiplicacion As Integer
        	Dim division As Double

        	Console.Write("Escriba el primer número: ")
        	a = Console.ReadLine()
        	Console.Write("Escriba el segundo número: ")
        	b = Console.ReadLine()

        	Console.WriteLine()
       		suma = a + b
       		Console.WriteLine("La suma es: {0}", suma)

        	resta = (a) - (b)
        	Console.WriteLine("La resta es: {0}", resta)

        	multiplicacion = a * b
        	Console.WriteLine("La multiplicacion es: {0}", multiplicacion)

        	division = a / b
        	'para truncar un decimal a dos numeros se pone math.Round(variable,nº decimales) donde se quiera que		     aparezca la division'
       		Console.WriteLine("La division es: {0}", Math.Round(division, 2))
        	Console.Read()

   	 End Sub

	End Module

Estructuras de Control:
----------------------

Una estructura de control permite la toma de decisiones y la repetición de las acciones
de un programa, para ello existen unas sentencias de control o instrucciones:

###CONDICIONALES:

####Sintaxis:

Estructura condicional simple:

	If condicion Then

		Instrucciones
	
	End If


Estructura condicional doble:

	If condicion Then
 
		Instrucicones

	Else
	
		Instrucciones 

	End If

Estructura de control anidada:

	If condicion Then
		
		Instrucciones

	Else If condicion Then

		Instrucciones

	End If

Ejer4:

Realizar un proyecto que creando un menú de cuatro opciones, me visualice que opción se ha 
pulsado:

	Module Module1
    	 Sub Main()
        	Dim opcion As Integer
        	Console.WriteLine("Opción 1")
        	Console.WriteLine("Opción 2")
        	Console.WriteLine("Opción 3")
        	Console.WriteLine("Opción 4")
        	Console.Write("¿Qué opción desea pulsar? ")
        	opcion = Console.ReadLine()
        	If opcion = 1 Then
            		Console.WriteLine()
           		Console.WriteLine("Has pulsado la primera opción")
            		Console.Read()
        	End If
        	If opcion = 2 Then
            		Console.WriteLine()
            		Console.WriteLine("Has pulsado la segunda opción")
            		Console.Read()
        	End If
        	If opcion = 3 Then
            		Console.WriteLine()
            		Console.WriteLine("Has pulsado la tercera opción")
            		Console.Read()
        	End If
        	If opcion = 4 Then
            		Console.WriteLine()
            		Console.WriteLine("Has pulsado la cuarta opción")
            		Console.Read()
       		End If
   	 End Sub
	End Module
	
Condicionales múltiples:

	Select case variable

		Case opc1

			Instrucciones

		Case opc2

			Instrucciones

		Case opc3
			
			Instrucciones
		
		Case Else 'cualquier otra opción'

			Instrucciones

		End Case

Para las opciones case se pueden poner varias opciones en uno mismo separados por comas, si se pone To,
por ejemplo 2 To 4, es un rango que va del 2 al 4.
		
Ejer5:
Realizar un ejercicio que introduciendo por teclado una nota entera, me visualice en letra la 
calificación:

	Module Module1

   	 Sub Main()
        	Dim nota As Integer
        	Console.Write("Escriba la nota del alumno: ")
        	nota = Console.ReadLine()
        	Select Case nota
            		Case 1 To 3
                		Console.WriteLine()
                		Console.WriteLine("Nota: Muy insuficionete (1-3)")
                		Console.Read()
           		Case 1 To 5
                		Console.WriteLine()
                		Console.WriteLine("Nota: Insuficiente (3 - 5)")
               			Console.Read()
            		Case 5
                		Console.WriteLine()
                		Console.WriteLine("Nota: Suficiente (5)")
                		Console.Read()
            		Case 6
                		Console.WriteLine()
                		Console.WriteLine("Nota: Bien (6)")
                		Console.Read()
            		Case 7, 8
                		Console.WriteLine()
               		 	Console.WriteLine("Nota: Notable (7-8)")
                		Console.Read()
            		Case 9, 10
                		Console.WriteLine()
                	Console.WriteLine("Nota: Sobresaliente (9-10)")
               		Console.Read()
        	End Select

    	 End Sub

	End Module

Estructuras repetitivas:
-----------------------

####For ... Next: 

Estructura repetitiva que de antemano se sabe el número de  veces que se va
a realizar. 

#####Sintaxis:

	For variablecontrol = valorinicial To valorfinal [Step salto(valor ++/--]
		
		Instrucciones 
	
	Next variablecontrol

Si no se pone Step es de uno en uno. Ejemplo:


	For a = 1 To 10 [Step 1]
	
		Console.WriteLine("{0}", a);

	Next a

Para salir de un For se pone la condición de salida, o se escribe Exit For evitando 
que se ejecute hasta el final. Los For pueden estar anidados.

