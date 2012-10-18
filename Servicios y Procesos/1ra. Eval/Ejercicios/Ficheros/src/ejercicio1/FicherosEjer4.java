package ejercicio1;
/*
 * Ejercicio 4 de manejo de ficheros:
 * Leer un fichero y visualizarlo por pantalla. 
 */


import java.io.*;


public class FicherosEjer4{
	public static void main (String [] args){
		
		//Bloque de excepciones.
		
		try{
			
			//Variables necesarias de la aplicación.
			
			String str1,str2, mensaje;
			
			//Creación del fichero y escritura en el.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter mens = new PrintWriter(new BufferedWriter (new FileWriter(new File("PruebasFileEjer5.txt"))));
			System.out.println("Escriba un mensaje para visualizar: ");
			mensaje = br.readLine();
			mens.println(mensaje);
			mens.close();
			
			//Lectura de los datos del fichero.
			
			BufferedReader ent = new BufferedReader(new FileReader("PruebasFileEjer5.txt"));
			while((str2 = ent.readLine()) != null){
				str1 = str2 + "\n";
				System.out.println("\nTexto leido:\n"+ str1);
				ent.close();
			}
				
		}catch(IOException err1){
			
			//Mensaje de la excepción.
			
			System.out.println(err1.getMessage());
			
		}
	}
}
