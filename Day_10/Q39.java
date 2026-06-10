import java.util.*;
class Q39{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length for Palindromic Pyramid"); // good quesution, similar code for printing pascals triangle. 
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        for(int j=i; j<n; j++)
            System.out.print(" ");
        for(int j=1; j<=i; j++)
            System.out.print(j);
        for(int j=i-1; j>=1; j--)
            System.out.print(j);
        System.out.println();
    }
    sc.close();
}
}