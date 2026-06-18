import java.util.Scanner;
public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:"); // for unsorted array you can call from Q69, 70; and then proceed with same logic
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int start = 0, end = n - 1;
        int found = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                found = mid;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (found != -1) {
            System.out.println("Element found at index: " + found+" at location :"+(found+1));
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}