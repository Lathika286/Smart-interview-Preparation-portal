import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" SMART INTERVIEW PREPARATION PORTAL ");
        System.out.println("====================================");

        Login login = new Login();
        boolean success = login.loginUser();

        if(success) {
            Quiz quiz = new Quiz();
            quiz.startQuiz();
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}
