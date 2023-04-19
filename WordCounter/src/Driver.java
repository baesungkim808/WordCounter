import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Path inputFile = Paths.get(args[0]);
		String line;
		
		try (BufferedReader br = Files.newBufferedReader(inputFile)) {
			while ((line = br.readLine()) != null) {
				counter.read(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Words: " + counter.getWords());
		System.out.println("Characters: " + counter.getCharacters());
	}

}
