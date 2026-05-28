import java.util.*;
class Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whoes table you want to Print");
        int n = sc.nextInt();
        System.out.println("Enter end point of the table");
        int m = sc.nextInt();
         System.out.println("\n The Table is : \n");

        for(int i=1; i<=m; i++)
        {
        System.out.println(n+" * "+i+" = "+(i*n));
        }
        sc.close();
    }
}