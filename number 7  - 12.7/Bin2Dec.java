package Long_Exam_1;

public class Bin2Dec {
	public static void main  (String[] args){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            
            System.out.println ("Enter binary: ");
            String bin = sc.nextLine();
                      
        try{
            System.out.println("Decimal Equivalent: " + bin2Dec(bin));
         }
        catch(NumberFormatException ex){
            System.out.println("Error: Not Binary.");
            ex.printStackTrace();   
         }
      }
        
        public static boolean isBinary(String binary) {
            for (char ch : binary.toCharArray()) {
                if (ch != '1' && ch != '0')
                return false;
            }
            return true;
        }
        
        public static int bin2Dec(String binaryString) throws NumberFormatException {
        if (!isBinary(binaryString)) {
                throw new NumberFormatException(binaryString + " is not a binary number.");
            }
        int power = 0;
        int decimal = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
            decimal += Math.pow(2, power);
            }
            power++;    
        }
        return decimal;
     }
  }
        
