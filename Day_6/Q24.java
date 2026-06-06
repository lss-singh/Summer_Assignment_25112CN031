import java.util.*;
class Q24{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Base");
    int x = sc.nextInt();
    System.out.println("Enter the Power");
    int n = sc.nextInt();
    System.out.print(x+"^"+n+" = ");
    int result=1;
    if(n==0){
        System.out.println(1);
        System.exit(0);
    }
    for(int i=1; i<=n; i++){
        result*=x;
    }    
    System.out.print(result);
    sc.close();
}
}