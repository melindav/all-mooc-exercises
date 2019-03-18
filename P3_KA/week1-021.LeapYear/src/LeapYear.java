
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if (number%100==0){
                if (number%400==0){
               System.out.print("The year is a leapyear: "); 
                }        
                else System.out.print("The year is not a leapyear: ");
       }
        else if (number%4==0){
            System.out.print("The year is a leapyear: "); 
        }
        else System.out.print("The year is not a leapyear: ");
    }
}
