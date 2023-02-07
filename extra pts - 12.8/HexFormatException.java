package Long_Exam_1;

public class HexFormatException extends NumberFormatException {
	public HexFormatException(String hex) {
		super(hex + " is not a hex string");
	} 
}
