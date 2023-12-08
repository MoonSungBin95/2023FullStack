package day20231130;
import java.io.*;
public class BackAccountTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		File file = new File("accounts-data.txt");
		FileReader fr = new FileReader(file);
		int ch;
		while((ch=fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}

