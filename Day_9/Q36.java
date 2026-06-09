import java.util.*;
class Q36{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the hollow Square");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j==1 || j==n || i==1 || i==n)
                System.out.print("* "); // we can remove the extra space to get exact same pattern asked 
            else
                System.out.print("  "); // if following line 10; remove extra space from here also
        }
        System.out.println();
    }

    sc.close();
}
}