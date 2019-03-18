
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your username: ");
        String user_name = reader.nextLine()  ;
        System.out.print("Type your password: ");
        String password = reader.nextLine()  ;
        
        if ((user_name.equals("alex") && password.equals("mightyducks"))||(user_name.equals("emily") && password.equals("cat"))){
         System.out.print( "You are now logged into the system!");
        }
        else {
         System.out.print("Your username or password was invalid!");
        }
    }
}
