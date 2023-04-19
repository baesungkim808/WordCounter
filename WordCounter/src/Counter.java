import java.util.regex.PatternSyntaxException;

public class Counter {
	/** Regular expression to split strings on whitespace. */
	private static final String SPLIT_REGEX = "\\s+";
	
	/** Number of words. */
	private int words;
	
	/** Number of characters. */
	private int characters;
	
	/** Number of sentences. */
	private int sentences;
	
	public Counter() {
		this.words = 0;
		this.characters = 0;
		this.sentences = 0;
	}
	
	public void read(String line) {
		addWords(line);
		addCharacters(line);
		addSentences(line);
	}

	public void addWords(String line) {
		try {
			this.words += line.split(SPLIT_REGEX).length;
		}
		catch (PatternSyntaxException e) {
			System.err.println(SPLIT_REGEX + " is an invalid regular expression.");
			System.exit(0);
		}
	}
	
	public void addCharacters(String line) {
		this.characters += line.length();
	}
	
	public void addSentences(String line) {
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == '.' || c == '?' || c == '!') {
				this.sentences++;
			}
		}
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
	 * Returns the number of sentences found.
	 * 
	 * @return the number of sentences
	 */
	public int getSentences() {
		return this.sentences;
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
	
	/**
	 * Prints the number of sentences found.
	 */
	public void printSentences() {
		System.out.println("Sentences: " + this.sentences);
	}
}
