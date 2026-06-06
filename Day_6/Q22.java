import java.util.*;
class Q22{
    static int deci1(int n)
    {
        int c=0, deci=0;
        while(n>0)
        {
            int digi=n%10;
            deci+= digi * Math.pow(2, c); // mathematically 
            c++;
            n=n/10;
        }
        return deci;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary");
    int x = sc.nextInt();
    System.out.print("The Decimal Value is : "+deci1(x));
    sc.close();
}
}