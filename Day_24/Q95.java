import java.util.Scanner;
public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String words[] = sentence.split(" "); // splits and stores in arrayy words; length can be found out by .length;
        String longest = "";
        for (int i=0; i<words.length; i++) {  //for(String word: words) same statement as line 9+10;
            String word= words[i];
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

        sc.close();
    }
}