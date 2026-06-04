import java.util.*;
class Q15{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp=n;
    int count=0;
    int sum=0;
    while(temp!=0){
        temp/=10;
        count++;
    }
    temp=n;
    while(temp!=0){
        int dig =temp%10; // Remember that d=temp%=10 will store 3 in both temp as well as d; input 153
        sum+=(int)Math.pow(dig, count);
        temp/=10;
    }
    if(n==sum)
        System.out.println("The number entered is Armstrong");
    else
        System.out.println("The number entered is NOT Armstrong");
    sc.close();
}
}