
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();     
        
        while (true){
            System.out.println("name: ");
            String input=reader.nextLine();
            if(input.length() == 0){
                break;
            }
            System.out.println("student number: ");
            String input2 = reader.nextLine();
            
            list.add(new Student(input, input2));
        }
        
        for(Student i : list){
            System.out.println(i.toString());
        }
        System.out.println("Give search term: ");
        String input3 = reader.nextLine();
        
        for(Student i : list){
            if(i.getName().contains(input3)){
                System.out.println("Result:"+i.toString());
            }
        }
    }
}