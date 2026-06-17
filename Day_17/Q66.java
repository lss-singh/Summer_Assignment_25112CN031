import java.util.*;
class Q664{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array size for both arrays...");
    int n= sc.nextInt(), m= sc.nextInt();
    int arr[]=new int[n], arr2[]= new int[m];
        System.out.println("Enter the Array");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    for(int i=0; i<m; i++)
        arr2[i]=sc.nextInt();
        System.out.print("The UNION of Both the Array is : ");
    for(int i=0; i<n; i++){    // to remove the duplicacy in first array
        boolean check = false;
        for(int j=0; j<i; j++){
            if(arr[i]==arr[j]){
            check=true; 
            break;
            }
        }
        if(!check)
            System.out.print(arr[i]+" ");
        
    }
    for(int i=0; i<m; i++){
         boolean check = false;
         for(int j=0; j<n; j++){
            if(arr2[i]==arr[j]){
            check= true;
            break;
            }
        }
        if(!check)
            System.out.print(arr2[i]+" ");   
        
        }
        sc.close();
}
}
