import java.util.*;
class Q41{
    static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("The Sum of two numbers is = "+sum(p, q));
    sc.close();
}
}