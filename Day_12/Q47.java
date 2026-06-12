import java.util.*;
class Q47{
    static int fibo(int n)
    {
        if(n==0)    // you can also follow if(n<=1)
            return 0; //                   return n;
        else if(n==1)   //       (exclude)
            return 1;   // (exclude)
        else  //          (exclude) 
            return fibo(n-1)+fibo(n-2); // return fibo(n-1) + fibo(n-2);
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    System.out.print("The Series is :");
    for(int i=0; i<n;i++){
        System.out.print(fibo(i)+" ");
    }
    sc.close();
}
}