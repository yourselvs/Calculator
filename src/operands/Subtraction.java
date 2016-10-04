package operands;

import java.math.BigDecimal;

import calculator.Calculator;
import calculator.Operand;

public class Subtraction implements Operand {
	
	
	public Subtraction() {
	}

	@Override
	public Calculator operate(Calculator calc) {
		BigDecimal referenceVal = calc.getReferenceVal();
		BigDecimal displayVal = calc.getDisplayVal();
		BigDecimal val = referenceVal.subtract(displayVal);
		calc.setReferenceVal(calc.getDisplayVal());
		calc.setDisplayStr(val + "");
		return calc;
	}

	@Override
	public Calculator press(Calculator calc) {
		calc.setReferenceVal(calc.getOperandState().operate(calc).getDisplayVal());
		calc.setDisplayStr(0 + "");
		calc.setOperandState(this);
		return calc;
	}
}
