import java.util.Scanner;
public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] names = new String[n];
        int[] marks = new int[n];
        // input student records
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }
        // display student records
        System.out.println("\n--- Student Records ---");
        System.out.printf("%-20s %-10s%n", "Name", "Marks");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10d%n", names[i], marks[i]); //%-20s print a string left-aligned in a 20-character field; s is the string specifier
        }
        sc.close();
    }
}