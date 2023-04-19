import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Handles reading and processing a file line by line.
 * 
 * @author baesungkim
 *
 */
public class Reader {
	/** The file to be read. */
	private Path file;
	
	/** Represents each line in the file. */
	private String line;
	
	/** Counter object for adding up the number of words, characters, and sentences in each line. */
	private Counter counter;
	
	/**
	 * Initializes this Reader.
	 * 
	 * @param file the file to be read
	 * @param counter Counter object for adding up the number of words, characters, and sentences in each line
	 */
	public Reader(String file, Counter counter) {
		this.file = Paths.get(file);
		this.counter = counter;
	}
	
	/**
	 * Reads and processes every line within the file for counting.
	 */
	public void read() {
		try (BufferedReader br = Files.newBufferedReader(this.file)) {
			while ((this.line = br.readLine()) != null) {
				this.counter.read(this.line);
			}
		}
		catch (IOException e) {
			System.err.println(this.file.toString() + " is not a valid file.");
			System.exit(0);
		}
	}
}
