import java.util.*;
class Q26{
static int fibo(int n)
{
    if(n<=1)
        return n;
    return fibo(n-1) + fibo(n-2);
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth term for fibonacci series");
    int n = sc.nextInt();
    for(int i=0; i<n; i++){ // in order to get each term we need to loop each nth term out from fibo;
        System.out.print(fibo(i)+ " ");
    }
    sc.close();
}
}
