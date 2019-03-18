import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum =0;
        for (Integer number: list){
            sum=sum+number;  
        }
        return sum;
       
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double ave=0;
        int number=list.size();
        ave=sum(list)/(double)number;
        return ave;
      
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        int number=list.size();
        double average=average(list);
        double square=0;
        for(Integer item:list){
         square=square+Math.pow( (item-average),2);
        }
        return (square)/(number-1);
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
