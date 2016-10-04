package testing;

import org.junit.Test;

import calculator.Calculator;
import operands.Addition;
import operands.Division;
import operands.Inverse;
import operands.Multiplication;
import operands.SquareRoot;
import operands.Subtraction;

import static org.junit.Assert.*;

public class OperandTest {
	private static Addition addition = new Addition();
	private static Subtraction subtraction = new Subtraction();
	private static Multiplication multiplication= new Multiplication();
	private static Division division = new Division();
	private static SquareRoot squareRoot = new SquareRoot();
	private static Inverse inverse = new Inverse();
	
	@Test
	public void testOperandAddition() {
		boolean pass = true;
		
		Calculator calc = new Calculator(10, 0);
		
		calc = addition.press(calc);
		
		calc.concatDisplay('2');
		
		calc = calc.pressEquals();
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("12")){
			pass = false;
			System.out.println(displayStr);
		}
		
		calc.concatDisplay('5');
		
		calc = addition.press(calc);
		
		calc.concatDisplay('4');
		calc.concatDisplay('.');
		calc.concatDisplay('.');
		calc.concatDisplay('5');
		
		calc = calc.pressEquals();
		
		displayStr = calc.getDisplayStr();
		if(!displayStr.equals("9.5")){
			pass = false;
			System.out.println(displayStr);
		}
		assertTrue(pass);
	}
	
	@Test
	public void testOperandSubtraction() {
		boolean pass = true;
		
		Calculator calc = new Calculator(10, 0);
		
		calc = subtraction.press(calc);
		
		calc.concatDisplay('2');
		
		calc = calc.pressEquals();
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("8")){
			pass = false;
			System.out.println(displayStr);
		}
		
		calc.concatDisplay('8');
		calc.concatDisplay('.');
		calc.concatDisplay('2');
		
		calc = subtraction.press(calc);
		
		calc.concatDisplay('5');
		calc.concatDisplay('.');
		calc.concatDisplay('1');
		calc.concatDisplay('5');
		
		calc = calc.pressEquals();
		
		displayStr = calc.getDisplayStr();
		if(!displayStr.equals("3.05")){
			pass = false;
			System.out.println(displayStr);
		}
		
		assertTrue(pass);
	}
	
	@Test
	public void testOperandMultiplication() {
		boolean pass = true;
		
		Calculator calc = new Calculator(10.5, 0);
		
		calc = multiplication.press(calc);
		
		calc.concatDisplay('2');
		calc.concatDisplay('.');
		calc.concatDisplay('3');
		calc.concatDisplay('2');
		
		calc = calc.pressEquals();
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("24.36")){
			pass = false;
			System.out.println(displayStr);
		}
		
		assertTrue(pass);
	}
	
	@Test
	public void testOperandDivision() {
		boolean pass = true;
		
		Calculator calc = new Calculator(98.2, 0);
		
		calc = division.press(calc);
		
		calc.concatDisplay('.');
		calc.concatDisplay('2');
		
		calc = calc.pressEquals();
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("491")){
			pass = false;
			System.out.println(displayStr);
		}
		
		assertTrue(pass);
	}
	
	@Test
	public void testOperandSqrt() {
		boolean pass = true;
		
		Calculator calc = new Calculator(4, 0);
		
		calc = squareRoot.press(calc);
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("2")){
			pass = false;
			System.out.println(displayStr);
		}
		
		assertTrue(pass);
	}
	
	@Test
	public void testOperandInverse() {
		boolean pass = true;
		
		Calculator calc = new Calculator(4, 0);
		
		calc = inverse.press(calc);
		
		String displayStr = calc.getDisplayStr();
		if(!displayStr.equals("0.25")){
			pass = false;
			System.out.println(displayStr);
		}
		
		assertTrue(pass);
	}
}
