package ejercicio1;

/* Ejercicio 1 de Java de manejo de ficheros:
 * Abrir un fichero.
 */

	import java.io.*;

public class FicherosEjer1 {
	public static void main (String [] args){
		try{

			File fich = new File("PruebaFileEjer1.txt");
			DataInputStream dis = new DataInputStream (new BufferedInputStream (new FileInputStream(fich)));
			dis.read();
		}catch(FileNotFoundException err1){
			err1.printStackTrace();
		}catch(IOException err2){
			err2.printStackTrace();
		}
		
	}
}
