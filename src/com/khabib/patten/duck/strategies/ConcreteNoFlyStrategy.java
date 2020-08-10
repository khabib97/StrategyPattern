package com.khabib.patten.duck.strategies;

public class ConcreteNoFlyStrategy implements DuckFlyStrategy {

	@Override
	public void fly() {
		System.out.println("This duck can not fly");

	}

}
