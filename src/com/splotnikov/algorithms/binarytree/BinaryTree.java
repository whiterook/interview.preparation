package com.splotnikov.algorithms.binarytree;

public class BinaryTree {

	private Node root;
	
	public void setRoot(Node root){
		this.root = root;
	}
	
	public Node getRoot(){
		return this.root;
	}
	
	
	public void addNode(int key, String value){
		
		Node newNode = new Node(key, value);
		Node parentNode = findParent(key);
		if(parentNode == null){
			setRoot(newNode);
		}
		else{
			if(key < parentNode.getKey()){
				parentNode.setLeftChild(newNode);
			}
			else{
				parentNode.setRightChild(newNode);
			}
		}
	}
	
	private Node findParent(int key){
		if(getRoot() == null)
			return null;
		
		Node currentNode = getRoot();
		
		while(true){
			if(key < currentNode.getKey()){
				if(currentNode.getLeftChild() == null){
					return currentNode;
				}
				else{
					currentNode = currentNode.getLeftChild();
				}
			}
			else{
				if(currentNode.getRightChild() == null){
					return currentNode;
				}
				else{
					currentNode = currentNode.getRightChild();
				}
			}
		}
	}
	
	public void inOrderTreverseTree(Node node){
		if(node != null){
			inOrderTreverseTree(node.getLeftChild());
			System.out.println(node);
			inOrderTreverseTree(node.getRightChild());
		}
	}
}
