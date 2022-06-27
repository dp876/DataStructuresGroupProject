// Damain Patterson

package wheelOfFortune;

public class LetterNode {
	private Letter data;
	private LetterNode next;
	private LetterNode prev;
	
	// default constructor
	public LetterNode() {
		data = null;
		next = null;
		prev = null;
	}
	
	// primary constructor
	public LetterNode(Letter data) {
		this.data = data;
		next = null;
		prev = null;
	}
	
	// getters & setters
	public Letter getData() {
		return data;
	}
	public void setData(Letter data) {
		this.data = data;
	}
	public LetterNode getNext() {
		return next;
	}
	public void setNext(LetterNode next) {
		this.next = next;
	}
	public LetterNode getPrev() {
		return prev;
	}
	public void setPrev(LetterNode prev) {
		this.prev = prev;
	}	
}
