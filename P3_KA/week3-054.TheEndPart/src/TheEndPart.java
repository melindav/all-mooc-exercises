import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.print("Type a word:");
         String word = reader.nextLine();
         System.out.print("Length of the end part:"); 
         int lenght = Integer.parseInt(reader.nextLine());
         int number= word.length();
        
      System.out.print("Result:");
     System.out.println(word.substring(number-lenght));
    }
}
