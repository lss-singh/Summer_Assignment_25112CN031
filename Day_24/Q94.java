import java.util.Scanner;
public class Q94 {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder(); // stringbuilder to append the string and integer
        int count= 1;
        for (int i= 0; i< str.length(); i++) {
            while (i< str.length()- 1 &&str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            result.append(count);
            count = 1;
        }
        return result.toString(); // returns the string (converted to string from stringbuilder)
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("Compressed String: " +compress(str));
        sc.close();
    }
}