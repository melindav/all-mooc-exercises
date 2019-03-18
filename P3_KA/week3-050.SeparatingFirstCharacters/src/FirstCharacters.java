import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println("Type your name:");
         String name = reader.nextLine();
          int number= name.length();
          if (number<3) {
              System.out.println();
          }
          else {
          int i=0; 
         for (i=1;i<4;i++){
            
             char characther = name.charAt((i-1)); 
             System.out.println(""+i+". character: "+ characther);
           }
          }
         
    }
}
