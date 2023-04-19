public class Driver {

	public static void main(String[] args) {
		try {
			Counter counter = new Counter();
			Reader reader = new Reader(args[0], counter);
			
			reader.read();
			counter.printWords();
			counter.printCharacters();
			counter.printSentences();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("No file given.");
		}
		
	}

}
