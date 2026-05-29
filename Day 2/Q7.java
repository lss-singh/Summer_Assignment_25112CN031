import java.util.*;
class Q7{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int p;
    int prod=1;
    while(n!=0){
        p=n; // can also do like int dig=n%10;
        p%=10; // skip this if above written
        prod*=p;
        n/=10;
    }
    System.out.println("The product of the number is = "+prod);
    sc.close();
}
}