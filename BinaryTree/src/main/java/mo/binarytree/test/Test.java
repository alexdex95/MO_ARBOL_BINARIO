package mo.binarytree.test;

import java.util.ArrayList;
import java.util.List;

import mo.binarytree.model.ResultServiceOne;
import mo.binarytree.model.ResultServiceTwo;
import mo.binarytree.model.Tree;

public class Test {

	public static void main(String[] args) {
		Tree arbol = new Tree();
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(67);
		listaNumeros.add(39);
		listaNumeros.add(76);
		listaNumeros.add(28);
		listaNumeros.add(44);
		listaNumeros.add(74);
		listaNumeros.add(85);
		listaNumeros.add(29);
		listaNumeros.add(83);
		listaNumeros.add(87);

		System.out.println("******CREACION DE ARBOL*****************************");
		ResultServiceOne responseService = arbol.createTree(listaNumeros);
		responseService.getRootdata();
		System.out.println("");
		System.out.println("******CREACION DE ARBOL Y BUSQUEDA DE VALOR*********");
		ResultServiceTwo responseService2 = arbol.searchfor(listaNumeros, 29, 44);
		System.out.println(responseService2);

	}

}
