
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                 System.out.println("Type your name:");
         String name = reader.nextLine();
          int number= name.length();
         
          int i=0; 
         for (i=1;i<=number;i++){
            
             char characther = name.charAt((i-1)); 
             System.out.println(""+i+". character: "+ characther);
           }
          }
         
    }

