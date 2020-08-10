package com.khabib.pattern.duck;

import com.khabib.patten.duck.strategies.*;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		duckFlyStrategy = new ConcreteNoFlyStrategy();
		duckQuackStrategy = new ConcreteNoQuackStrategy();
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}

}
