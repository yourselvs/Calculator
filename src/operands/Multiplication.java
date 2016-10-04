package operands;

import java.math.BigDecimal;

import calculator.Calculator;
import calculator.Operand;

public class Multiplication implements Operand {
	public Multiplication() {
		
	}

	@Override
	public Calculator operate(Calculator calc) {
		BigDecimal val = calc.getDisplayVal().multiply(calc.getReferenceVal());
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
