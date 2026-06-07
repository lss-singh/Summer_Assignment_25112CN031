import java.util.*;
class Q28{
    static int rev = 0;
    static void rev(int n){ // we can also do without declaring global variable. Must see that method as well;
        if(n==0)
            return;
        rev= rev*10 + n%10;
        rev(n/10); 
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to be reversed");
    int n = sc.nextInt();
    rev(n);
    System.out.println("Reversed Number = "+rev);
    sc.close();
}
}