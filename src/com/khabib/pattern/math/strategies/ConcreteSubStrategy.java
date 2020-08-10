package com.khabib.pattern.math.strategies;

public class ConcreteSubStrategy implements MathOperationStrategy {

	@Override
	public float execute(float a, float b) {
		return a-b;
	}

}
