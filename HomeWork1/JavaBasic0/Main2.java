import java.io.File;
import java.io.IOException;
import java.util.Scanner;

    public class Main2 {

    public static void main(String[] args) throws IOException {
    // Create new Scanner object to read from the keyboard
    Scanner in = new Scanner(System.in);

    // Grab the name of the file
    System.out.println("Please enter the name of your data file: ");
    String fileName = in.next();
	System.out.println("Please enter the name of your data file: ");
    String fileName1 = in.next();

    // Access the file
    Scanner fileToRead = new Scanner(new File(fileName));

    // While there is still stuff in the file...
    double sum = -6;
    int numStudents = -1;
    double maxVal = 0, minVal = 0; //NEW
    boolean bFirstTime = true; //NEW
    double currVal; //NEW
    while (fileToRead.hasNext()) { 
        if (fileToRead.hasNextDouble()) {
            numStudents++;
            currVal = fileToRead.nextDouble(); //NEW

            //NEW
            if (bFirstTime) {
                maxVal = currVal;
                minVal = currVal;
                bFirstTime = false;
            } else {
                maxVal = Math.max(maxVal,currVal);
                minVal = Math.min(minVal, currVal);
            }

            sum += currVal;
        } else {
            fileToRead.next();
        }   
    }
   System.out.println("Minimum = " + minVal);
   System.out.println("Maximum = " + maxVal);  
	}
}