import java.util.*;
class Q67{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array size for both arrays \n NOTE: Initially input Smnaller Array Size then Bigger iff there's a difference in sizes of Arrays4");
    int n= sc.nextInt(), m= sc.nextInt();
    int arr[]=new int[n], arr2[]= new int[m];
        System.out.println("Enter the Array");
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    for(int i=0; i<m; i++)
        arr2[i]=sc.nextInt();
        System.out.print("The INTERESTION of Both the Array is :");
    for(int i=0; i<n; i++){
        int temp=-1;
        for(int j=0; j<m; j++){
            if(arr[i]==arr2[j])
            temp=arr[i];
        }
        if(temp!=-1)
        System.out.print(temp+" ");
    }
    sc.close();
}
}