package com.splotnikov.algorithms.tests;

import org.junit.Test;

import com.splotnikov.algorithms.binarytree.BinaryTree;

public class BinaryTreeTests {

	@Test
	public void inOrderTreverseTests(){
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");
		theTree.addNode(85, "Salesman 1");		
		
		theTree.inOrderTreverseTree(theTree.getRoot());
	}
}
