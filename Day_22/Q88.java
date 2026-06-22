import java.util.*;
class Q88{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
    String res="";
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch!=' ')
            res+=ch;
    }
    System.out.println("Space Removed : "+res);

    sc.close();
}
}