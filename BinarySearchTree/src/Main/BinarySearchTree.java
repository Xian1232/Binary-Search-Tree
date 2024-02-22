package Main;

class BinarySearchTree {
	private Node Root;   //Root for the BST
	
	public BinarySearchTree() {	
		Root = null;
	}
	
	String about() {   //Tells a little about myself
		return "My name is Chrsitian Young. I am a Junior CS major at CSUS.";
	}
	
	void print() {   //If the root is null, it will create a new root and print it out
		if (Root != null) { //Root.equals(null)) {
			Root.print(0);

		}
	}
	
	public void add(Entry entry) {  //Creates a new Root node if the Root is null
		if (Root == null) {
			Root = new Node(entry);
		}
		Root.add(entry);
	}
	
	String find(int Key) {  //If there is no root, it returns a string instead of the desired Key
		if (Root == null) {
			return "This key can't be found in this BST since there is no root.";
		}
		return Root.find(Key);
	}
}