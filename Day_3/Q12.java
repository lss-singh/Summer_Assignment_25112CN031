import java.util.*;
class Q12{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers"); // to find the lcm(a,b)= a*b/GCD(a,b)
    int n = sc.nextInt();
    int m = sc.nextInt();
    int max = Math.max(n, m);

    while(true)
    {
        if(max%n==0 && max%m==0)
        {
            System.out.println(" The LCM is = "+max);
            break;
        }
        max++;
    }
    sc.close();

}
}