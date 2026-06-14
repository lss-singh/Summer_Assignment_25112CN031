import java.util.*;
class Q56{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Limit");
    int n = sc.nextInt();
    System.out.println("Enter the Array");
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
            boolean search = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    search = true;
                    break;
                }
            }
            if (search)
                continue;
            int c = 0;
            for (int k = 0; k < n; k++) {
                if (arr[i] == arr[k]) {
                    c++;
                }
            }
            if (c>1) {
                System.out.println("Duplicate [" + arr[i] + "]");
                System.out.print("Found at INDEX: ");
                for (int k = 0; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        System.out.print(k + " ");
                    }
                }

                System.out.println("\n");
            }
        }

    sc.close();
}
}