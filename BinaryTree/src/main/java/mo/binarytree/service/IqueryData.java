package mo.binarytree.service;

import java.util.List;

import mo.binarytree.model.ResultServiceOne;
import mo.binarytree.model.ResultServiceTwo;

public interface IqueryData {

	public ResultServiceOne getBinaryTree(List<Integer> listnumbers);

	public ResultServiceTwo lookForAncestor(List<Integer> list, int numberOne,int numberTwo);

}
