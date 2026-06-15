import java.util.*;
class Q57{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Limit");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int arr2[]=new int[n];
    for(int i=0; i<n; i++){
        arr2[i]=arr[n-i-1];
    }
    System.out.println("Original Array is :");
    for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");}
     
    System.out.println();
    System.out.println("Reversed Array is :");
    for(int i=0; i<n; i++){
        System.out.print(arr2[i]+" ");}
    sc.close();
}
}
