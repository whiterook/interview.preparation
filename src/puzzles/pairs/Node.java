package puzzles.pairs;

import java.util.ArrayList;

public class Node {

	private String name;
	private Node parent;
	private ArrayList<Node> children;
	
	public Node(String name){
		this.name = name;
		this.children = new ArrayList<Node>();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
	
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	public Node addChild(String childName){
		Node child = new Node(childName);
		addChild(child);
		return child;
	}
	
	public void addChild(Node node){
		children.add(node);
		node.setParent(this);
	}
}
