import java.util.*;
public class Q98 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter both the Strings");
        String str1 =sc.next().toUpperCase(); // avoids case senstivity 
        String str2 =sc.next().toUpperCase(); // avoids case senstivity
        System.out.print("Common characters: ");
        for (int i=0; i<str1.length(); i++) {
            char ch1=str1.charAt(i);
            for (int j=0; j<str2.length(); j++) {
                if (ch1==str2.charAt(j)) {
                    System.out.print(ch1+ " ");
                    break; 
                    // avoids printing same character multiple times for one occurrence. once printed shifts the control back to outer loop
                    // THIS PRINTS COMMON CHARACTER; TO AVOID REPEATITION, WE CAN USE THE CODE TO CHECK ALREADY PRINTED USING BOOLEAN
                    // ALREADY DONE SUCH PROGRAMS IN PRE QUESTIONS 
                }
            }
        }
        sc.close();
    }
}