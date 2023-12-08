package day20231130;
import java.io.*;
public class BankAccountTest {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
		BankAccount b = new BankAccount("워렌 버핏", "206-000002", 1000000);
		File file = new File("accounts-data.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(a.toString() + "\n");
		fw.write(b.toString() + "\n");
		fw.close();
	}
}

class BankAccount {
	private final String username;
	private final String number;
	private int amount;
	public BankAccount(String username, String number, int amount) {
		this.username = username;
		this.number = number;
		this.amount = amount;
	}
	
	public String toString() {
		return String.format("%s, %s, %d", username, number, amount);
	}
}
