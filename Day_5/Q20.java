import java.util.*;
class Q20{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Number");
    int n = sc.nextInt();
    int max=1;
    if(n==0){
    System.out.print("Zero has INFINITE FACTORS, hence INVALID Input ");
    System.exit(0);
    }
    System.out.print(" The Largest Prime Factor is : ");
    for(int i=1; i<=n;i++)
    {
        if(n%i==0){
            int c=0;
            for(int j=1; j<=i; j++){
                if(i%j==0)
                    c++;
            }
            if(c==2)
                max=i;
    }
}
    System.out.print(max);
    sc.close();
}
}