import java.util.*;
class Q86{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence");
    String str = sc.nextLine();
    int word=1;
    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
        if(ch==' ') //if(ch==' ' || ch=='.')
            word++;
    }
    System.out.println("The Number of words are "+word);
    sc.close();
}
}