package com.khabib.pattern.math.strategies;

public class ConcreteAddStrategy implements MathOperationStrategy {

	@Override
	public float execute(float a, float b) {
		return a+b;
	}

}
