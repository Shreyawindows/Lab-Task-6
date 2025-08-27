import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            
            // Format the string to be left-justified in 15 characters
            // Format the number to be exactly 3 digits, padded with zeros
            System.out.printf("%-15s%03d%n", s1, x);
        }
        
        System.out.println("================================");
        sc.close();
    }
}

