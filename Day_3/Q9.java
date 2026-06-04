import java.util.*;
class Q9{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
        if(n%i==0)
            c++;
    }
    if(n==0)
        System.out.println("The Number is NEITHER PRIME NOR COMPOSITE");

    else if(c==2)
        System.out.println("The Number is Prime");
    else
        System.out.println("The Number is NOT Prime");
    sc.close();
}
}