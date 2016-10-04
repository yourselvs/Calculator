package calculator;

public class Calculator {
	private Operand operandState;
	
	private String displayStr;
	private double displayVal;
	private double referenceVal;
	
	private boolean useDecimalState;
	
	public Calculator(int displayVal, int referenceVal){
		this.setDisplayStr("" + displayVal);
		this.setReferenceVal(referenceVal);
	}
	
	public Calculator(){
		this.setDisplayStr("0");
		this.setReferenceVal(0);
	}

	public double getDisplayVal() {
		return displayVal;
	}
	
	public String getDisplayStr() {
		return displayStr;
	}
	
	public void concatDisplayStr(char concatVal) {
		if(displayStr == "0") {
			displayStr = "" + concatVal;
		}
		else{
			if(concatVal == '.') {
				if(!useDecimalState){
					useDecimalState = true;
				}
				else{
					return;
				}
			}
		
			displayStr += concatVal;
		}
		displayVal = Double.parseDouble(displayStr);
	}
	
	public void setDisplayStr(String str) {
		displayStr = str;
		displayVal = Double.parseDouble(displayStr);
	}

	public double getReferenceVal() {
		return referenceVal;
	}

	public void setReferenceVal(double referenceVal) {
		this.referenceVal = referenceVal;
	}
}
