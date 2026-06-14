import java.util.*;
class Q54{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Limit of Input");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Enter the Element whoes frequency is to be Searched");
    int n1=sc.nextInt();
    int c=0;

    for(int i=0; i<n; i++){
        if (arr[i]==n1) {
            c++;
            
        }
    }
        if(n==0){
            System.out.println("No such Element Found");
        }
        else
            System.out.println("Frequency of Element is "+c);

    sc.close();
}
}