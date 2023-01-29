// PROGRAMMER: COREY TAYLOR
public class PrimitiveIntSeperateChainingHashSet {

	// INSTANCE VARIABLES
	private int numberOfBuckets;
	@SuppressWarnings("unused")
	private int size; // numberOfNodes
	private PrimitiveIntSeperateChainingHashSetNode[] bucket;

	// CONSTRUCTOR
	public PrimitiveIntSeperateChainingHashSet() {
		numberOfBuckets = 0;
		size = 0;
		bucket = new PrimitiveIntSeperateChainingHashSetNode[numberOfBuckets];
	}

	public PrimitiveIntSeperateChainingHashSet(int numberOfBuckets) {
		if (numberOfBuckets <= 0) {
			throw new IllegalArgumentException("Number of buckets cannot be less than zero");
		}
		size = 0;
		this.numberOfBuckets = numberOfBuckets;
		bucket = new PrimitiveIntSeperateChainingHashSetNode[numberOfBuckets];
	}

	// INSTANCE METHODS
	private int hashCodeIndex(int element) {
		int hashCode = Math.abs(element);
		return (hashCode % numberOfBuckets);
	}

	public boolean add(int element) {
		int index = hashCodeIndex(element);
		PrimitiveIntSeperateChainingHashSetNode currentNode = bucket[index];
		while (currentNode != null) {
			if (currentNode.getElement() == element) {
				return false;
			}
			currentNode = currentNode.getNextNode();
		}
		PrimitiveIntSeperateChainingHashSetNode newNode = new PrimitiveIntSeperateChainingHashSetNode(element,
				bucket[index]);
		bucket[index] = newNode;
		size++;
		return true;
	}

	public int getSize() {
		return numberOfBuckets;
	}

	public boolean contains(int element) {
		int index = hashCodeIndex(element);
		PrimitiveIntSeperateChainingHashSetNode currentNode = bucket[index];
		while (currentNode != null) {
			if (index == currentNode.getElement()) {
				return true;
			}
			currentNode = currentNode.getNextNode();
		}
		return false;
	}
}
