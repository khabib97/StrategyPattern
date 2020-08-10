package com.khabib.patten.duck.strategies;

public class ConcreteMildQuackStrategy implements DuckQuackStrategy {

	@Override
	public void quack() {
		System.out.println("This duck quack beautifully");

	}

}
