import java.util.*;
class Q55{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Limit Range");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }
    int largest = Integer.MIN_VALUE;
    int slargest = Integer.MIN_VALUE;

    // THIS WORKS FOR NEGATIVE INPUT AS WELL
    
    for(int i=0; i<n; i++){
        if(arr[i]>largest){
            slargest = largest;
            largest = arr[i];
            
        }
        else if(arr[i]>slargest && arr[i] != slargest){
            slargest = arr[i];

        }
    }
        if(slargest == Integer.MIN_VALUE)
            System.out.println("There is no Second Largest Element in the Array");
        else
            System.out.println("The Second Largest Element is = "+slargest);

    sc.close();
}
}