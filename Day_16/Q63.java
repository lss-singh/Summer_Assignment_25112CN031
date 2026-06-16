import java.util.*;
class Q63{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Limit of Array");
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array WITHOUT REPETITION");
    for(int i=0; i<n; i++)
        arr[i]= sc.nextInt();
    System.out.println("Enter the PAIR-SUM");
    int n1=sc.nextInt();
    int c=0;
    for(int i=0; i<arr.length; i++){
        
        for(int j=i+1;j<arr.length; j++)
        {
            if((arr[i]+arr[j])==n1){
            System.out.println("("+arr[i]+","+arr[j]+") ");
            c++;
            }
        }
       
    }
    if(c==0)
        System.out.println("None Pair Adds to given pair-sum");
    sc.close();
}
}