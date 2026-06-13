import java.util.*;
class Q52{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Size of INPUT");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    int odd = 0, even = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==0)
            System.out.println("0 is neither odd nor even");
        else if(arr[i]%2==0)
            even++;
        else 
            odd++;
    }
    System.out.println("Even = "+even+"\nOdd = "+odd);

    sc.close();
}
}