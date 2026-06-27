import java.util.Scanner;
/* A detailed description about variables and working is already given in Q105 program
KINDLY REFER- EXACTLY SAME PROGRAMS */
class Marksheet {
    int rollNo;
    String name;
    int m1, m2, m3;
    int total;
    double percentage;
    char grade;
    Marksheet(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo= rollNo;
        this.name= name;
        this.m1= m1;
        this.m2= m2;
        this.m3= m3;
        total=m1+m2+m3;
        percentage=total/3.0;
        if (percentage>=90)
            grade='A';
        else if (percentage>= 75)
            grade='B';
        else if (percentage>= 60)
            grade ='C';
        else if (percentage>= 40)
            grade='D';
        else
            grade='F';
    }
    void display() {
        System.out.println("Roll No: " +rollNo);
        System.out.println("Name: " +name);
        System.out.println("Marks: " +m1+", "+m2+", "+m3);
        System.out.println("Total: " +total);
        System.out.println("Percentage: " +percentage);
        System.out.println("Grade: " +grade);
        System.out.println("--------------------------");
    }
}
public class Q108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Marksheet[] students= new Marksheet[10];
        int count= 0;
        int choice= 0;
        while (choice!=4) {
            System.out.println("\n\tMarksheet Generation System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch(choice) {
                case 1:
                    if (count<students.length) {
                        System.out.print("Enter Roll No: ");
                        int rollNo=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name= sc.nextLine();
                        System.out.print("Enter Marks in Subject 1: ");
                        int m1= sc.nextInt();
                        System.out.print("Enter Marks in Subject 2: ");
                        int m2= sc.nextInt();
                        System.out.print("Enter Marks in Subject 3: ");
                        int m3= sc.nextInt();
                        students[count]=new Marksheet(rollNo, name, m1, m2, m3);
                        count++;
                        System.out.println("Marksheet generated successfully.");
                    } else {
                        System.out.println("Records are full.");
                    }
                    break;
                case 2:
                    if (count==0) {
                        System.out.println("No records found.");
                    } else {
                        for (int i=0; i<count; i++) {
                            students[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll= sc.nextInt();
                    boolean found= false;
                    for (int i=0; i<count; i++) {
                        if (students[i].rollNo==searchRoll) {
                            students[i].display();
                            found= true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}