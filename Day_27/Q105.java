import java.util.*;
// we will be creating Student class in order to store data reducing complicity 
class Student {
    int id;   // global variables
    String name;
    String course;
    Student(int id, String name, String course) { // parmeterised constructor
        this.id=id;   // refers to the current variables. id, name and course habve already been used once globally
        this.name= name;
        this.course= course;
    }
    void display() {
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Course: "+ course);
        System.out.println(" ");
    }
}
public class Q105 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student[] students= new Student[10]; // stores multiple student OBJECTS;
        int count= 0;
        int choice= 0;
        while (choice!= 4) { // inititally choice is 0, so entry allowed always repeatly. however entry also allowed for other numbers (glitch); you cannot exit the program without typing '4'..
        // we can also use do-while here
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    if (count<students.length) { //count check limit= 10;
                        System.out.print("Enter ID: ");
                        int id= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        students[count] = new Student(id, name, course); // creates one student ojbect 
                        count++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Record is full."); // if exceeds the limit
                    }
                    break;
                case 2:
                    if(count== 0) {
                        System.out.println("No student records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId= sc.nextInt();
                    boolean found= false;

                    for (int i= 0; i< count; i++) {
                        if (students[i].id== searchId) {
                            students[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) { // if false remains false
                        System.out.println("Student not found.");
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