import java.util.*;
public class Q79 {
    static int[][] inputMatrix(Scanner sc, int n, int m) {
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the matrix:");
        int[][] matrix = inputMatrix(sc, n, m);
        System.out.println("Row-wise sums:");
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
        sc.close();
    }
}