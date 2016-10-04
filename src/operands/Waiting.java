package operands;

import calculator.Calculator;
import calculator.Operand;

public class Waiting implements Operand{
	public Waiting() {
		
	}

	@Override
	public Calculator operate(Calculator calc) {
		return calc;
	}

	@Override
	public Calculator press(Calculator calc) {
		return calc;
	}
}
