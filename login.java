import java.util.Scanner;

public class Login {

    private String username = "admin";
    private String password = "1234";

    public boolean loginUser() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals(username) && pass.equals(password)) {
            System.out.println("\nLogin Successful\n");
            return true;
          } else {
            System.out.println("\nInvalid Username or Password\n");
            return false;
        }
    }
}
