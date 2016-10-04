package operands;

import java.math.BigDecimal;

import calculator.Calculator;
import calculator.Operand;

public class Inverse implements Operand {
	public Inverse() {
		
	}

	@Override
	public Calculator operate(Calculator calc) {
		return calc;
	}

	@Override
	public Calculator press(Calculator calc) {
		BigDecimal val = new BigDecimal(1).divide(calc.getDisplayVal());
		calc.setReferenceVal(new BigDecimal(0));
		calc.setDisplayStr(val + "");
		calc.setOperandState(this);
		return calc;
	}
}
