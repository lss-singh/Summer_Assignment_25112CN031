import java.util.*;
class Q82{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.next();
    String rev= "";
    for(int i=0; i<str.length(); i++){
        rev = str.charAt(i)+rev;
    }
    System.out.println("The reversed String is "+rev);
    sc.close();
}
}