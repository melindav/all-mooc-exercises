
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String name_a = reader.nextLine()  ;
    
        System.out.print("Type your age: ");
        int age_a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String name_b = reader.nextLine()  ;
        
           System.out.print("Type your age: ");
        int age_b = Integer.parseInt(reader.nextLine());
        
        int result = age_a + age_b;
        
        System.out.print( name_a + " and " + name_b + " are " + result + " years old in total." );
    }
}
