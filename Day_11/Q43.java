import java.util.*;
class Q43{
    static boolean prime(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else 
            return false;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    if(prime(n))
        System.out.println("The Number is PRIME");
    else
        System.out.println("The Number is not PRIME");
    sc.close();
}
}