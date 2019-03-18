import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                    System.out.print("Type your name:");
         String name = reader.nextLine();
          int number= name.length();
         System.out.print("In reverse order: " );
          int i=0;
         for (i=1;i<=number;i++){
            
          char characther = name.charAt((number-i)); 
             System.out.print(characther);
           }
         
    }
}
