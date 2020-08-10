package com.khabib.pattern.duck;

import com.khabib.pattern.duck.strategies.*;

public class MountainDuck extends Duck{

	public MountainDuck() {
		duckFlyStrategy = new ConcreteRegularFlyStrategy();
		duckQuackStrategy = new ConcreteMildQuackStrategy();
	}
	
	@Override
	public void display() {
		System.out.print("Mountain Duck");
	}

}
