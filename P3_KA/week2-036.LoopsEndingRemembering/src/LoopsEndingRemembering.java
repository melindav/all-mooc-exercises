import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
          System.out.println("Type numbers");
       int number=0, sum=1, i=0,even=-1,odd=1;
        
        while (!(number==-1)){
              number = Integer.parseInt(reader.nextLine());
              i++;
              sum += number;
              if (number%2==1){
                  odd++;
              }
              else even++;
        }
         System.out.println("Thank you and see you later!");
         System.out.println("The sum is "+sum);
         System.out.println("How many numbers:"+(i-1));
         System.out.println("Average:"+((double)sum/(i-1)));
         System.out.println("Even numbers:"+even);
         System.out.println("odd numbers:"+(odd-1));
         
    }
}
