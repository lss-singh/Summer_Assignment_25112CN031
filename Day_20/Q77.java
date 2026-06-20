import java.util.*;
//import Day_19.Q74;
class Q77{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ROWS and Column of the Matrix 1");
    int r1 = sc.nextInt(), c1=sc.nextInt();
    System.out.println("Enter the ROWS and Column of the Matrix 2");
    int r2 = sc.nextInt(), c2=sc.nextInt();
    if(c1 != r2) {
        System.out.println("Matrix multiplication is not possible.");
        System.exit(0);
    }
    int mat1[][]= new int[r1][c1];
    System.out.println("Enter the Matrix 1");
    for(int i=0; i<r1; i++)
        for(int j=0; j<c1; j++)
            mat1[i][j]= sc.nextInt();
    System.out.println("Enter the Matrix 2");
    int mat2[][]= new int[r2][c2];
    for(int i=0; i<r2; i++)
        for(int j=0; j<c2; j++)
            mat2[i][j]= sc.nextInt();
    System.out.println("Resultant Matrix:");
    int result[][]= new int[r1][c2];
    for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
    System.out.print(result[i][j]+" ");}
    System.out.println();}


    sc.close();
}
}