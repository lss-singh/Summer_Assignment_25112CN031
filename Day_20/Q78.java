import java.util.*;
public class Q78 {
    static int[][] inputMatrix(Scanner sc, int n) {
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter the matrix:");
        int[][] matrix = inputMatrix(sc, n);
        boolean symmetric = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if(!symmetric) 
                break;
        }

        if(symmetric)
            System.out.println("The matrix is Symmetric");
        else
            System.out.println("The matrix is Not Symmetric");

        sc.close();
    }
}