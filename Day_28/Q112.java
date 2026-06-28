import java.util.Scanner;
public class Q112 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String phone = "";
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1.Add Contact");
            System.out.println("2.Update Contact");
            System.out.println("3.Display Contact");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();
                    System.out.println("Contact Added Successfully");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Phone Number: ");
                    phone = sc.nextLine();
                    System.out.println("Contact Updated Successfully");
                    break;
                case 3:
                    System.out.println("Name: " + name);
                    System.out.println("Phone Number: " + phone);
                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}