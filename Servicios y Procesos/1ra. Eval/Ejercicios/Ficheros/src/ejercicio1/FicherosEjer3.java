package ejercicio1;

/*Ejercicio 3 de Java de manejo de ficheros:
 * Crear un fichero con la informacion introducida por teclado.
 */

import java.io.*;


public class FicherosEjer3{
	public static void main (String [] args){
		
		//Bloque de excepciones
		
		try{
			
			String mensaje = new String();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter mens = new PrintWriter(new BufferedWriter (new FileWriter(new File("PruebasFileEjer3.txt"))));
			System.out.println("Escriba un mensaje para guardar en el fichero: ");
			mensaje = br.readLine();
			mens.println(mensaje);
			mens.close();
				
		}catch(IOException err1){
			System.out.println(err1.getMessage());
		}
	}
}
