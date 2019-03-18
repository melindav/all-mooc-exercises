
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
          
          int sum=0;
        System.out.println("First");
        int firstnumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last");
        int secondnumber = Integer.parseInt(reader.nextLine());
        
        while (firstnumber <= secondnumber){
            
            sum=sum+firstnumber; 
             firstnumber++;
        }
         System.out.print("Sum is "+sum);
    } 
    }
