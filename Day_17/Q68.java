import java.util.*;

class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter first array:");
        for(int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter second array:");
        for(int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        System.out.print("Common elements are: ");
        for(int i = 0; i < n; i++) { // Find common elements
            boolean printed = false; // we are skipping duplicates in arr1
            for(int j= 0; j< i; j++) {
                if(arr1[i] == arr1[j]) {
                    printed = true;
                    break;
                }
            }
            if(printed) continue;

            // check presence in arr2
            for(int k = 0; k<m; k++) {
                if(arr1[i] == arr2[k]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}