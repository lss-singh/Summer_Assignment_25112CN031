import java.util.*;
class Q44{
    static long fact(int n){
        if(n==0 || n==1)
            return n;
        return n*fact(n-1);
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("The Factorial is = "+fact(n));
    sc.close();
}
}