package ejercicio1;

import java.io.*;


public class FicherosEjer2 {
	public static void main (String [] args) throws IOException{
		File fich = new File("C:\\Users\\Dai2_Prof\\Desktop\\DAM2\\Servicios y Procesos\\1ra. Eval\\Ejercicios\\Ficheros\\PruebasFileEjer2.txt");
		FileWriter fwr = new FileWriter (fich);
		if (fich.exists() != false){
			System.out.println("El fichero existe.");
		}else{
			System.out.println("El fichero no existe");
		}
		System.out.println("\nNombre del archivo: \n"+fich.getName());
		System.out.println("\nRuta del fichero: \n"+fich.getPath());
		System.out.println("\nBytes del archivo: \n"+fich.length());
	}
}
