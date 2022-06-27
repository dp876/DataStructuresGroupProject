// Damain Patterson

package wheelOfFortune;

public class WheelCircularList {
	private WheelNode head;
	private WheelNode tail;

	// default constructor
	public WheelCircularList() {
		head = null;
		tail = null;
	}

	// adds new data to list
	public void addCard(Wheel data) {
		WheelNode newCard = new WheelNode(data);

		if (head == null) {
			head = tail = newCard;
			tail.setNext(head);
		} else {
			tail.setNext(newCard);
			tail = newCard;
			tail.setNext(head);
		}
	}

	// display all elements from list
//	public void display() {
//		WheelNode current = head;
//
//		if (head == null) {
//			System.out.println("# No Cards in List...");
//		} else {
//			System.out.println("# Cards: ");
//			{
//				do {
//					System.out.println(" " + current.data);
//					current = current.next;
//				} while (current != head);
//				System.out.println();
//			}
//		}
//
//	}

	// getters & setters
	public WheelNode getHead() {
		return head;
	}

	public void setHead(WheelNode head) {
		this.head = head;
	}

	public WheelNode getTail() {
		return tail;
	}

	public void setTail(WheelNode tail) {
		this.tail = tail;
	}
}
