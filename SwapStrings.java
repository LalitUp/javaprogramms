import java.util.*;
public class SwapStrings {

    public static void main(String[] args) {

        String a = "Ram";
        String b = "Pratap";

        System.out.println("Strings before Swapping: a = " + a + " and b = " + b);

        // append second string to first
        a = a + b;

        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());

        // store initial string b in string a
        a = a.substring(b.length());
        
        System.out.println("String after swap: a = " + a + " and b = " + b);
    }
}
