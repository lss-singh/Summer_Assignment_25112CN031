import java.util.Scanner;
public class Q110 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int accNo = 0;
        double balance = 0;
        int choice = 0;
        while (choice != 5) {
            System.out.println("\n1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Display Account");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();
                    System.out.println("Account Created Successfully");
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited");
                    break;
                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount Withdrawn");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Account Holder: " + name);
                    System.out.println("Account Number: " + accNo);
                    System.out.println("Balance: " + balance);
                    break;
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