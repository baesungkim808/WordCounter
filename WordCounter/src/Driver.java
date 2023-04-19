
/**
 * Main class responsible for running this program.
 * 
 * @author baesungkim
 *
 */
public class Driver {

	/**
	 * Initializes the Reader and Counter classes and runs this program.
	 * 
	 * @param args may or may not contain an argument representing a file to process
	 */
	public static void main(String[] args) {
		try {
			Counter counter = new Counter();
			Reader reader = new Reader(args[0], counter);
			
			// add up the number of words, characters, and sentences in the file
			reader.read();
			
			// output number of words, characters, and sentences found
			counter.printWords();
			counter.printCharacters();
			counter.printSentences();
		}
		// if no command-line argument is given, no file is available for processing
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("No file given.");
		}
	}

}
