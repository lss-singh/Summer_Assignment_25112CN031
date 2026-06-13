import java.util.*;
class Q50{
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array (put -1 to Stop)");
    int arr[]= new int[50];
    int c=0;
for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
        c++;
        if(arr[i]==-1)
            break;
}
    int sum = 0;
    for(int i= 0; i<c-1; i++){
        sum+= arr[i];
    }
    double avg = (double)sum/(c-1);

    System.out.println("Sum is = "+sum+"\nAverage = "+avg);
    sc.close();
}
}