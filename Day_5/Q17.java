// PERFECT NUMBER
import java.util.*;
class Q17{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int sum=0;
    if(n==0){
        System.out.println("The entered number is NOT Perfect Number");
        System.exit(0);
    }
    for(int i= 1; i<n; i++){
        if(n%i==0){
            sum+=i;
        }
    }
    if(sum==n)
        System.out.println("The entered number is a Perfect Number");
    else 
        System.out.println("The entered number is NOT Perfect Number");
    sc.close();
}
}