package calculator;

public interface Operand {
	public Calculator operate(Calculator calc);
	public Calculator press(Calculator calc);
}
