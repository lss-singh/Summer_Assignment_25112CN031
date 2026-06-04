import java.util.*;
class Q11{
public static void main(String[] args){ // NOT APPLYING Euclidean Algorithm 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Number");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int val= Math.min(n, m);
    int gcd=1;
    for(int i=1; i<=val;i++)
    {
        if(n%i==0 && m%i==0)
            gcd=i;
    }
    System.out.println("The GCD is = "+gcd);
    sc.close();

}
}