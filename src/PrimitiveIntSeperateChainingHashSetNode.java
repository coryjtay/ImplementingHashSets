// PROGRAMMER: COREY TAYLOR
public class PrimitiveIntSeperateChainingHashSetNode {

	// INSTANCE VARAIBLES
	private int element;
	private PrimitiveIntSeperateChainingHashSetNode nextNode;

	// CONSTRUCTORS
	public PrimitiveIntSeperateChainingHashSetNode(int element, PrimitiveIntSeperateChainingHashSetNode nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}

	// INSTANCE METHODS
	public PrimitiveIntSeperateChainingHashSetNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(PrimitiveIntSeperateChainingHashSetNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getElement() {
		return element;
	}

}
