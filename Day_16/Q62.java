import java.util.*;
class Q62{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The array limit");        
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array");
    int maxc=0, maxe=arr[0];
    for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
    for(int i=0; i<n; i++){
        int count=0;
        for(int j=i+1; j<n; j++){
        if(arr[i]==arr[j])
            count++;
        if(count>maxc){
            maxc=count;
            maxe=arr[i];
        }
    }
    }
    System.out.println("The Number of Duplicate of "+maxe+" is : "+(maxc+1));

    sc.close();
}
}