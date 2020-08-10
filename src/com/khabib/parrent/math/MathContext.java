package com.khabib.parrent.math;

import com.khabib.pattern.math.strategies.MathOperationStrategy;

public class MathContext {
	
	private MathOperationStrategy mathOpStrategy;
	
	public void setMathStrategy(MathOperationStrategy mathOperationStrategy) {
		this.mathOpStrategy = mathOperationStrategy;
	}
	
	public float executeStategy(float a, float b) {
		return mathOpStrategy.execute(a, b);
	}

}
