import java.util.*;
class Q58{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Limit");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    System.out.println("Enter the Position by which you want to Rotate Array to LEFT");
    int rot = sc.nextInt();
    int arr2[]= new int[n];
    for(int i=0; i<n; i++){
        arr2[i] = arr[rot];
        rot++;
        if(rot>n){
            System.out.println("The shifting is greater than the Input");
            break;
        }
        if(rot==n){
            rot=0;
        }
    }
    System.out.println("The Rotated Array is :");
    for(int i=0; i<n; i++){
        System.out.print(arr2[i]+" ");
    }

    sc.close();
}
}