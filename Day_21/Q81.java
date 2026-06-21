import java.util.*;
class Q81{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String x = sc.nextLine();
    int c=0;
    //int len = x.length();
    for(int i=0; ; i++){
        try{
            x.charAt(i);
            c++;
        }
        catch (StringIndexOutOfBoundsException e) {
                break;
    }
    }
    System.out.println("The Length is, including white spaces = "+c);
    sc.close();
}
}