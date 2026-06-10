import java.util.*;
class Q40{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the triangle lenth (in characters) for printing palindrom pyramid \n Example A=1, B=2,... E=5.");
    char n = sc.next().toUpperCase().charAt(0);
    for(char i='A'; i<=n; i++){
        for(char j=i; j<n; j++)
            System.out.print(" ");
        for(char j='A'; j<=i; j++)
            System.out.print(j);
        for(char j=(char)(i-1); j>='A'; j--)
            System.out.print(j);
        System.out.println();

    }
    sc.close();
}
}