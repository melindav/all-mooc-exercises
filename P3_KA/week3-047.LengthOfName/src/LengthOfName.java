
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name:");
         String name = reader.nextLine();
        int number=calculateCharacters(name);
        System.out.println("Number of characters:"+number);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text){
        return text.length();
    }
}
