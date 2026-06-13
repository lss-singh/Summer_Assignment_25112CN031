import java.util.*;
class Q51{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Input");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[]= new int[n];
    int min = Integer.MAX_VALUE; // double min = -Double.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max)
            max=arr[i];
        if(arr[i]<min)
            min=arr[i];
    }
    System.out.println("The Maximum Value is = "+max+"\nThe Minumum Value is = "+min);
    sc.close();
}
}