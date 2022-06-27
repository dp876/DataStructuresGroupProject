// Damain Patterson

package wheelOfFortune;

public class PlayerCircularList {
	private PlayerNode head;
	private PlayerNode tail;
	
	// default constructor
	public PlayerCircularList() {
		head = null;
		tail = null;
	}
	
	// adds new element to list
	public void addPlayer(Player data) {
		PlayerNode newPlayer = new PlayerNode(data);
		
		if(head == null) {
			head = tail = newPlayer;
			tail.setNext(head);
		}
		else {
			tail.setNext(newPlayer);
			tail = newPlayer;
			tail.setNext(head);
		}
	}
	
	// displays all elements in list
//	public void display() {
//		PlayerNode current = head;
//		
//		if(head == null) {
//			System.out.println("# No Players in List...");
//		}
//		else {
//			System.out.println("# Players: ");{
//				do {
//					System.out.print(" " + current.data);
//					current = current.next;
//				}while(current != head);
//				System.out.println();
//			}
//		}
//		
//	}

	// getters & setters
	public PlayerNode getHead() {
		return head;
	}

	public void setHead(PlayerNode head) {
		this.head = head;
	}

	public PlayerNode getTail() {
		return tail;
	}

	public void setTail(PlayerNode tail) {
		this.tail = tail;
	}
	
}
