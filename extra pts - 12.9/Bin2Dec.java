package Long_Exam_1;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String bin = sc.nextLine();
        
        try {
            System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! String is not a binary string.");
            nfe.printStackTrace();
        }
    }

    public static int bin2Dec(String binaryString) {
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)) {
            throw new BinaryFormatException(binaryString);
        }
        char[] binChars = binaryString.toCharArray();

        for (int i = binChars.length - 1, binaryIndex = 0; i >= 0; i--, binaryIndex++) {
            decimalValue += getBinaryValue(binChars[i], binaryIndex);
        }
        return decimalValue;
    }

    static boolean checkBinaryChars(String binaryString) {
        char[] binStrValues = binaryString.toCharArray();
        for (char x : binStrValues) {
            if (x != '0' && x != '1') {
                return false;
            }
        }
        return true;
    }

    static int getBinaryValue(char binaryChar, int index) {
        int weight = (int) Math.pow(2, index);
        if (binaryChar == '1') {
            return weight;
        }
        return 0;
    }

}