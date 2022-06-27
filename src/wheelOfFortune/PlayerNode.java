// Damain Patterson

package wheelOfFortune;

public class PlayerNode {
	Player data;
	PlayerNode next;
	
	// default constructor
	public PlayerNode() {
		data = null;
		next = null;
	}

	// primary constructor
	public PlayerNode(Player data) {
		this.data = data;
		this.next = null;
	}
	
	// primary constructor
	public PlayerNode(Player data, PlayerNode next) {
		this.data = data;
		this.next = next;
	}
	
	// copy constructor
	public PlayerNode(PlayerNode obj) {
		this.data = obj.data;
		this.next = obj.next;
	}

	// getters & setters
	public Player getData() {
		return data;
	}

	public void setData(Player data) {
		this.data = data;
	}

	public PlayerNode getNext() {
		return next;
	}

	public void setNext(PlayerNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "PlayerNode [data=" + data + ", next=" + next + "]";
	}
		
}
