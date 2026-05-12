import java.util.Scanner;

public class Quiz {

    int score = 0;

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== JAVA QUIZ ==========");

        // Question 1
        System.out.println("\n1. Which keyword is used to inherit a class in Java?");
        System.out.println("a) this");
        System.out.println("b) extends");
        System.out.println("c) implements");
  System.out.println("d) super");

        char ans1 = sc.next().charAt(0);

        if(ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is the entry point of Java program?");
        System.out.println("a) start()\n b) run()\n c) main()\n d) init()");

        char ans2 = sc.next().charAt(0);

        if(ans2 == 'c' || ans2 == 'C') {
            score++;
        }

        // Question 3
 System.out.println("\n3. Which package contains Scanner class?");
        System.out.println("a) java.io\n b) java.util\n c) java.awt\n d) java.lang");

        char ans3 = sc.next().charAt(0);

        if(ans3 == 'b' || ans3 == 'B') {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which concept allows multiple methods with same name?");
        System.out.println("a) Encapsulation\n b) Abstraction\n c) Polymorphism\n d) Inheritance");

        char ans4 = sc.next().charAt(0);

        if(ans4 == 'c' || ans4 == 'C') {
            score++;
        }
  // Question 5
        System.out.println("\n5. Which loop is guaranteed to execute at least once?");
        System.out.println("a) for\n b) while\n c) do while\n d) enhanced for");

        char ans5 = sc.next().charAt(0);

        if(ans5 == 'c' || ans5 == 'C') {
            score++;
        }

        displayResult();
    }

    public void displayResult() {

        System.out.println("\n========== RESULT ==========");
        System.out.println("Your Score: " + score + "/5");
 if(score >= 4) {
            System.out.println("Excellent Performance!");
        }
        else if(score >= 2) {
            System.out.println("Good Performance!");
        }
        else {
            System.out.println("Need More Practice!");
        }
    }
}
