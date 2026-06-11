import java.util.*;
class Q42{
    static int max(int n, int m){
        if(n>m)
            return n;
        else 
            return m;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println("The Maximum of two numbers is = "+max(n,m));
    sc.close();
}
}