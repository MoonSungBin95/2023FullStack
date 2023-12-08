package Meeting_Room;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.lang3.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Reservation_C2E {
	static String filepath = "signin.csv";
	static Scanner scan = new Scanner(System.in);

	public static void WriteToCsv(String filepath) throws IOException {
		
		String[] members = new String[2];
		CSVWriter writer = new CSVWriter(new FileWriter(filepath));

		}
	
	public static void readDataFromCsv(String filepath) throws IOException, CsvValidationException{
		CSVReader reader = new CSVReader(new FileReader(filepath));
		String[] nextline;
		while (( nextline = reader.readNext()) != null) {
			for(int i=0; i < nextline.length; i++) {
				System.out.println(i+ " " + nextline[i]);
			}
			System.out.println();
		}
	}
}
