package Long_Exam_1;

public class OutofMemoryException {
    public static void main (String[] args){
    int length = 1200000000;
    
    try {
        double[] array = new double [length];
    }
    catch (OutOfMemoryError ex) {
        System.out.println(ex.getMessage());
    }
    
        System.out.println("Error handled, program continues.");
    }
}

