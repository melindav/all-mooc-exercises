
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while(true){
        System.out.print("Type your password: ");
        String pass_word = reader.nextLine()  ;
        
        if ( !(pass_word.equals("carrot"))){
         System.out.print("wrong!");
         
        }
        else {
         System.out.print("Right!");
         break;
    }
    }
        System.out.print("The secret is: jryy qbar!");
}
}
