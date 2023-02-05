package Long_Exam_1;

public class Chapter12No6 {
    public static void main(String[] args) {
        
    java.util.Scanner sc = new java.util.Scanner(System.in);
        
    try {
        System.out.print("Enter a hex: ");
        String inputHex = sc.next();
        System.out.println("The decimal value for a hex " + inputHex + " is " + hexToDecimal(inputHex.toUpperCase()));
    } 
    catch (NumberFormatException nofe) {
        System.out.println("Error! Input is not a hex.");
        nofe.printStackTrace();   
    }
}
    
    static boolean checkHex(char ch) {
        return ch >= '0' && ch <= 'F';
    }
    
    public static int hexToDecimal(String hex) {
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
        char hexChar = hex.charAt(i);
        if (checkHex(hexChar)) {
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        else {
           throw new NumberFormatException(hex);
           }
     }
    return decimalValue;
  }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } 
        else {
            return ch - '0';
        }
    }
}

