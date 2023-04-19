import java.util.regex.PatternSyntaxException;

/**
 * Reads strings and counts the number of words, characters, sentences, and lines found.
 * 
 * @author baesungkim
 *
 */
public class Counter {
	/** Regular expression to split strings on whitespace. */
	private static final String SPLIT_REGEX = "\\s+";
	
	/** Number of words. */
	private int words;
	
	/** Number of characters. */
	private int characters;
	
	/** Number of sentences. */
	private int sentences;
	
	/** Number of lines. */
	private int lines;
	
	/**
	 * Initializes this Counter.
	 */
	public Counter() {
		this.words = 0;
		this.characters = 0;
		this.sentences = 0;
		this.lines = 0;
	}
	
	/**
	 * Adds the number of words, characters, and sentences in the given string 
	 * to their respective totals. Increments the current total number of lines.
	 * 
	 * @param line the string to process
	 */
	public void read(String line) {
		addWords(line);
		addCharacters(line);
		addSentences(line);
		addLines(line);
	}

	/**
	 * Adds the number of words in the given string to the current total.
	 * 
	 * @param line the string to process
	 */
	private void addWords(String line) {
		try {
			this.words += line.split(SPLIT_REGEX).length;
		}
		catch (PatternSyntaxException e) {
			System.err.println(SPLIT_REGEX + " is an invalid regular expression.");
			System.exit(0);
		}
	}
	
	/**
	 * Adds the number of characters in the given string to the current total.
	 * 
	 * @param line the string to process
	 */
	private void addCharacters(String line) {
		this.characters += line.length();
	}
	
	/**
	 * Adds the number of sentences in the given string to the current total.
	 * 
	 * @param line the string to process
	 */
	private void addSentences(String line) {
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			
			// a sentence ends with a period, question mark, or exclamation mark
			if (c == '.' || c == '?' || c == '!') {
				this.sentences++;
			}
		}
	}
	
	/**
	 * Increments the current total number of lines.
	 * 
	 * @param line the string to process
	 */
	private void addLines(String line) {
		this.lines++;
	}
	
	/**
	 * Returns the total number of words found.
	 * 
	 * @return the total number of words
	 */
	public int getWords() {
		return this.words;
	}
	
	/**
	 * Returns the total number of characters found.
	 * 
	 * @return the total number of characters
	 */
	public int getCharacters() {
		return this.characters;
	}
	
	/**
	 * Returns the total number of sentences found.
	 * 
	 * @return the total number of sentences
	 */
	public int getSentences() {
		return this.sentences;
	}
	
	/**
	 * Returns the total number of lines found.
	 * 
	 * @return the total number of lines
	 */
	public int getLines() {
		return this.lines;
	}
	
	/**
	 * Outputs the total number of words found.
	 */
	public void printWords() {
		System.out.println("Words: " + this.words);
	}
	
	/**
	 * Outputs the total number of characters found.
	 */
	public void printCharacters() {
		System.out.println("Characters: " + this.characters);
	}
	
	/**
	 * Outputs the total number of sentences found.
	 */
	public void printSentences() {
		System.out.println("Sentences: " + this.sentences);
	}
	
	/**
	 * Outputs the total number of lines found.
	 */
	public void printLines() {
		System.out.println("Lines: " + this.lines);
	}
}
