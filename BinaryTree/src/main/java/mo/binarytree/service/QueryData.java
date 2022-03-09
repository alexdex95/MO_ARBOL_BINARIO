package mo.binarytree.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mo.binarytree.model.ResultServiceOne;
import mo.binarytree.model.ResultServiceTwo;
import mo.binarytree.model.Tree;

@Service
public class QueryData implements IqueryData {

	public ResultServiceOne getBinaryTree(List<Integer> listnumbers) {
		Tree tree = new Tree();
		return tree.createTree(listnumbers);
	}
	
	public ResultServiceTwo lookForAncestor(List<Integer> listnumbers, int numberOne,int numberTwo) {
		Tree tree = new Tree();
		return tree.searchfor(listnumbers, numberOne, numberTwo);
	}

}
