import java.util.Scanner;
public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[5];
        String[] authors = new String[5];
        // Input book details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Book " + (i + 1));
            System.out.print("Book Name: ");
            books[i] = sc.nextLine();
            System.out.print("Author Name: ");
            authors[i] = sc.nextLine();
        }
        // Display library records
        System.out.println("\n\nLibrary Records");
        for (int i = 0; i < 5; i++) {
            System.out.println("Book " + (i + 1));
            System.out.println("Book Name : " + books[i]);
            System.out.println("Author    : " + authors[i]);
            System.out.println();
        }
        sc.close();
    }
}