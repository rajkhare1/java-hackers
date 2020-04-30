import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestReader {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> words = new ArrayList<String>();
		// TODO Auto-generated method stub
		File inFile = new File("dictionary.txt");
		try(FileReader fileReader = new FileReader(inFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String currentLine = bufferedReader.readLine();
			while(currentLine !=null) {
			words.add(currentLine);
			currentLine = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not Found: "+inFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Problem with reading file: "+inFile.getName());
		}
		
		System.out.println(words.size());
	}

}
