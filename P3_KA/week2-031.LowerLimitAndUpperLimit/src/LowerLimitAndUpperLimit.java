
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
         int number=0;
        System.out.println("First");
        int firstnumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second");
        int secondnumber = Integer.parseInt(reader.nextLine());
        
        while (firstnumber <= secondnumber){
            System.out.println(firstnumber);
            firstnumber ++;             
        }
    }
}
