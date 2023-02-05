package Long_Exam_1;

public class UpperCase {
    public static void main (String []args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a Sentence/Word: " );
        String n = sc.nextLine();
        int upper = 0;
        for (int i = 0; i < n.length(); i++){
            
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
        }  
    System.out.println("Number of uppercase letter: " + upper);
    }
}
