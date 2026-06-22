import java.util.*;
class Q87{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch== ' ')
                continue; //skip spaces
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    count++;
            }
            boolean done = false; // similar check of already printed words/number as in previous programs
            for (int k = 0; k < i; k++) {
                if (ch== str.charAt(k)) {
                    done = true;
                    break;
                }
            }
            if (!done)
                System.out.println(ch + " : " + count);
        }
        sc.close();
    }
}