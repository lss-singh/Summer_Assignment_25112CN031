import java.util.*;
class Q31{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length for Triangle (In terms of Character). \n For Example: \n A=1, B=2, .... E=5.");
    char ch = sc.next().charAt(0);
    ch = Character.toUpperCase(ch);
    for(char i ='A'; i<=ch; i++){
        for( char j = 'A'; j<=i; j++)
            System.out.print(j);
        System.out.println();
    }

    sc.close();
}
}