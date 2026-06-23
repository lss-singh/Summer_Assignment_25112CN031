import java.util.*;
public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        char first = '\0';
        for (int i=0; i< str.length(); i++) {
            int count = 0;

            for (int j =0; j <str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if (count==1) {
                first = str.charAt(i);
                break;
            }
        }
        if (first!='\0') {
            System.out.println("First non-repeating character: " + first);
        } else {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }
}