// Damain Patterson

package wheelOfFortune;

public class Letter {
	private char letter;
	
	// default constructor
	public Letter() {
		letter = ' ';
	}
	
	// primary constructor
	public Letter(char letter) {
		this.letter = letter;
	}

	// getters & setters
	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + "]";
	}
}
