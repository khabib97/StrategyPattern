package com.khabib.pattern.duck.strategies;

public class ConcreteRegularFlyStrategy implements DuckFlyStrategy {

	@Override
	public void fly() {
		System.out.println("This duck can fly");
	}

}
