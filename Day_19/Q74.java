import java.util.*;
class Q74{
    static int[][] Matrix(Scanner sc,int n, int m){ //Creating this so that it can be used in other classes
        int matrix[][]=new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                matrix[i][j]= sc.nextInt();
        return matrix;
    }
    static void print(int matrix[][]){
        for(int i = 0; i < matrix.length; i++) { // .length = ROWS; matrix[0].length= columns 
            for(int j = 0; j < matrix[i].length; j++) { // not using matrix[0] to avoid JAGGED ARRAYS
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ROWS and COLUMS for Matrix 1");
    int n = sc.nextInt(), m = sc.nextInt();
    System.out.println("Enter the ROWS and COLUMS for Matrix 2");
    int o = sc.nextInt(), p = sc.nextInt();
    if (n != o || m != p) {
        System.out.println("Matrix Subtraction is not possible. Dimensions must be the same.");
        System.exit(0);
    }
    System.out.println("Enter the Matrix 1");
    int mat1[][] = Matrix(sc, n, m);
    System.out.println("Enter the Matrix 2");
    int mat2[][]= Matrix(sc, o, p);
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
        int sub = 0;
            sub = mat1[i][j] - mat2[i][j];
            System.out.print(sub+"\t");
    }
    System.out.println();
}

    sc.close();
}
}