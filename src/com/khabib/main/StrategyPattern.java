package com.khabib.main;

import java.util.Scanner;

import com.khabib.pattern.duck.Duck;
import com.khabib.pattern.duck.RubberDuck;
import com.khabib.pattern.math.MathContext;
import com.khabib.pattern.math.strategies.ConcreteAddStrategy;
import com.khabib.pattern.math.strategies.ConcreteDivisonStrategy;
import com.khabib.pattern.math.strategies.ConcreteMultiplyStrategy;
import com.khabib.pattern.math.strategies.ConcreteSubStrategy;

public class StrategyPattern {

	public static void main(String[] args) {
		mathPatterCheck();
		//duckPatterCheck();
	}
	
	private static void duckPatterCheck() {
		Duck rubberDuck = new RubberDuck();
		
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.quack();
		rubberDuck.swim();
	}

	private static void mathPatterCheck() {
		MathContext mathContext = new MathContext();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();

		System.out.println("a = add, s = sub, m = mul, d = div");
		String action = scanner.next();

		if (action.equals("a")) {
			mathContext.setMathStrategy(new ConcreteAddStrategy());
		} else if (action.equals("s")) {
			mathContext.setMathStrategy(new ConcreteSubStrategy());
		} else if (action.equals("m")) {
			mathContext.setMathStrategy(new ConcreteMultiplyStrategy());
		} else if (action.equals("d")) {
			mathContext.setMathStrategy(new ConcreteDivisonStrategy());
		}

		System.out.println("Result " + mathContext.executeStategy(number1, number2));
	}

}
