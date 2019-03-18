import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private String password="";
    private int length;
    private Random random = new Random();
    private int value;
   

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.value = this.random.nextInt(26);
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for(int i=0; i < this.length; i++){
           this.value = this.random.nextInt(26);
           password += "abcdefghijklmnopqrstuvwxyz".charAt(this.value);         
        }
        return password;
        
    }
}
