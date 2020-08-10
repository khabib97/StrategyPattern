package com.khabib.pattern.duck;

import com.khabib.patten.duck.strategies.*;

public abstract class Duck {
	
	protected DuckFlyStrategy duckFlyStrategy;
	protected DuckQuackStrategy duckQuackStrategy;
	
	public abstract void display();
	
	public void swim() {
		 System.out.println("All ducks float!");
	}
	
	public void setFlyStrategy(DuckFlyStrategy duckFlyStrategy) {
		this.duckFlyStrategy = duckFlyStrategy;
	}
	
	public void setQuackStrategy(DuckQuackStrategy duckQuackStrategy) {
		this.duckQuackStrategy = duckQuackStrategy;
	}
	
	public void quack() {
		duckQuackStrategy.quack();
	}
	
	public void fly() {
		duckFlyStrategy.fly();
	}

}
