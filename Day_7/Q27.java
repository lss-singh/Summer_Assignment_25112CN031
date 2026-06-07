import java.util.*;
class Q27{
    static int Sum(int n){
        if(n==0)
            return 0;
        return (n%10) + Sum(n/10); // for very high values it will return some garbage value. Thus use BigInteger class/object creation
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the digit");
    int n = sc.nextInt();
    System.out.println("The Sum of digits is = "+Sum(n) );

    sc.close();
}
}