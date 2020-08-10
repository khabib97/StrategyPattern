package com.khabib.pattern.duck;

import com.khabib.patten.duck.strategies.*;

public class CityDuck extends Duck{
	
	public CityDuck() {
		duckFlyStrategy = new ConcreteRegularFlyStrategy();
		duckQuackStrategy = new ConcreteMildQuackStrategy();
	}
	
	@Override
	public void display() {
		System.out.println("City Duck");
	}
	
	

}
