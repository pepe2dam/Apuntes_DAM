Desarrollo de Interfaces
========================

Parte 3. Manejo de Consola
--------------------------

Clase console:
-------------

Precedida de la expresión Console, existen una serie de métodos que permiten 
interrelacionarse con la pantalla, de todos los métodos existentes destacan 
cuatro:

	Console.Write()

+ Permite escribir datos en la consola, y no se produce salto de carro del cursor.

	Console.WriteLine()

+ Escribe la información en la console y produce un salto de linea. No se utiliza 
  para visualizar literales, para eso se utiliza el último.

	Console.Read()

+ Detiene la ejecución de un programa y espera a que el usuario introduzca datos que 
  se asignan a una variable. NO se produce salto de carro.

	Console.ReadLine()

+ Igual que el anterior pero con salto de carro.

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
        	'para truncar un decimal a dos numeros se pone math.Round(variable,nº decimales) donde se quiera que			 aparezca la division'
       		Console.WriteLine("La division es: {0}", Math.Round(division, 2))
        	Console.Read()

   	 End Sub

	End Module

Estructuras de Control:
----------------------

Una estructura de control permite la toma de decisiones y la repetición de las acciones
de un programa, para ello existen unas sentencias de control o instrucciones:

###CONDICIONALES:

