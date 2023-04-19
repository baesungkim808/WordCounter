
public class Counter {
	private int words;
	
	public Counter() {
		this.words = 0;
	}
	
	public void addWords(String line) {
		line = line.trim();
		this.words += line.split("\\s+").length;
	}
	
	public int getWords() {
		return this.words;
	}
}
