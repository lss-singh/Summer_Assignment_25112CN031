import java.util.*;
class Q25{
    static long fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1); // for very high values it will return some garbage value. Thus use BigInteger class/object creation
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    System.out.println("The Factorial is = "+fact(n) );
    sc.close();
}
}