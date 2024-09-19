import java.util.*;

public class Swaap_2_Numbers {

    static void swapValue(int m, int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is" + m +" and Value of n is"+n);
    }

    public static void main(String[] args) {
        int m = 9;
        int n = 5;

        swapValue(m, n);

    }
    


}
