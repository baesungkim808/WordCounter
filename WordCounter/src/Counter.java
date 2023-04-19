
public class Counter {
	/** Regular expression to split strings on whitespace. */
	private static final String SPLIT_REGEX = "\\s+";
	
	/** Number of words. */
	private int words;
	
	/** Number of characters. */
	private int characters;
	
	public Counter() {
		this.words = 0;
		this.characters = 0;
	}
	
	public void read(String line) {
		addWords(line);
		addCharacters(line);
	}

	public void addWords(String line) {
		this.words += line.split(SPLIT_REGEX).length;
	}
	
	public void addCharacters(String line) {
		this.characters += line.length();
	}
	
	/**
	 * Returns the number of words found.
	 * 
	 * @return the number of words
	 */
	public int getWords() {
		return this.words;
	}
	
	/**
	 * Returns the number of characters found.
	 * 
	 * @return the number of characters
	 */
	public int getCharacters() {
		return this.characters;
	}
	
	/**
	 * Prints the number of words found.
	 */
	public void printWords() {
		System.out.println("Words: " + this.words);
	}
	
	/**
	 * Prints the number of characters found.
	 */
	public void printCharacters() {
		System.out.println("Characters: " + this.characters);
	}
}
