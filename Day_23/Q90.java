import java.util.*;
public class Q90 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        char first = '\0';
        for (int i=0; i< str.length();i++) {
            for (int j =i+ 1; j< str.length(); j++) {
                if (str.charAt(i) ==str.charAt(j)) {
                    first =str.charAt(i);
                    break;
                }
            }
            if (first!='\0') {
                break;
            }
        }
        if (first!='\0') {
            System.out.println("First repeating character: " + first);
        } else {
            System.out.println("No repeating character found.");
        }
        sc.close();
    }
}