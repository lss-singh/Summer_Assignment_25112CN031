import java.util.Scanner; 
public class Q103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance = 1102755.56;
        int choice; // to initiate the input for procedure
        double amount; // for withdrawl

        while (true) {  // we used true so that the flow is sure. The program is endless as long as the control is not transfferred back to main.
            System.out.println("\tATM MENU");
            System.out.println("1- Check Balance");
            System.out.println("2- Deposit Money");
            System.out.println("3- Withdraw Money");
            System.out.println("4- Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {   // using switch here is best case scenerio
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit Successful!");
                    System.out.println("New Balance: Rs "+balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (amount<=balance) {
                        balance-=amount; // shorthand operator
                        System.out.println("Withdrawal Successful");
                        System.out.println("Remaining Balance: ₹"+balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again."); // default needs no break
            }
        }
    }
}