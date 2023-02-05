package Long_Exam_1;

public class CommonPrefix {
    public static void main ( String [] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print ( " Enter a Sentence:" );
            String n1 = sc.nextLine();
        System.out.print ( " Enter a Sentence:" );
            String n2 = sc.nextLine();
            
            int number = 0;
            String prefix = "";
            
            while (n1.charAt(number) == n2.charAt(number)) {
                    prefix += n1.charAt(number);
                    number++;
           
    }
            if (prefix.length() > 0)  
                    System.out.println("Common prefix is: " + prefix);
            else    
                   System.out.println(n1 + " and " + n2 + " has no common prefix."); 
}
}

