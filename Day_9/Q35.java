import java.util.*;
class Q35{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character till where you want to print the pattern");
    char ch = sc.next().toUpperCase().charAt(0);
    for(char i = 'A'; i<=ch; i++){
        for(char j='A'; j<=i; j++)
            System.out.print(i);
        System.out.println();
    }
    sc.close();
}
}