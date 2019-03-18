
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
         System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        int a = 2;
        double b = Math.PI;
    
        
        double circumference = a * b * (double)radius;
        
        System.out.print("Circumference of the circle: " + circumference);
    }
}
