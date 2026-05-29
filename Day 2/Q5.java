import java.util.*;
class Q5{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int p;
    int sum=0;
    while(n!=0){
        p=n;
        p%=10;
        sum=sum+p;
        n/=10;
    }
    System.out.println("The sum of digits = "+sum);
    sc.close();
}
}