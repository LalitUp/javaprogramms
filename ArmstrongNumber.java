import java.io.*;
import java.math.*;

public class ArmstrongNumber {

// Function to print armstrong number between two integers

    static void ArmstrongNum(int l, int h) {
        for(int j = l + 1; j < h; ++j) {

            // Calculating number of digits
            int y = j;
            int N = 0;
            while (y != 0) {
                y /= 10;
                ++N;
            }

            // calculating the current number
            // i is equal to the sum of nth 
            // power of all the digits
            int sum_power = 0; 
            y = j; 
            while (y != 0) { 
                int d = y % 10; 
                sum_power += Math.pow(d, N); 
                y /= 10; 
            } 



            if (sum_power == j) 
                System.out.print(j + " "); 
        } 
    } 

    
public static void main(String[] args) {
    System.out.println("----------");
    int n1 = 50;
    int n2 = 500;
    ArmstrongNum(n1, n2);
    System.out.println();
    

}

}
