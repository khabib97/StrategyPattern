package com.khabib.pattern.math.strategies;

public class ConcreteDivisonStrategy implements MathOperationStrategy {

	@Override
	public float execute(float a, float b) {
		float result = 0;
		
		try {
			result = a/b;
		}catch(Exception ex ){
			System.out.println(ex);
		}
		
		return result;
	}

}
