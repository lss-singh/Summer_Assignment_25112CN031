import java.util.*;
class Q48{
    static int perf(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt(); 
    if(n==perf(n))
        System.out.println("Number is a Perfect Number");
    else
        System.out.println("Number is not Perfect Number");
    sc.close();
}
}