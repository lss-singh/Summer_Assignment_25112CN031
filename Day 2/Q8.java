import java.util.*;
class Q8{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int p=n;
    int palin=0;
    while(p!=0)
    {
        int dig=p%10;
        palin=palin*10+dig;
        p=p/10;
    }
    if(palin==n)
    System.out.println("The Number is Palindrome");
    else
    System.out.println("The number entered is not Palindrome");
sc.close();
}
}