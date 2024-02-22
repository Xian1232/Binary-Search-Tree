package Main;



class Node {   //Class that holds the current value as well as Left and Right nodes
	
	public Entry Value;
	public Node Left;
	public Node Right;
	
	public Node(Entry entry) {
		Value = entry;
		Left = null;
		Right = null;
	}
	
	void print(int indent) {  //Prints out the BST in the desired format
		for (int i = 0; i < indent; i++) {
			System.out.print("   ");
		}
		
		System.out.print("+---");
		System.out.println(this.Value.Key + ", " + this.Value.lineOfText);
	
		if (this.Left == null) {
		}
		else {
			this.Left.print(indent + 1);
		}
		
		if (this.Right == null) {
		}
		else {
			this.Right.print(indent + 1);
		}
	}
	
	
	void add(Entry entry) {                 //Adds the Key-Value Pair to nodes depending if it is lesser or greater than 
		if (entry.Key < this.Value.Key) {   //the current value
			if (this.Left != null) {
				Left.add(entry);
			}
			else {
				Left = new Node(entry);
			}
		}
		
		if (entry.Key > this.Value.Key) {
			if (this.Right != null) {
				Right.add(entry);
			}
			else {
				Right = new Node(entry);
			}
		}
		
	}
	
	String find(int Key) {              //Recurses through the BST in search of the desired Key
		if (this.Value.Key == Key) {	//and returns the lineOfText Value
			return this.Value.lineOfText;
		}
		else if (this.Value.Key > Key) { 
				if (this.Left != null) {
					return this.Left.find(Key);
				}
			}
			else {
				if (this.Right != null) {
					return this.Right.find(Key);
				}
			}

			return "This Key doesn't exist!";
	}
}

