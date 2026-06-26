import java.util.Scanner;
public class Q104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        int answer;
        System.out.println("\t Welcome to the Quiz");
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        answer=sc.nextInt();
        if (answer==2)
            score++;
        System.out.println("\n2. Which language is used for Java programming?");
        System.out.println("1. C");
        System.out.println("2. Python");
        System.out.println("3. Java");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        answer=sc.nextInt();
        if (answer==3)
            score++;
        System.out.println("\n3. 5 + 7 = ?");
        System.out.println("1. 10");
        System.out.println("2. 12");
        System.out.println("3. 14");
        System.out.println("4. 15");
        System.out.print("Enter your answer: ");
        answer=sc.nextInt();
        if (answer==2)
            score++;
        System.out.println("\n4. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Venus");
        System.out.print("Enter your answer: ");
        answer=sc.nextInt();
        if (answer==2)
            score++;
        System.out.println("\n5. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.println("4. static");
        System.out.print("Enter your answer: ");
        answer=sc.nextInt();
        if (answer==2)
            score++;
        System.out.println("\n\tQuiz Completed");
        System.out.println("Your Score: " + score + "/5");
        if (score==5)
            System.out.println("Excellent...");
        else if (score>=3)
            System.out.println("Good Job...");
        else
            System.out.println("Keep Practicing...");
        sc.close();
    }
}