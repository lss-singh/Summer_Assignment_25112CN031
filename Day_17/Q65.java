import java.util.*;
class Q65{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the new array size");
    int n1= sc.nextInt();
    int arr2[]= new int[n1];
    System.out.println("Enter Both the Array");
    System.out.println("First One");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    System.out.println("Second One");   
    for(int i=0; i<n1; i++)
        arr2[i]=sc.nextInt();
    System.out.println("Merged Array is : ");
    int arr3[]=new int[arr.length+arr2.length]; // new int[n+n1];
    for(int i=0; i<n; i++){
        arr3[i]=arr[i];
        //arr3[i+n]=arr2[i];
    }
    for(int i=0; i<n1; i++){
        arr3[n+i]=arr2[i]; 
    }
    for(int i =0; i<n+n1; i++)
        System.out.print(arr3[i]+" ");
    sc.close();
}
}