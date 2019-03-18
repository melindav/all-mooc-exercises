import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=1;
        int prod=1;
        System.out.println("Type a number");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i <= number){
            
            prod=prod*i; 
             i++;
        }
         System.out.print("Sum is "+prod);
    }
}
