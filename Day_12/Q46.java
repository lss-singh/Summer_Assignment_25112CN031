import java.util.*;
class Q46{
    static int arm(int n)
    {
        int p=n;
        int sum = 0;
        int c=0;
        while(p!=0){
            p/=10;
            c++;
        }
        while(n!=0){
            int digi = n%10;
            sum+= (int)Math.pow(digi, c);
            n/=10;
        }
        return sum;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    if(n==arm(n))
        System.out.println("The Number is Armstrong");
    else
        System.out.println("The Number is not Armstrong");
    sc.close();
}
}