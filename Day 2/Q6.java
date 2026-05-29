import java.util.*;
class Q6{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = sc.nextInt();
    int p;
    int rev=0;
    while(n!=0){
        p=n;
        p%=10;
        rev=rev*10+p;
        n=n/10;

    }
    System.out.println("The reversed digit is ="+rev);
    sc.close();
}
}