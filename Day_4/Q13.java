import java.util.*;
class Q13{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term for Fibonacci Series");
    int n = sc.nextInt();
    int a=0, b=1; 
    if(n==1)
        System.out.print(a);
    else if(n==2)
        System.out.print(a+" "+b);
    else 
    {
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            int nextt = a+b;
            a=b;
            b=nextt;
        }
    }
    sc.close();

}
}