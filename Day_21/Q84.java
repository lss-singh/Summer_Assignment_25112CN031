import java.util.*;
class Q84{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
    System.out.println("The Inputted String is : "+str);
    str = str.toUpperCase();
    System.out.println("The UpperCase String is : "+str);
    sc.close();
}
}