import java.util.*;
class Q23{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimal Number");
    int n = sc.nextInt();
    int bin = Q21.bin1(n);
    int count = 0;
    while(bin!=0){
        int digi= bin%10;
        if(digi==1)
            count++;
        bin/=10;
    }
    System.out.println("The number of Bits = "+count);
    sc.close();
}
}