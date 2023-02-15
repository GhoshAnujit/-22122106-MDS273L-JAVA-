package Lab3;
//importing the necessary packages
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class STATOP {
    public static void main(String[] args) {
        //Taking input for the array from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("The elements are:");
        System.out.println(Arrays.toString(myArray));
        //calling the final function
        code(myArray);
    }
    //method for mean of the given array
    public static void mean(int[] myArray) {
        int length = myArray.length;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            average = sum / length;}
        System.out.println("Mean of the array:" + average);
        
    }
    //method for median of the array
    public static double median(int myArray[]) {
        Arrays.sort(myArray);
        int length  = myArray.length;
        if(length % 2 != 0)
                return (double)myArray[length/2];
        return (double)(myArray[(length-1)/2] + myArray[length/2])/ 2.0;
    }
    //method for mode of the array
    public static void mode( int[] myArray ) {

        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int max  = 1;        // frequency
        int max_value = 0;   // max value

        for(int i = 0; i < myArray.length; i++) {
            if (h.get(myArray[i]) != null) {
                int current = h.get(myArray[i]);
                current++;
                h.put(myArray[i], current);

                if(current > max) {
                    max  = current;
                    max_value = myArray[i];
                }
            }
            else
                h.put(myArray[i],1);
        }
        System.out.println(max_value);
    }
    //method calling all the other functions
    public static void code(int[] myArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: Mean(1)/Median(2)/Mode(3)");
        int choice = sc.nextInt();

        if (choice == 1) {
           mean( myArray);
        } else if (choice == 2) {
            System.out.println("The median of the array is: "+ median(myArray));
        } 
        else if (choice == 3) {
            mode(myArray);
        } else {
            System.out.println("Invalid choice.");
        }
        
    }

}
