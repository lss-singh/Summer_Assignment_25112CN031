import java.util.*;
class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth natural numner till you want to calculate the sum");
        int n = sc.nextInt();
        int sum = (n*(n+1)/2);
        System.out.println("The Sum first "+n+" number is = "+sum);
        sc.close();

    }
}