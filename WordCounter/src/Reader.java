import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
	private Path file;
	private String line;
	private Counter counter;
	
	public Reader(String file, Counter counter) {
		this.file = Paths.get(file);
		this.counter = counter;
	}
	
	public void read() {
		try (BufferedReader br = Files.newBufferedReader(this.file)) {
			while ((this.line = br.readLine()) != null) {
				this.counter.read(this.line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
