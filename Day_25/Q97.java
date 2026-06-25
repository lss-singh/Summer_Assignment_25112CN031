import java.util.*;
class Q97{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array 1");
    int n =sc.nextInt();
    int arr1[]= new int[n];
    System.out.println("Enter elements in sorted order (Asce/desc Order)");
    for(int i=0; i<n; i++){
        arr1[i]=sc.nextInt();
    }
    System.out.println("Enter the size of Array 2");
    int m =sc.nextInt();
    System.out.println("Enter elements in sorted order (Asce/desc Order)");
    int arr2[]= new int[m];
    for(int i=0; i<n; i++){
        arr2[i]=sc.nextInt();
    }
    int merged[]= new int[n+m];
     int i=0, j=0, k= 0;
        while (i<arr1.length &&j<arr2.length) { // merge the arrays
            if (arr1[i]<=arr2[j]) {
                merged[k++]=arr1[i++];
            } else
                merged[k++]=arr2[j++];
        }
        while (i<arr1.length) { // copy remaining elements of arr1
            merged[k++]=arr1[i++];
        }
        while (j<arr2.length) {         // Copy remaining elements of arr2
            merged[k++]=arr2[j++];
        }
        // Print merged array
        System.out.print("Merged Array: ");
        for (int num:merged) { // for(int i-0; i<merged.length; i++) { int num= merged[i]; }
            System.out.print(num + " ");
        }
    sc.close();
}
}