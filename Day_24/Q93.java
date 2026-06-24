import java.util.Scanner;

public class Q93 {
    static boolean isRotation(String str1, String str2) {
        if (str1.length()!= str2.length()) {
            return false;
        }
        String temp = str1+ str1;
        return temp.contains(str2); // checks one string present in amother (1st+1st)
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1= sc.next().toUpperCase();
        System.out.print("Enter second string: ");
        String str2= sc.next().toUpperCase();
        if (isRotation(str1, str2)) {
            System.out.println("The strings are rotations of each other");
        } else {
            System.out.println("The strings are not rotations of each other");
        }
        sc.close();
    }
}