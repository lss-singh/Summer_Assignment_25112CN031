import java.util.*;
class Q45{
    static int palin(int n){
        int sum=0;
        while(n!=0){
            int digi=n%10;
            sum = sum*10+digi;
            n/=10;
        }
        return sum;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    if(n==palin(n))
    System.out.println("The Number is Palindrome");
    else
        System.out.println("The Number is not Palindrome");
    sc.close();
}
}