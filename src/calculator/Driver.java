package calculator;

public class Driver {
	public static double parseDouble(String value) {
		double parsed = 0;
		
		parsed += Integer.parseInt(value.substring(0, value.indexOf('.')));
		
		String decimalStr = value.substring(value.indexOf('.') + 1, value.length());
		
		int decimalInt = Integer.parseInt(decimalStr);
		
		double decimalVal = decimalInt / Math.pow(10, decimalStr.length());
		
		parsed += decimalVal;
		
		return parsed;
	}
}
