import java.util.*;
class Q60{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Limit");
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n;j++)
        if(arr[i]!=0 && arr[j]==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    for(int i=n-1; i>=0; i--){
        System.out.print(arr[i]+" ");
    }
    sc.close();
}
}