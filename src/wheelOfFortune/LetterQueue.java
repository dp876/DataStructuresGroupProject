// Damain Patterson

package wheelOfFortune;

public class LetterQueue {
	private LetterNode qFront;
	private LetterNode qRear;
	private LetterNode tempNode;

	// default constructor
	public LetterQueue() {
		qFront = null;
		qRear = null;
		tempNode = null;
	}

	// adds new queue to rear of list
	public void enQueue(Letter obj) {
		if (qRear == null) {
			qRear = qFront = new LetterNode(obj);
			qRear.setNext(null);
		} else {
			tempNode = new LetterNode(obj);
			qRear.setNext(tempNode);
			tempNode.setNext(null);
			qRear = tempNode;
		}
	}

	// searches list for parameter value
	public boolean searchQueue(Letter obj) {
		tempNode = qFront;

		while (tempNode != null) {
			if (tempNode.getData().getLetter() == obj.getLetter()) {
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	// removes all elements from queue list
	public void emptyQueue() {
		while (qFront != null) {
			tempNode = qFront;

			if (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
				qFront = null;
				qFront = tempNode;
			} else {
				qFront = null;
				qRear = null;
			}
		}
	}

}
