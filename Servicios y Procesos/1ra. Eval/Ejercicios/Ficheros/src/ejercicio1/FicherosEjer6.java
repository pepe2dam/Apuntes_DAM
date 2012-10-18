package ejercicio1;
import java.io.*;
import java.util.*;
public class FicherosEjer6{
	public static void main(String [] args) throws IOException{
		FileReader fr = new FileReader("cancion.txt");
		FileWriter fichsalida = new FileWriter(new File("salidaEjr6.txt"));
		int ch;
		int i = 1;
		String salida = "";
		do{
			ch = fr.read();
			if(ch != -1){
				i++;
				System.out.print((char) ch);
			}
		
			if(ch != -1){
				salida = salida + (char) ch;
			}
			fichsalida.write(salida);
		}while(ch != -1);
		fr.close();
		fichsalida.close();
		System.out.println("Caracteres leídos: "+i);
		
	}
}