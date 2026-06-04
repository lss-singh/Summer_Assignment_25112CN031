import java.util.*;
class Q14{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Nth term for Fibonacci Series");
    int n = sc.nextInt();
    int a=0, b=1;
    int nextt=0;
        System.out.print("The Nth term for Fibonacci Series is : ");

    if(n==1)
        System.out.print(a);
    else if(n==2)
        System.out.print(b);
    else{
        for(int i=3; i<=n; ++i){
            nextt= a+b;
            a=b;
            b=nextt;
        }
        System.out.print(nextt);
}   
sc.close();
}
}