package com.khabib.pattern;

import java.util.Scanner;

import com.khabib.pattern.math.strategies.*;

public class StrategyPattern {

	public static void main(String[] args) {
		
		MathContext mathContext = new MathContext();
		
		Scanner scanner = new Scanner(System.in);
		
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		
		System.out.println("a = add, s = sub, m = mul, d = div");
		String action = scanner.next();
		
		
		if(action.equals("a")) {
			mathContext.setMathStrategy(new ConcreteAddStrategy());
		}
		else if(action.equals("s")) {
			mathContext.setMathStrategy(new ConcreteSubStrategy());
		}
		else if(action.equals("m")) {
			mathContext.setMathStrategy(new ConcreteMultiplyStrategy());
		}
		else if(action.equals("d")) {
			mathContext.setMathStrategy(new ConcreteDivisonStrategy());
		}
		
		System.out.println("Result "+ mathContext.executeStategy(number1, number2));
	}

}
