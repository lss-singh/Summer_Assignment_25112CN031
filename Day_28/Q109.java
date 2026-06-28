
/* a proper explanation is given in ques 105; kindly refer for global local variables, constructor, etc */
// press shift+alt+f to get a perferct format 
import java.util.Scanner;

public class Q109 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] bookId = new int[10];
        String[] bookName = new String[10];
        boolean[] issued = new boolean[10];
        int count = 0;
        int choice = 0;
        while (choice != 5) {
            System.out.println("\n1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count < 10) {
                        System.out.print("Enter Book ID: ");
                        bookId[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book Added Successfully");
                    } else {
                        System.out.println("Library Full");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.print("ID: " + bookId[i]);
                            System.out.print("\tName: " + bookName[i]);
                            System.out.print("\tStatus: ");
                            if (issued[i])
                                System.out.println("Issued");
                            else
                                System.out.println("Available");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued");
                            } else {
                                System.out.println("Book Already Issued");
                            }
                            break; // if block control break
                        }
                    }
                    break; // case break
                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned");
                            } else {
                                System.out.println("Book Was Not Issued");
                            }
                            break;  // to bring the control out of the if() loop...
                        }
                    }
                    break; // case break
                case 5:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}