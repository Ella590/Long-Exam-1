package Long_Exam_1;

import java.util.*;

public class InputMismatch {
    public static void main(String[] args) throws Exception {
    java.util.Scanner sc = new java.util.Scanner(System.in);


    System.out.println("Enter TWO valid INTEGERS: ");
   
    boolean input = true;


    while(input){
        try {          
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();

            int sum =  input1 + input2;
            System.out.println("The sum of " + input1 + " and " + input2
            + " is " + sum);

            input = false;
        } catch (InputMismatchException ex) {
            System.out.println("Please check if the number is a valid INTEGER :)");
            sc.nextLine();
        }
    }
    }
}

