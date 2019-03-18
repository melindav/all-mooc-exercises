
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int firstnumber = Integer.parseInt(reader.nextLine());
    
        System.out.print("Type another number: ");
        int secondnumber = Integer.parseInt(reader.nextLine());
        
        int result = firstnumber + secondnumber;
        
        System.out.print("Sum of the numbers: "+result);
        
    
    }
}
