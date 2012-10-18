package ejercicio1;

	import java.io.*;

public class FicherosEjer5 {
	public static void main(String [] args){
		try{
			String str1,str2 = new String();
			FileWriter fichsalida = new FileWriter(new File("salida.txt"));
			BufferedReader ent = new BufferedReader(new FileReader("cancion.txt"));
			while((str2 = ent.readLine()) != null){
				str1 = str2 + "\n";
				System.out.println("\nTexto existente: \n"+str1);
				fichsalida.write(str2);
				ent.close();
				fichsalida.close();
			}
		}catch(IOException err1){
			System.out.println(err1.getMessage());
		}
	}
}
