
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
          int i=0;
          int sum=0;
        System.out.println("Until what?");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i <= number){
            
            sum=sum+i; 
             i++;
        }
         System.out.print("Sum is "+sum);
    }
}
