import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println("Type your name:");
         String name = reader.nextLine();
          char firstletter=lastCharacter(name);
        System.out.println("First character:"+firstletter);
    }
    public static char lastCharacter(String text){
        int number= text.length();
        char character = text.charAt((number-1));
        return character;
    }
}
