import java.util.*;
class Q3
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number whoes factorial to find out");
    int x = sc.nextInt();
    int fact=1;
    for(int i=1; i<=x;i++){
        fact*=i;
 
    }
        System.out.println("Factorial of "+x+" is equal to = "+fact);
        sc.close();
    }
}