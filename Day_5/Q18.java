import java.util.*;
class Q18{
    static long fact(int n){
        long result=1;
        for(int i=1; i<=n; i++)
        result*=i;
    return result;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number"); //digits factorial sum equals the number
    int n = sc.nextInt();
    int temp= n;
    long sum=0;
    while(temp!=0){
        int digi=temp%10;
       // fact+=Math.factorial(digi); not available in my version but you can use iff allowed
        sum+= fact(digi);
        temp/=10;
    }
    if (sum==n)
        System.out.println("The Numnber is Strong Number");
    else
        System.out.println("The Number is NOT a Strong Number");
    sc.close();
}
}