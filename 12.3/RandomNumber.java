package Long_Exam_1;

public class RandomNumber {

public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    int [] ar = getArray ();
    System.out.println("Enter the index of the Array: ");

    try {
        System.out.println("Element value: " + ar[sc.nextInt()]);
    }
    
    catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("Out of bounds");
    }
 }
     
    public static int [] getArray (){
    int [] ar = new int [100];
    
        for (int i = 0; i < ar.length; i++) {
            ar [i]= (int)(Math.random()*100)+1;
         }
        
        return ar;
    }
}

