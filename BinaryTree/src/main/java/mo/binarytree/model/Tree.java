package mo.binarytree.model;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	NodeTree initialtree;

	public Tree() {
		this.initialtree = null;
	}

	public ResultServiceOne insert(int valor, ResultServiceOne response, List<Node> listnodos, String primeraEjecucion) {
		if (this.initialtree == null) {
			this.initialtree = new NodeTree(valor);
		} else {
			Node n = new Node();
			if (primeraEjecucion.equals("N")) {
				n.setParentnumber(valor);
				listnodos.add(n);
				response.setNodos(listnodos);
			}
			this.initialtree.insertNode(valor, n);
		}
		return response;
	}

	public ResultServiceOne createTree(List<Integer> listnumber) {
		ResultServiceOne response = new ResultServiceOne();
		List<Node> listnodos = new ArrayList<Node>();
		String primeraEjecucion = "S";
		for (int numero : listnumber) {
			if (primeraEjecucion.equals("S")) {
				Node node = new Node();
				node.setParentnumber(numero);
				node.setLocation("RAIZ");
				response.setRootdata(node);
				primeraEjecucion = "S";
			}
			response = insert(numero, response, listnodos, primeraEjecucion);
			primeraEjecucion = "N";
		}
		return response;
	}

	public ResultServiceTwo searchfor(List<Integer> listnumber, int numeroUno, int numeroDos) {
		ResultServiceTwo answercreatetree = new ResultServiceTwo();
		ResultServiceOne response=createTree(listnumber);
		answercreatetree.setTreecreate(response);
		answercreatetree.setAncestornode("Ancestro común más cercano:  "+ lowestCommonAncestor(this.initialtree, numeroUno, numeroDos));
		return answercreatetree;

	}

	private int lowestCommonAncestor(NodeTree noderoot, int numeroone, int numerotwo) {
		if (noderoot == null)
			return 0;
		if (noderoot.getValue() == numeroone || noderoot.getValue() == numerotwo)
			return noderoot.getValue();

		int left = lowestCommonAncestor(noderoot.getLeftnode(), numeroone, numerotwo);
		int right = lowestCommonAncestor(noderoot.getRightnode(), numeroone, numerotwo);

		if (left != 0 && right != 0)
			return noderoot.getValue();
		if (left == 0)
			return right;
		else
			return left;
	}

}
