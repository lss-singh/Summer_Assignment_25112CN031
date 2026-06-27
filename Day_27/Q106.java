import java.util.Scanner;
/* A detailed description about variables and working is already given in Q105 program
KINDLY REFER- EXACTLY SAME PROGRAMS */
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id= id;
        this.name= name;
        this.salary= salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " +name);
        System.out.println("Salary: " +salary);
    }
}
public class Q106 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee[] employees= new Employee[10];
        int count=0;
        int choice=0;
        while (choice!= 4) {
            System.out.println("\n\tEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    if (count<employees.length) {
                        System.out.print("Enter Employee ID: ");
                        int id= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String name= sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary= sc.nextDouble();
                        employees[count] = new Employee(id, name, salary);
                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee record is full.");
                    }
                    break;
                case 2:
                    if (count== 0) {
                        System.out.println("No employee records found.");
                    } else {
                        for (int i= 0; i< count; i++) {
                            employees[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId= sc.nextInt();
                    boolean found= false;
                    for (int i= 0; i< count; i++) {
                        if(employees[i].id== searchId) {
                            employees[i].display();
                            found= true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}