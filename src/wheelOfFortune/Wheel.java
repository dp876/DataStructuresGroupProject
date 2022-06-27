// Damain Patterson

package wheelOfFortune;

public class Wheel {
	int cardPos;
	String card;
	int value;
	
	// default constructor
	public Wheel() {
		cardPos = 0;
		card = null;
		value = 0;
	}
	
	// primary constructor
	public Wheel(int cardPos, String card, int value) {
		this.cardPos = cardPos;
		this.card = card;
		this.value = value;
	}
	
	// copy constructor
	public Wheel(Wheel obj) {
		this.cardPos = obj.cardPos;
		this.card = obj.card;
		this.value = obj.value;
	}
	
	// getters & setters
	public int getCardPos() {
		return cardPos;
	}

	public void setCardPos(int cardPos) {
		this.cardPos = cardPos;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Wheel [cardPos=" + cardPos + ", card=" + card + ", value=" + value + "]";
	}
	
}
