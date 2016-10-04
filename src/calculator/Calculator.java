package calculator;

import java.math.BigDecimal;

import operands.Waiting;

public class Calculator {
	private Operand operandState;
	
	private String displayStr;
	private BigDecimal displayVal;
	private BigDecimal referenceVal;
	
	private boolean pressedEquals;
	
	public Calculator(double displayVal, double referenceVal){
		this.operandState = new Waiting();
		this.setDisplayStr("" + displayVal);
		this.setReferenceVal(BigDecimal.valueOf(referenceVal));
	}
	
	public Calculator(){
		this.operandState = new Waiting();
		this.setDisplayStr("0");
		this.setReferenceVal(new BigDecimal(0));
	}

	public BigDecimal getDisplayVal() {
		return displayVal;
	}
	
	public String getDisplayStr() {
		return displayStr;
	}
	
	public void concatDisplay(char concatVal) {
		if(concatVal == '.' && displayStr.indexOf('.') != -1){
			return;
		}
		if(pressedEquals){
			setDisplayStr("0");
			setReferenceVal(new BigDecimal(0));
			pressedEquals = false;
		}	
		if(displayStr == "0" && concatVal != '.') {
			displayStr = "" + concatVal;
		}
		else{
			displayStr += concatVal;
		}
		displayVal = BigDecimal.valueOf(Double.parseDouble(displayStr));
	}
	
	public void setDisplayStr(String str) {
		displayVal = BigDecimal.valueOf(Double.parseDouble(str));
		
		if(displayVal.doubleValue() % 1 == 0) {
			if(str.indexOf('.') >= 0) {
				str = str.substring(0, str.indexOf('.'));
			}
		}
		else {
			while(str.lastIndexOf('0') == str.length() - 1) {
				str = str.substring(0, str.length() - 1);
			}
		}
		
		displayStr = str;
	}

	public BigDecimal getReferenceVal() {
		return referenceVal;
	}

	public void setReferenceVal(BigDecimal referenceVal) {
		this.referenceVal = referenceVal;
	}
	
	public Operand getOperandState() {
		return operandState;
	}
	
	public void setOperandState(Operand state) {
		operandState = state;
	}
	
	public Calculator pressEquals() {
		Calculator calc = operandState.operate(this);
		pressedEquals = true;
		calc.displayVal = new BigDecimal(0);
		calc.setReferenceVal(new BigDecimal(0));
		calc.setOperandState(new Waiting());
		return calc;
	}
	
	public boolean pressedEquals() {
		return pressedEquals;
	}
	
	public void setPressedEquals(boolean pressedEquals) {
		this.pressedEquals = pressedEquals;
	}
	
	public void pressClear() {
		setDisplayStr("0");
		setReferenceVal(new BigDecimal(0));
		setOperandState(new Waiting());
	}
	
	public void pressClearEquation() {
		setDisplayStr("0");
	}
}
