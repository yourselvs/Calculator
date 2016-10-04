package testing;

import org.junit.Test;

import calculator.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void testInitializer() {
		boolean pass = true;
		
		Calculator calc1 = new Calculator(10, 20);
		
		double displayVal = calc1.getDisplayVal();
		if(displayVal != 10) {
			System.out.println("calc1 display val: " + displayVal);
			pass = false;
		}
		
		String displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("10")){
			System.out.println("calc1 display str: " + displayStr);
			pass = false;
		}
		
		double referenceVal = calc1.getReferenceVal();
		if(referenceVal != 20){
			System.out.println("calc1 reference val: " + referenceVal);
			pass = false;
		}
		
		Calculator calc2 = new Calculator();
		
		displayVal = calc2.getDisplayVal();
		if(displayVal != 0) {
			System.out.println("calc2 display val: " + displayVal);
			pass = false;
		}
		
		displayStr = calc2.getDisplayStr();
		if(!displayStr.equals("0")){
			System.out.println("calc2 display str: " + displayStr);
			pass = false;
		}
		
		referenceVal = calc2.getReferenceVal();
		if(referenceVal != 0){
			System.out.println("calc2 reference val: " + referenceVal);
			pass = false;
		}
		
		assertTrue(pass);
	}
	
	@Test
	public void testConcatDisplay() {
		boolean pass = true;
		
		Calculator calc1 = new Calculator();
		
		calc1.concatDisplayStr('2');
		
		String displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("2")){
			System.out.println("concat 1 display str: " + displayStr);
			pass = false;
		}
		
		double displayVal = calc1.getDisplayVal();
		if(displayVal != 2){
			System.out.println("concat 1 display val: " + displayVal);
			pass = false;
		}
		
		calc1.concatDisplayStr('3');
		
		displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("23")){
			System.out.println("concat 2 display str: " + displayStr);
			pass = false;
		}
		
		displayVal = calc1.getDisplayVal();
		if(displayVal != 23){
			System.out.println("concat 2 display val: " + displayVal);
			pass = false;
		}
		
		calc1.concatDisplayStr('.');
		
		displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("23.")){
			System.out.println("concat 3 display str: " + displayStr);
			pass = false;
		}
		
		displayVal = calc1.getDisplayVal();
		if(displayVal != 23){
			System.out.println("concat 3 display val: " + displayVal);
			pass = false;
		}
		
		calc1.concatDisplayStr('.');
		
		displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("23.")){
			System.out.println("concat 4 display str: " + displayStr);
			pass = false;
		}
		
		displayVal = calc1.getDisplayVal();
		if(displayVal != 23){
			System.out.println("concat 4 display val: " + displayVal);
			pass = false;
		}
		
		calc1.concatDisplayStr('8');
		
		displayStr = calc1.getDisplayStr();
		if(!displayStr.equals("23.8")){
			System.out.println("concat 5 display str: " + displayStr);
			pass = false;
		}
		
		displayVal = calc1.getDisplayVal();
		if(displayVal != 23.8){
			System.out.println("concat 5 display val: " + displayVal);
			pass = false;
		}
		
		assertTrue(pass);
	}
}
