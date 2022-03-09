package mo.binarytree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mo.binarytree.model.InputData;
import mo.binarytree.model.ResultServiceOne;
import mo.binarytree.model.ResultServiceTwo;
import mo.binarytree.service.IqueryData;

@RestController
@RequestMapping("/APIBinaryTree")
public class APIRestController {

	@Autowired
	private IqueryData iquerydata;

	@PostMapping("/getBinaryTree")
	public ResultServiceOne getBinaryTree(@ModelAttribute  InputData listnumbers) {
		return iquerydata.getBinaryTree(listnumbers.getListnumbers());
	}

	@GetMapping("/lookForAncestor")
	public ResultServiceTwo lookForAncestor(@ModelAttribute  InputData listnumbers,@RequestParam int numberOne, @RequestParam int numberTwo) {
		return iquerydata.lookForAncestor(listnumbers.getListnumbers(), numberOne,numberTwo);
	}
}