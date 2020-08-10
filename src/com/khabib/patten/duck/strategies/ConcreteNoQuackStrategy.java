package com.khabib.patten.duck.strategies;

public class ConcreteNoQuackStrategy implements DuckQuackStrategy {

	@Override
	public void quack() {
		System.out.println("This duck can not quack");
	}

}
