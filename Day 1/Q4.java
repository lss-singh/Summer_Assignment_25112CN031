import java.util.*;
class Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int n = sc.nextInt();
        int x=n;
        int c=0;
        while(x!=0)
        {
            c++;
            x/=10;
        }
        if(n==0)
            c++;
        System.out.println("The Number of Digits is/are = "+c);
        sc.close();
    }
}