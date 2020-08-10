package com.khabib.pattern.math.strategies;

public class ConcreteMultiplyStrategy implements MathOperationStrategy {

	@Override
	public float execute(float a, float b) {
		return a*b;
	}

}
