// Damain Patterson

package wheelOfFortune;

public class Player {
	private int pNumber;
	private String pName;
	private int pGrandTotal;
	private boolean cpu;

	// default constructor
	public Player() {
		this.pNumber = 1;
		this.pName = null;
		this.pGrandTotal = 0;
		this.cpu = false;
	}

	// primary constructor
	public Player(int pNumber, String pName, int pGrandTotal, boolean cpu) {
		this.pNumber = pNumber;
		this.pName = pName;
		this.pGrandTotal = pGrandTotal;
		this.cpu = cpu;
	}

	// copy constructor
	public Player(Player obj) {
		this.pNumber = obj.pNumber;
		this.pName = obj.pName;
		this.pGrandTotal = obj.pGrandTotal;
		this.cpu = obj.cpu;
	}

	// getters & setters
	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpGrandTotal() {
		return pGrandTotal;
	}

	public void setpGrandTotal(int pGrandTotal) {
		this.pGrandTotal = pGrandTotal;
	}

	public boolean isCpu() {
		return cpu;
	}

	public void setCpu(boolean cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Player [pNumber=" + pNumber + ", pName=" + pName + ", pGrandTotal=" + pGrandTotal + "]";
	}
	
}
