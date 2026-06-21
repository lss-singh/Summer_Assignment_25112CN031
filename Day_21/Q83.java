import java.util.*;
class Q83{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
    str = str.toUpperCase();
    int v=0, c=0;
    for(int i=0; i<str.length(); i++){
        char temp = str.charAt(i);
        if(temp=='A' || temp =='E' || temp=='I' || temp =='O' || temp =='U' ){
            v++;
        }
        else if (str.charAt(i)==' ') {
            continue;   
        }
        else
            c++;
    }
    System.out.println("Vowels are: "+v+" and Consonant are: "+c);
    sc.close();
}
}