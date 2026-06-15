
import java.util.*;
class Q59{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the Array");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    int arr2[]=new int[n];
    System.out.println("Enter the Position by which you want to Rotate Array to RIGHT");
    int rot= sc.nextInt()+1;
    for(int i=0; i<n; i++){
        arr2[i]=arr[rot];
        if(rot==n-1){
            rot=0;
            continue;
        }
        rot++; 
        if(rot>=n){
            System.out.println("The input Exceeds the Array Limit");
            break;
        }       
    }
    System.out.println("The Rotated Array is :");
    for(int i=0; i<n; i++)
        System.out.print(arr2[i]+" ");
    sc.close();
}
}