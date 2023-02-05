
package jan10.pkg2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jan102023 {

    public static void main(String[] args) {
        BufferedReader objReader = null;
		try { 
			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("C:\\Users\\Ella\\Desktop\\jan10 2023\\src\\jan10\\pkg2023\\text.txt"));

			int sum = 0;
                        int line_counter = 0;
			while ((strCurrentLine = objReader.readLine()) != null) {

				// Split the lines into array.
				// NOTE: The value inside the .split() depends on how
				// you are going to split the values.
				String[] striArray = strCurrentLine.split("( )|(,)");
                                
                                line_counter++;
                                System.out.println("line: " + line_counter);
                                
                                

				// Loop all elements in array.
				for (String num : striArray) {
					System.out.println(num);

					// Convert string into integer.
					int temp = Integer.parseInt(num);
					sum += temp;
				}
			}

			System.out.println("sum: " + sum);
		} catch (IOException e) { 

			e.printStackTrace();

		}
    }
    
}
