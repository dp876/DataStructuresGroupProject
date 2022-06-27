// Damain Patterson

package wheelOfFortune;

public class WheelNode {
	Wheel data;
	WheelNode next;
	
	// default constructor
	public WheelNode() {
		data = null;
		next = null;
	}
	
	// primary constructor
	public WheelNode(Wheel data) {
		this.data = data;
	}

	// getters & setters
	public Wheel getData() {
		return data;
	}

	public void setData(Wheel data) {
		this.data = data;
	}

	public WheelNode getNext() {
		return next;
	}

	public void setNext(WheelNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "WheelNode [data=" + data + ", next=" + next + "]";
	}
	
}
