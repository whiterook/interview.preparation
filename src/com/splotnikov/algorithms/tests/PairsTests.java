package com.splotnikov.algorithms.tests;

import org.junit.Test;

import com.splotnikov.algorithms.puzzles.pairs.Node;
import com.splotnikov.algorithms.puzzles.pairs.Tree;

public class PairsTests {

	private Tree tree;

	/*
	Animal, Dog
	Animal, Cat
	Bird, Parrot
	Plant, Tree
	Plant, Grass
	Animal, Bird
	Lifeform, Plant
	Lifeform, Animal
	
	Lifeform
	Animal
		Dog
		Cat
		Bird
			Parrot
	Plant
		Tree
		Grass	
	*/
	
	private void fillTree(){
		tree = new Tree();
		
		Node lifeForm = new Node("LifeForm");
		Node plant = new Node("Plant");
		Node animal = new Node("Animal");
		lifeForm.addChild(plant);
		lifeForm.addChild(animal);
		
		
		animal.addChild("Dog");
		animal.addChild("Cat");
		Node bird = new Node("Bird");
		animal.addChild(bird);
		bird.addChild("Parrot");
		
		plant.addChild("Tree");
		plant.addChild("Grass");
		
		tree.addRoot(lifeForm);
	}
	
	@Test
	public void printTest(){
		fillTree();
		tree.print();
	}
}
