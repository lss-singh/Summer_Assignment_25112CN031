import java.util.*;
class Q53{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Range Limit");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Element to be Searched");
    int n1= sc.nextInt();
    int c=0;
    for(int i=0; i<n; i++){
        if (arr[i]==n1) {
            System.out.println("Element found at index "+i);
            c++;
            
        }
        if(c>1){
            System.out.println("Frequency of Element is "+c);
        }
    }
    sc.close();
}
}