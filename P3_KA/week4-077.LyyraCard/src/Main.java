
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
       // System.out.println(card);
        
        cardBrian.payEconomical();
        //System.out.println(card);

        cardPekka.payGourmet();
       // card.payEconomical();
        System.out.println("Pekka: "+cardPekka);
        System.out.println("Brian: "+cardBrian);
        // card.payGourmet();
       // card.payEconomical();
         cardPekka.loadMoney(20);
         cardBrian.payGourmet();
        System.out.println("Pekka: "+cardPekka);
        System.out.println("Brian: "+cardBrian);
         
       cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: "+cardPekka);
        System.out.println("Brian: "+cardBrian);
      
        /*card.loadMoney(50);
        System.out.println(card);
         card.loadMoney(15);
        System.out.println(card);
        card.loadMoney(200);
        System.out.println(card);
        System.out.println(card);*/
        
        
    }
    
    
    }
    

