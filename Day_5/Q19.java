import java.util.*;
class Q19{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.print("The Factors are : ");
    for(int i=1; i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.print(i+" ");
        }
    }
    sc.close();
}
}