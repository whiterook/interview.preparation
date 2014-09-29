package com.splotnikov.algorithms.puzzles.pairs;

import java.util.ArrayList;

public class Tree {
	
	private ArrayList<Node> roots;
	
	public ArrayList<Node> getRoots(){
		return this.roots;
	}
	
	public void addRoot(Node root){
		roots.add(root);
	}
	
	public Tree(){
		roots = new ArrayList<Node>();
	}
	
	public void print(){
		ArrayList<Node> roots = getRoots();
		for (Node root : roots) {
			print(root, 1);
		}
	}

	private void print(Node currentNode, int depth) {
		String str= String.format("%" + depth * 3 + "s"," ") + currentNode.getName();
		System.out.println(str);
		ArrayList<Node> nodes = currentNode.getChildren();
		for (Node childNode : nodes) {
			print(childNode, depth + 1);
		}
	}

}
