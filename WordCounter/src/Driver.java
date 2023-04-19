public class Driver {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Reader reader = new Reader(args[0], counter);
		
		reader.read();
		counter.printWords();
		counter.printCharacters();
	}

}
