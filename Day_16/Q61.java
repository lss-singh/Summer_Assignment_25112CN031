import java.util.*;
class Q61{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Limit");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the Array");
    int sum=0, sumt=0;
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
        sum+=arr[i];
    }
    sumt=((arr[n-1])*(arr[n-1]+1))/2;
    if(sum==sumt){
        System.out.println("There is NO Missing Number");
    }
    else{
        System.out.println("The Missing Number is = "+(sumt-sum));
        }
    sc.close();
}
}