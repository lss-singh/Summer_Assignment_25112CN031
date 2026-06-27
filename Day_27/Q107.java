import java.util.Scanner;
/* A detailed description about variables and working is already given in Q105 program
KINDLY REFER- EXACTLY SAME PROGRAMS */
class Salary {
    int id;
    String name;
    double basicSalary;
    Salary(int id, String name, double basicSalary) {
        this.id= id;
        this.name= name;
        this.basicSalary= basicSalary;
    }
    void display() {
        System.out.println("Employee ID: "+ id);
        System.out.println("Employee Name: "+ name);
        System.out.println("Basic Salary: "+ basicSalary);
    }
}
public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary[] salary= new Salary[10];
        int count= 0;
        int choice= 0;
        while (choice!=4) { // endless loop untill 4 is triggered; we can also use do-while here 
            System.out.println("\n\tSalary Management System");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    if (count<salary.length) {
                        System.out.print("Enter Employee ID: ");
                        int id= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String name= sc.nextLine();
                        System.out.print("Enter Basic Salary: ");
                        double basicSalary= sc.nextDouble();
                        salary[count]= new Salary(id, name, basicSalary);
                        count++;
                        System.out.println("Salary record added successfully.");
                    } else {
                        System.out.println("Records are full.");
                    }
                    break;
                case 2:
                    if (count== 0) {
                        System.out.println("No salary records found.");
                    } else {
                        for (int i= 0; i< count; i++) {
                            salary[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId= sc.nextInt();
                    boolean found= false;
                    for (int i= 0; i< count; i++) {
                        if (salary[i].id== searchId) {
                            salary[i].display();
                            found= true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}