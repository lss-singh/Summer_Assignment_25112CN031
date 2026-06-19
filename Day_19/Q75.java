import java.util.*;
class Q75{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ROWS and Column of Matrix");
    int n = sc.nextInt(), m = sc.nextInt();
    int matrix[][] = Q74.Matrix(sc, n, m); //call
    int trans[][]= new int[m][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            trans[j][i]= matrix[i][j];
        }
    }
    System.out.println("Transpose Matrix is");
    Q74.print(trans); // call

    sc.close();
}
}