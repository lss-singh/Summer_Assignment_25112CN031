import java.util.Scanner;
public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] item = new String[10];
        int[] qty = new int[10];
        int count = 0;
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer abosrbs the next line; ENTER
            switch (choice) {
                case 1:
                    if (count < 10) {
                        System.out.print("Enter Item Name: ");
                        item[count] = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        qty[count] = sc.nextInt();
                        count++;
                        System.out.println("Item Added Successfully.");
                    } else {
                        System.out.println("Inventory is Full.");
                    }
                    break;
                case 2:
                    System.out.println("\nItem\tQuantity");
                    for (int i = 0; i < count; i++) {
                        System.out.println(item[i] + "\t" + qty[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (item[i].equalsIgnoreCase(search)) {
                            System.out.println("Item Found!");
                            System.out.println("Name: " + item[i]);
                            System.out.println("Quantity: " + qty[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item Not Found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}