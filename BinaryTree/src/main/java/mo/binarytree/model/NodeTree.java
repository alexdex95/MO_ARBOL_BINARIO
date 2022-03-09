package mo.binarytree.model;

public class NodeTree {

	private int value;
	private NodeTree rightnode;
	private NodeTree leftnode;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public NodeTree getRightnode() {
		return rightnode;
	}

	public void setRightnode(NodeTree rightnode) {
		this.rightnode = rightnode;
	}

	public NodeTree getLeftnode() {
		return leftnode;
	}

	public void setLeftnode(NodeTree leftnode) {
		this.leftnode = leftnode;
	}

	public NodeTree(int index) {
		this.value = index;
		this.rightnode = null;
		this.leftnode = null;
	}

	public Node insertNode(int valor, Node n) {

		if (valor < this.value) {
			if (this.leftnode == null) {
				this.leftnode = new NodeTree(valor);
				n.setParentnumber(this.value);
				n.setLocation("IZQUIERDA");
				n.setSonnumber(valor);
			} else {
				this.leftnode.insertNode(valor, n);
			}
		} else {
			if (this.rightnode == null) {
				this.rightnode = new NodeTree(valor);
				n.setParentnumber(this.value);
				n.setLocation("DERECHA");
				n.setSonnumber(valor);
			} else {
				this.rightnode.insertNode(valor, n);
			}
		}
		return n;
	}

}
