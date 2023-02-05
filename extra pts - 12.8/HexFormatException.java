package Long_Exam_1;

public class HexFormatException extends NumberFormatException {
	private final String hex; 

	public HexFormatException(String hex) {
		super(hex + " is not a hex string");
		this.hex = hex;
	} 

	public String getHex() {
		return hex;
	}
}
