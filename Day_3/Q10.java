import java.util.*;
class Q10{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range");
    System.out.println("Enter the STARTING range");
    int n = sc.nextInt();
    System.out.println("Enter the ENDING range");
    int m = sc.nextInt();
    System.out.println("The Range of Prime Numbers is : ");
    for(int i=n; i<=m; i++){
        int count = 0;
        for(int j=1; j<=i; j++){
            if(i%j==0)
            count++;
        }
        if(count==2)
        System.out.print(i+"\n");
    }
    sc.close();
}
}