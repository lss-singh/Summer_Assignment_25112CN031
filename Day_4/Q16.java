import java.util.*;
class Q16{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Range where you wannt to find armstrong numbers");
    System.out.println(" Enter the Starting of range");
    int n = sc.nextInt();
    System.out.println(" Enter the Ending of range");
    int m = sc.nextInt();
    System.out.print(" The Armstrong Numbers are : ");
    for(int i = n; i<=m; i++){
        int temp=i;
        int count=0, sum=0;
         while(temp!=0){
        temp/=10;
        count++;
    }
    temp=i; //crital step or bug can be this step
    while(temp!=0){
        int dig =temp%10; 
        sum+=(int)Math.pow(dig, count);
        temp/=10;
    }
    if(sum==i)
        System.out.print(i+" ");
}
sc.close();
}}