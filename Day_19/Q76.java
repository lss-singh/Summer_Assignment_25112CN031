import java.util.*;
class Q76{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ROWS and COLUMNS:: MUST BE A SQUARE MATRIX");
    int n =sc.nextInt(), m = sc.nextInt();
    if(m!=n)
        System.exit(m);
    System.out.println("Enter the Matrix");
    int matrix[][] = Q74.Matrix(sc, n, m);
    int Ldiag=0, Rdiag=0;
    for(int i=0; i<m; i++){
        Ldiag+= matrix[i][i];
        Rdiag+= matrix[i][n-i-1];            
        }
        System.out.println("The Primary Diagonal is : "+Ldiag);
        System.out.println("The Secondary Diagonal is : "+Rdiag);
    sc.close();
}
}