import java.util.*;

public class TriangleStarPattern {

    public static void StarRightTriangle(int n){
        int a, b;

        for(a = 0; a < n; a++){  // no of rows

            // inner loop to handle no of columns
            for(b = 0; b <=a; b++) {

                System.out.print("* ");
            }

            // end line
            System.out.println();


        }
    }
    public static void main(String[] args) {
        int k = 5;
        StarRightTriangle(k);
    }
    
}

// time complexity O(n^2)
