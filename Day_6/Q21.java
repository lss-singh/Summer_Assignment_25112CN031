import java.util.*;
class Q21{
    static int bin1(int n){ // use of null string and concatenation
        String bin="";
        while(n>0){
            bin=(n%2)+bin;
            n=n/2;
        }
        return Integer.parseInt(bin); // returning int as binary looses its meaning but due to code reuseability we have used int. You can eaisly change int to string using wrapper classes. 
    }
    /*static int bin2(int n){
         String binary = Integer.toBinaryString(n);
         return Integer.parseInt(binary);
    }*/
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number to be converted to Binary");
    int x = sc.nextInt();
    System.out.print("Binary conversion is : " +bin1(x)+"\n");
    //System.out.print("Binary Conversion by using preBuilt class = "+bin2(x));
    sc.close();
}
}