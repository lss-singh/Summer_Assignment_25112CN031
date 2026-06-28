import java.util.Scanner;
public class Q111 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 10;
        int bookedSeats = 0;
        String name = "";
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1.Book Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.Display Details");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (bookedSeats < totalSeats) {
                        sc.nextLine();
                        System.out.print("Enter Passenger Name: ");
                        name = sc.nextLine();
                        bookedSeats++;
                        System.out.println("Ticket Booked Successfully");
                    } else {
                        System.out.println("No Seats Available");
                    }
                    break;
                case 2:
                    if (bookedSeats > 0) {
                        bookedSeats--;
                        System.out.println("Ticket Cancelled Successfully");
                    } else {
                        System.out.println("No Booked Tickets");
                    }
                    break;
                case 3:
                    System.out.println("Passenger Name: " + name);
                    System.out.println("Total Seats: " + totalSeats);
                    System.out.println("Booked Seats: " + bookedSeats);
                    System.out.println("Available Seats: " + (totalSeats - bookedSeats));
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