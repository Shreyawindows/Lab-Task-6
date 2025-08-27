import java.util.*;
import java.io.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong(); // Try reading as long
                System.out.println(x + " can be fitted in:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                // If input is too big even for long
                String input = sc.next(); // read it as string
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}

