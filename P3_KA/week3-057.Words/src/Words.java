import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String input;
        
        while(!(input = reader.nextLine()).isEmpty()){
            System.out.print("Type a word: ");
            words.add(input);  
        }   
           
        System.out.println("You typed the following words:" );
        for(String i : words){
            System.out.println(i);
        }
   
    }
}
