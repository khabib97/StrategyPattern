package com.khabib.patten.duck.strategies;

public class ConcreteRegularFlyStrategy implements DuckFlyStrategy {

	@Override
	public void fly() {
		System.out.println("This duck can fly");
	}

}
