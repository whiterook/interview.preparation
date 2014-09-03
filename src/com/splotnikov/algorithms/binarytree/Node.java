package com.splotnikov.algorithms.binarytree;

public class Node {

	private int key;
	private String value;
	
	private Node leftChild;
	private Node rightChild;
	
	public void setKey(int key){
		this.key = key;
	}
	
	public int getKey(){
		return this.key;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public Node(int key, String value){
		setKey(key);
		setValue(value);
	}
	
	public String toString(){
		return 
				String.format("Key: %d, Value: %s", getKey(), getValue());
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
}
