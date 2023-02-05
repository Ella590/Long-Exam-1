package Long_Exam_1;

public class PhoneKeypads {
    
    public static void main (String []args){
         java.util.Scanner sc = new java.util.Scanner(System.in);
          
          System.out.print ( " Enter a String:" );
            String string1 = sc.nextLine();
            
            for (int i = 0; i < string1.length(); i++){
                     
                    if (Character.isLetter(string1.charAt(i)))
                           System.out.print(getNumber(Character.toUpperCase(string1.charAt(i))));
                    else System.out.print(string1.charAt(i)) ;
            
    }
             
    }
            public static int getNumber (char uppercaseletter){
                if (uppercaseletter >= 'W')
                    return 9;
                else if (uppercaseletter >= 'T')
			return 8;
		else if (uppercaseletter >= 'P')
			return 7;
		else if (uppercaseletter >= 'M')
			return 6;
		else if (uppercaseletter >= 'J')
			return 5;
		else if (uppercaseletter >= 'G')
			return 4;
		else if (uppercaseletter >= 'D')
			return 3;
		else 
			return 2;
                 
            }
}

