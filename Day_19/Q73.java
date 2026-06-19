import java.util.*;
class Q73{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n and m (n*m)");
    int n = sc.nextInt(), m=sc.nextInt();
        int arr1[][]= new int[n][m];

    System.out.println("Enter the First Matrix");
    for(int i=0; i<n;i++)
        for(int j=0; j<m;j++)
            arr1[i][j]=sc.nextInt();
        
    System.out.println("Enter the value of n and m (n*m) for the matrix you want to add");
    int o= sc.nextInt(), p=sc.nextInt();
    int arr2[][]= new int[o][p];
    if (n != o || m != p) {
        System.out.println("Matrix addition is not possible. Dimensions must be the same.");
        System.exit(0);
    }
    System.out.println("Enter the Second Martrix");
    for(int i=0; i<o;i++)
        for(int j=0; j<p;j++)
            arr2[i][j]=sc.nextInt();
    int sum;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            sum=0;
            sum=arr1[i][j]+arr2[i][j];
            System.out.print(sum+"\t");
        }
        System.out.println();
    }
    sc.close();
}
}