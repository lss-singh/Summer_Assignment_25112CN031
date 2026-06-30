import java.util.Scanner;
public class Q120 {
    static String[] names = new String[10];
    static int[] marks = new int[10];
    static int count = 0;
    // Function to add student
    static void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine(); // Consume newline
        count++;
        System.out.println("Student Record Added Successfully.\n");
    }
    // Function to display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.\n");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Name : " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }
    }
    // Function to search student
    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student Name to Search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Student Found");
                System.out.println("Name : " + names[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student Not Found.");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.\n");
            }
        } while (choice != 4); // u can also use while instead just by putting the condition above 

        sc.close();
    }
}