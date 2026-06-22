import java.util.*;
class Q85{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.next().toUpperCase();
    String palin="";
    for(int i=0; i<str.length(); i++){
        palin=str.charAt(i)+palin;
    
    }
    if(str.equals(palin))
        System.out.println("Palindrome String");
    else
        System.out.println("Not Palindrome String");
    sc.close();
}
}