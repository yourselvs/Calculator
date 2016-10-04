package operands;

import java.math.BigDecimal;

import calculator.Calculator;
import calculator.Operand;

public class SquareRoot implements Operand{
	public SquareRoot() {
		
	}

	@Override
	public Calculator operate(Calculator calc) {
		return calc;
	}

	@Override
	public Calculator press(Calculator calc) {
		double val = Math.sqrt(calc.getDisplayVal().doubleValue());
		calc.setReferenceVal(new BigDecimal(0));
		calc.setDisplayStr(val + "");
		calc.setOperandState(this);
		return calc;
	}
}
